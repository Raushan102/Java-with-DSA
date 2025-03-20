package linkedList;

public class Wave {
  public class Node {
    int data;
    Node next;

    Node(int data) {
      this.data = data;
      this.next = null;
    }

  }

  public Node head = null;
  public Node tail = null;

  public void addFirst(int data) {
    Node newNode = new Node(data);
    if (head == null) {
      head = tail = newNode;
      return;
    }

    newNode.next = head;
    head = newNode;

  }

  public void printLL(Node head) {
    Node temp = head;

    if (temp == null) {
      System.out.println("linkedList is empty");
      return;
    }

    while (temp != null) {
      System.out.print(temp.data + "=>");
      temp = temp.next;

    }

    System.out.println("null");

  }

  public Node findMiddel(Node head) {

    if (head == null || head.next == null) {
      return head;
    }
    Node slow = head;
    Node fast = head.next;

    while (fast != null && fast.next != null) {
      slow = slow.next;
      fast = fast.next.next;

    }
    return slow;
  }

  public Node reverse(Node head) {

    Node pre = null;
    Node curr = tail = head;
    Node nxt = null;

    while (curr != null) {
      nxt = curr.next;
      curr.next = pre;
      pre = curr;
      curr = nxt;
    }

    head = pre;
    return head;
  }

  public void makeWabe() {
    System.out.println("yes we are in");
    Node mid = findMiddel(head);

    Node rightHead = mid.next;
    mid.next = null;

    printLL(head);
    Node NextHead = reverse(rightHead);
    printLL(NextHead);

    Node left = head;
    Node right = NextHead;
    Node nextL, nextR;

    while (left != null && right != null) {
      nextL = left.next;
      left.next = right;
      nextR = right.next;
      right.next = nextL;

      left = nextL;
      right = nextR;
    }

  }

  public static void main(String[] args) {
    Wave ll = new Wave();
    ll.addFirst(1);
    ll.addFirst(2);
    ll.addFirst(3);
    ll.addFirst(4);
    ll.addFirst(5);
   

    ll.printLL(ll.head);
    ll.makeWabe();
    ll.printLL(ll.head);

  }
}
