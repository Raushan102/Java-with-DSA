package queue;

import java.util.*;

public class ConstructQueueWithTwoStack {

  // construct a queue using two stack where add enqueue take 0(n) and dequeue and
  // peek operation take 0(1)
  static class Queue {
    Stack<Integer> s1 = new Stack<>();
    Stack<Integer> s2 = new Stack<>();

    // add

    boolean isEmpty() {
      return s1.empty();
    }
    // add

    void add(int data) {
      if (isEmpty()) {
        s1.push(data);
        return;
      }

      while (!s1.empty()) {
        s2.push(s1.pop());
      }

      s1.push(data);

      while (!s2.empty()) {
        s1.push(s2.pop());
      }
    }
    // remove

    int remove() {
      if (isEmpty()) {
        System.out.println("queue isempty");
        return -1;
      }

      int result = s1.pop();
      return result;
    }

    // peek

    int peek() {
      if (isEmpty()) {
        System.out.println("queue isempty");
        return -1;
      }

      int result = s1.peek();
      return result;
    }

  }

  // construct a queue using two stack where add enqueue take 0(1) and dequeue and
  // peek operation take 0(n)

  static class Queue2 {

    Stack<Integer> s1 = new Stack<>();
    Stack<Integer> s2 = new Stack<>();

    // is empty

    boolean isEmpty() {
      return s1.empty();
    }
    // add

    void add(int data) {
      s1.push(data);
    }

    // remove element

    int remove() {
      if (isEmpty()) {
        System.out.println("queue is empty");
        return -1;
      }

      while (!s1.isEmpty()) {
        s2.push(s1.pop());
      }

      int result = s2.pop();
      while (!s2.isEmpty()) {
        s1.push(s2.pop());
      }
      return result;
    }

    // peek element

    int peek() {
      if (isEmpty()) {
        System.out.println("queue is empty");
        return -1;
      }

      while (!s1.isEmpty()) {
        s2.push(s1.pop());
      }

      int result = s2.peek();
      while (!s2.isEmpty()) {
        s1.push(s2.pop());
      }
      return result;
    }
  }

  public static void main(String[] args) {
    Queue2 q1 = new Queue2();
    q1.add(1);
    q1.add(2);
    q1.add(3);
    q1.add(4);
    System.out.println("removed element is = " + q1.remove());

    while (!q1.isEmpty()) {
      System.out.print(q1.peek() + " ");
      q1.remove();
    }
  }

}
