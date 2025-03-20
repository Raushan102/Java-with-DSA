package linkedList;

public class LinkedList {
  public class Node {
    int data;
    Node next;

    Node(int data) {
      this.data = data;
      this.next = null;
    }

  }

  public static Node head, tail;
  public static int size = 0;

  // add node at front

  public void addFirst(int data) {
    Node newNode = new Node(data);
    size++;
    if (head == null) {
      head = tail = newNode;
      return;
    }

    newNode.next = head;
    head = newNode;

  }
  // add node at last

  public void addLast(int data) {
    Node newNode = new Node(data);
    size++;

    if (head == null) {
      head = tail = newNode;
      return;
    }

    tail.next = newNode;
    tail = newNode;

  }
  // print the likedList

  public void printLinedList() {

    if (head == null) {
      System.out.println("Linked List is empty");
      return;
    }
    Node temp = head;
    while (temp.next != null) {
      System.out.print(temp.data + "=>");
      temp = temp.next;
    }
    System.out.print(temp.data);
    return;

  }

  // add node at the middle of the two mode
  public void insertInMiddle(int index, int data) {
    if (head == null) {
      addFirst(data);
      return;
    }
    Node newNode = new Node(data);
    size++;

    Node temp = head;
    int i = 0;

    while (i != index - 1 && temp.next != null) {
      temp = temp.next;
      i++;
    }

    newNode.next = temp.next;
    temp.next = newNode;

  }

  public void removeNodeAtIndex(int index) {

    if (index == 0) {
      head = head.next;
      size--;
      return;
    }
    if (size == 1) {
      size--;
      head = tail = null;
      return;
    }

    if (head == null) {
      System.out.println("linkedList is null");
      return;
    }

    Node temp = head;
    int i = 0;

    while (i != index - 1) {
      temp = temp.next;
      i++;

    }

    if (temp.next.next == null) {
      temp.next = null;
      tail = temp;
      size--;
      return;
    }

    temp.next = temp.next.next;
    size--;

  }

  public static void main(String[] args) {
    LinkedList ll = new LinkedList();
    ll.addFirst(1);
    ll.addFirst(2);
    ll.addFirst(3);
    ll.addLast(5);
    ll.addLast(6);
    ll.insertInMiddle(3, 23);
    ll.removeNodeAtIndex(5);
    ll.printLinedList();
    System.out.println(

    );
    System.out.println("size is = " + size);
    System.out.println("head = " + head.data);
    System.out.println("tail == " + tail.data);
  }
}
