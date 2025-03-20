package linkedList;


import recursion.powerx;

public class CircularDLL {
  public class Node {
    int data;
    Node next;
    Node previous;

    Node(int data) {
      this.data = data;
      this.next = null;
      this.previous = null;
    }
  }

  public static Node head = null;
  public static Node tail = null;

  public void addFirst(int data) {
    Node newNode = new Node(data);

    if (head == null) {
      head = tail = newNode;
      tail.next = head;
      head.previous = tail;
      return;
    }

    newNode.next = head;
    head.previous = newNode;
    head = newNode;
    head.previous = tail;
    tail.next = head;

  }

  public void print() {
    if (head == null) {
      System.out.println("CDLL us empty");
      return;
    }

    Node temp = head;
    while (temp != null) {
      System.out.print(temp.data + "=>");
      if (temp.data == 1) {

        break;
      }
      temp = temp.next;
    }
    System.out.println("null");
  }

  public static void main(String[] args) {

    CircularDLL node = new CircularDLL();
    node.addFirst(1);
    node.addFirst(1);
    node.addFirst(2);
    node.addFirst(3);
    node.addFirst(4);
    node.addFirst(5);
    node.print();

  }

}
