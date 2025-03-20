package queue;

import javax.management.Query;

public class ConstructQueueWithArray {
  static class Queue {
    int arr[];
    int size;
    int real;

    Queue(int n) {
      arr = new int[n];
      size = n - 1;
      real = -1;

    }

    public boolean isEmpty() {
      return real == -1;
    }

    // add element
    public void add(int data) {
      if (real == size) {
        System.out.println("queue is full");
        return;
      }
      real += 1;
      arr[real] = data;
    }
    // remove element

    public int remove() {
      if (isEmpty()) {
        System.out.println("queue is empty");
        return -1;
      }

      int front = arr[0];

      for (int i = 0; i < real; i++) {
        arr[i] = arr[i + 1];
      }
      real -= 1;
      return front;
    }

    // peek
    public int peek() {
      if (isEmpty()) {
        System.out.println("queue is empty");
        return -1;
      }
      int front = arr[0];
      return front;

    }

    // print the queue

    public void print() {

      while (!isEmpty()) {
        System.out.println(peek());
        remove();
      }
    }

  }

  public static void main(String[] args) {
    Queue q1 = new Queue(5);
    q1.add(1);
    q1.add(2);
    q1.add(3);
    q1.add(4);
    q1.add(5);
    q1.add(6);
    System.out.println("peek element" + q1.peek());
    System.out.println("removed element" + q1.remove());
    q1.print();
  }
}
