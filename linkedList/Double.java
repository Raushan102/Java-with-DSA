package linkedList;

public class Double {
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
      return;
    }

    newNode.next = head;
    head.previous = newNode;
    head = newNode;
  }

  public static void printDLL() {
    Node temp = head;

    do {
      System.out.print(temp.data + "=>");
      temp = temp.next;
    } while (temp != null);

    System.out.println("null");
  }

  public static void printBackWard() {
    Node temp = tail;

    do {
      System.out.print(temp.data + "=>");
      temp = temp.previous;
    } while (temp != null);

    System.out.println("null");
  }

  public int removeFirst() {

    if (head == null) {
      System.out.println("Linked list is empty");
      return Integer.MAX_VALUE;
    }

    if (head.next == null) {
      int val = head.data;
      head = tail = null;
      return val;
    }

    int val = head.data;
    head = head.next;
    if (head.next == null) {
      tail = head;
    }
    head.previous = null;
    return val;

  }

  public int removeLast() {
    if (tail == null) {
      System.out.println("linked list is empty");
      return Integer.MAX_VALUE;
    }

    if (tail.previous == null) {
      int val = tail.data;
      head = tail = null;
      return val;
    }

    int val = tail.data;
    tail = tail.previous;
    tail.next = null;

    return val;
  }

  public static int getSize() {
    if (head == null) {
      System.out.println("DLL is empty");
      return Integer.MIN_VALUE;
    }

    int i = 0;
    Node temp = head;

    while (temp != null) {
      temp = temp.next;
      i++;
    }

    return i;
  }

  public static int remove_at_index(int index) {
    int i = 0;
    Node temp = head;

    if (head == null) {
      System.out.println("DLL is empty");
      return Integer.MIN_VALUE;
    }

    int size = getSize();

    if (index > size) {
      System.out.println("please inter the valid index index out of boundary");
      return Integer.MIN_VALUE;
    }

    if (index == 0) {
      int val = head.data;
      head = head.next;
      head.previous = null;
      return val;
    }

    if (size == index) {
      int val = tail.data;
      tail = tail.previous;
      tail.next = null;
      return val;
    }

    while (i != index - 1) {
      temp = temp.next;
      i++;
    }
    int val = temp.next.data;
    temp.next.next.previous = temp;
    temp.next = temp.next.next;
    return val;

  }

  public static void reveseDLL() {
    Node current = tail = head;
    Node previous = null;
    Node ntx = null;

    if(head ==null){
      System.out.println("DLL is empty");
      return;
    }

    while (current != null) {
      ntx = current.next;
      current.next = previous;
      current.previous = ntx;
      previous = current;
      current = ntx;

    }

    head = previous;
  }


  

  public static void main(String[] args) {
    Double dLL = new Double();
    dLL.addFirst(1);
    dLL.addFirst(2);
    dLL.addFirst(3);
    dLL.addFirst(4);
    dLL.printDLL();
    System.out.println(head.data);
    System.out.println(tail.data);
    dLL.reveseDLL();
    dLL.printDLL();
    System.out.println(head.data);
    System.out.println(tail.data);
  

  }
}
