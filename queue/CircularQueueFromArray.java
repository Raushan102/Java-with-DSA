package queue;

public class CircularQueueFromArray {

  static class CircularQueue {
    int arr[];
    int rear;
    int front;
    int size;

    CircularQueue(int n) {
      arr = new int[n];
      rear = front = -1;
      size = n;

    }

    // is empty
    public boolean isEmpty() {
      return rear == -1 && front == -1;
    }

    // add
    public void add(int data) {
      if ((rear + 1) % size == front) {
        System.out.println("queue is full");
      }
      // first time a element add in queue
      if (rear == -1) {
        front = 0;
      }
      rear = (rear + 1) % size;
      arr[rear] = data;

    }

    // remove element

    public int remove() {
      if (isEmpty()) {
        System.out.println("queue is empty");
        return -1;
      }
      // last element delete
      if (rear == front) {
        int result = arr[front];
        front = rear = -1;
        return result;
      }

      int result = arr[front];
      front = (front + 1) % size;
      return result;
    }

    // peek

    public int peek() {
      if (isEmpty()) {
        System.out.println("queue is empty");
        return -1;
      }

      int result = arr[front];
      return result;
    }

    // print
    public void print() {
      if (isEmpty()) {
        System.out.println("queue is empty");

      }

      while (!isEmpty()) {
        System.out.print(peek() + " ");
        remove();
      }

    }

  }

  public static void main(String[] args) {
    CircularQueue c1 = new CircularQueue(3);
    c1.add(1);
    c1.add(2);
    c1.add(3);
    System.out.println(c1.remove());
    c1.add(4);
    System.out.println(c1.remove());
    c1.add(5);
    c1.print();

  }
}
