package linkedList;

public class Test {

  public class Node {
    int data;
    Node next;

    Node(int data) {
      this.data = data;
      this.next = null;
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
    head = newNode;
  }

  public void insertLast(int data) {
    Node newNode = new Node(data);
    if (head == null) {
      head = tail = newNode;
      return;
    }
    tail.next = newNode;
    tail = newNode;

  }

  public int deleteFirst() {
    if (head == null) {
      System.out.println("LL is null");
      return Integer.MAX_VALUE;
    } else if (head.next == null) {
      tail = head = null;
      return Integer.MAX_VALUE;
    }
    int val = head.data;
    head = head.next;

    return val;
  }
  // delete

  public int deleteLast() {
    if (head == null) {
      System.out.println("LL is null");
      return Integer.MIN_VALUE;
    } else if (head.next == null) {
      tail = head = null;
      return Integer.MAX_VALUE;
    }

    Node temp = head;
    while (temp.next.next != null) {
      temp = temp.next;
    }

    int val = temp.next.data;
    temp.next = null;
    tail = temp;
    return val;

  }

  // insert in the middle

  public void insertMiddle(int index, int data) {
    Node newNode = new Node(data);
    if (head == null) {
      tail = head = newNode;
      return;
    }
    Node temp = head;
    int i = 0;

    while (i != index - 1) {
      temp = temp.next;
      i++;
    }
    newNode.next = temp.next;
    temp.next = newNode;

  }
  // print the linked list

  public void printLinkedList() {
    if (head == null) {
      System.out.println("LL is null");
      return;
    }

    Node temp = head;
    while (temp != null) {
      System.out.print(temp.data + "=>");
      temp = temp.next;
    }
    System.out.println("null");
  }

  // search

  public int search(int key) {
    if (head == null) {
      System.out.println("LL is empty");
      return Integer.MAX_VALUE;

    }
    Node temp = head;
    int i = 0;
    while (temp != null) {
      if (temp.data == key) {
        return i;
      }
      temp = temp.next;
      i++;
    }

    return -1;
  }

  // search using recursion

  public int recursionSearch(int key, Node temp, int i) {
    if (temp == null) {
      return -1;
    } else if (temp.data == key) {
      return i;
    }
    int index = recursionSearch(key, temp.next, i + 1);
    if (index > 0) {
      return index;
    }

    return -1;
  }

  // reverse the number

  public void reverseLinkedList() {
    Node previous = null;
    Node current = tail = head;
    Node nextNode = null;

    while (current != null) {
      nextNode = current.next;
      current.next = previous;
      previous = current;
      current = nextNode;

    }

    head = previous;

  }
  // linked list

  public int deleteFromN_Index(int index) {
    int size = 0;
    Node temp = head;
    // calculate size
    while (temp != null) {
      temp = temp.next;
      size++;
    }
    // invalid index
    if (index > size) {
      System.out.println("Node not present in the LL");
      return -1;
    }

    // delete head node
    if (size == index) {
      int val = head.data;
      head = head.next;
      return val;
    }

    // calculate the index from start

    int ActualIndex = size - index;
    int j = 0;
    Node temp1 = head;
    // travel to index node - 1
    while (j < ActualIndex - 1) {
      temp1 = temp1.next;
      j++;
    }

    // store value that is going to be deleted
    int val = temp1.next.data;
    // check corner case where delete node is tail
    if (temp1.next.next == null) {
      temp1.next = null;
      tail = temp1;
      return val;
    }

    // delete node
    temp1.next = temp1.next.next;

    return val;

  }

  public static void main(String args[]) {
    Test t1 = new Test();
    t1.addFirst(1);
    t1.addFirst(2);
    t1.addFirst(3);
    t1.insertLast(23);
    t1.insertLast(276);
    t1.insertMiddle(2, 123);
    System.out.println(t1.recursionSearch(123, head, 0));
    t1.printLinkedList();
    t1.reverseLinkedList();
    t1.printLinkedList();
    t1.deleteFromN_Index(6);
    t1.printLinkedList();
  }

}
