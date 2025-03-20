package linkedList;

public class Search {

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

  public void printLinedList() {

    if (head == null) {
      System.out.println("Linked List is empty");
      return;
    }
    Node temp = head;
    while (temp != null) {
      System.out.print(temp.data + "=>");
      temp = temp.next;
    }
   System.out.print(temp);
    return;

  }

  // search in the linkedList

  public int itrSearchData(int key) {
    Node temp = head;
    int i = 0;
    // =========if we have size variable
    // for (int i = 0; i < size; i++) {
    // if (temp.data == key) {
    // return i;
    // }
    // temp=temp.next;
    // }

    // ========if we don't have size variable

    while (temp != null) {
      if (temp.data == key) {
        return i;
      }
      i++;
      temp = temp.next;
    }

    return -1;
  }

  // search in the linked list using recursion

  public int recursionSearch(int key, Node temp) { // O(n)

    if (temp == null) {
      return -1;
    }
    if (temp.data == key) {
      return 0;
    }

    int index = recursionSearch(key, temp.next);

    if (index == -1) {
      return -1;
    }

    return index + 1;
  }

  // reverse the linkedList

  public void reverse() {
    Node prev = null;
    Node curr = tail = head;
    Node next;
    while (curr != null) {
      next = curr.next;
      curr.next = prev;
      prev = curr;
      curr = next;
    }
    head=prev;

  }

  public static void main(String[] args) {
    Search s = new Search();
    s.addFirst(12);
    s.addFirst(13);
    s.addFirst(14);
    s.addFirst(15);

    
    System.out.println();
    System.out.println("size = " + size);
    System.out.println(s.itrSearchData(12));
    System.out.println(s.recursionSearch(13, head));
    s.printLinedList();
    System.out.println();
   s.reverse();
   s.printLinedList();

  }
}
