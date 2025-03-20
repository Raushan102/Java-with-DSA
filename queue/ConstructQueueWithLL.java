package queue;

public class ConstructQueueWithLL {

  public static class Queue {
    static class Node {
      int data;
      Node next;

      Node(int data) {
        this.data = data;
        this.next = null;
      }

    }

    public static Node head = null;
    public static Node tail = null;

    public boolean isEmpty() {
      return head == null && tail == null;
    }

    // add

    public void add(int data) {
      Node newNode = new Node(data);
      if (isEmpty()) {
        head = tail = newNode;
        return;
      }

      tail.next = newNode;
      tail = newNode;

    }

    // remove
    public int remove() {
      if (isEmpty()) {
        System.out.println("queue is empty");
        return -1;
      }

      if (head == tail) {
        int result = head.data;
        head = tail = null;
        return result;
      }

      int result = head.data;
      head = head.next;
      return result;
    }

    // peek

    public int peek() {
      if (isEmpty()) {
        System.out.println("queue is empty");
        return -1;
      }

      int result = head.data;
      return result;

    }

    // print

    public void print() {
      Node tempHead = head;

      while (tempHead != null) {
        System.out.print(tempHead.data + " ");
        tempHead = tempHead.next;
      }

    }

    // print with remove element

    public void printWithRemove(){
      while(!isEmpty()){
        System.out.print(head.data+" ");
        remove();
      }
    }
  

  }

  public static void main(String[] args) {
     Queue q1=new Queue();
     q1.add(1);
     q1.add(2);
     q1.add(3);
     q1.add(4);
     System.out.println("removed element is = "+q1.remove());
     
     
     q1.printWithRemove();
  }
}
