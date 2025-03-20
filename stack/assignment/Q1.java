package stack.assignment;

class Node {
  Character data;
  Node next;

  Node(Character data) {
    this.data = data;
    this.next = null;
  }

}

public class Q1 {
  public static Node head = null;
  public static Node tail = null;

  public void addFirst(Character data) {
    Node newNode = new Node(data);

    if (head == null) {
      head = tail = newNode;
      return;
    }

    newNode.next = head;
    head = newNode;

  }

  public Node findMiddle() {

    Node slow = head;
    Node fast = head.next;

    if (head == null) {
      System.out.println("LL is empty");
      return head;
    }

    if (head.next == null) {
      return head;
    }
    while (fast != null && fast.next != null) {
      slow = slow.next;
      fast = fast.next.next;
    }

    return slow;

  }

  public boolean isPalindrome() {
    if (head == null || head.next == null) {
      return true;
    }
    System.out.println("funcitonn called");
    Node middle = findMiddle();

    Node previous = null;
    Node current = middle;
    Node nextNode = null;

    while (current != null) {
      nextNode = current.next;
      current.next = previous;
      previous = current;
      current = nextNode;
    }

    Node RHead = previous;
    Node temp = head;
    Node RTemp = RHead;

    System.out.println("sfbsdbfdf" + RHead.data);

    while (temp != null && RTemp != null) {
      if (temp.data != RTemp.data) {
        System.out.println(temp.data + " " + RTemp.data);
        return false;
      } else {
        temp = temp.next;
        RTemp = RTemp.next;
      }
    }

    return true;
  }

  public void print() {
    if (head == null) {
      System.out.println("linked list is empty");
      return;
    }
    Node temp = head;

    while (temp != null) {
      System.out.print(temp.data + "=>");
      temp = temp.next;
    }
    System.out.println("null");
  }

  public static void main(String[] args) {
    Q1 LL = new Q1();
    LL.addFirst('A');
    LL.addFirst('B');
    
   
  
    LL.print();
    boolean b = LL.isPalindrome();
    System.out.println(b);
  }

}
