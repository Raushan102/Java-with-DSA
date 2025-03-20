package queue;

import java.util.*;

public class StackUsingTwoQueue {

  static class Stack {
    Queue<Integer> q1 = new LinkedList<>();
    Queue<Integer> q2 = new LinkedList<>();

    // check is empty

    boolean empty() {
      return q1.isEmpty();
    }

    // add

    void push(int data) {
      if (empty()) {
        q1.add(data);
        return;
      }

      while (!q1.isEmpty()) {
        q2.add(q1.remove());
      }

      q1.add(data);
      while (!q2.isEmpty()) {
        q1.add(q2.remove());
      }

    }

    // REMOVE

    int pop() {
      if (empty()) {
        System.out.println("stack is empty");
      }
      return q1.remove();
    }

    // peek

    int peek() {
      if (empty()) {
        System.out.println("stack is empty");
      }
      return q1.peek();
    }

  }

  public static void main(String[] args) {
    Stack s1 = new Stack();
    s1.push(1);
    s1.push(2);
    s1.push(3);
    s1.push(4);

    System.out.println("peek element in the stack is = "+s1.peek());

    while (!s1.empty()) {
      System.out.println(s1.peek() + " ");
      s1.pop();
    }
  }

}
