package linkedList;

import java.security.PublicKey;

public class PelindromeLL {

  public class Node {

    int data;
    Node next;

    Node(int data) {
      this.data = data;
      next = null;
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

  public void printLL() {
    Node temp = head;
    while (temp != null) {
      System.out.print(temp.data + "=>");
      temp = temp.next;
    }
    System.out.println("null");
  }

  public Node FindMiddleNode() {
    Node slow = head;
    Node fast = head;

    while (fast.next != null && fast != null) {
      slow = slow.next;
      fast = fast.next.next;
    }
    return slow;
  }

  public boolean checkPalindrome() {
 System.out.println("function called");
    // corner case
    if (head.next == null || head == null) {
      return true;
    }
    // find middle element
    Node middleNode = FindMiddleNode();

    Node previous = null;
    Node current = middleNode;
    Node nextNode = null;
    // reverse the node after the middle node
    while (current != null) {
      nextNode = current.next;
      current.next = previous;
      previous = current;
      current = nextNode;

    }

    // check weather LL is palindrome or not
    Node rightHead = previous;
    Node leftHead = head;
    while (rightHead != null) {
      if (rightHead.data != leftHead.data) {
        return false;
      }
      leftHead=leftHead.next;
      rightHead=rightHead.next;
    }

    return true;
  }

  public static void main(String[] args) {
    PelindromeLL p = new PelindromeLL();
    p.addFirst(1);
    p.addFirst(2);
    p.addFirst(1);
    // p.addFirst(2);
    // p.addFirst(9);
    System.out.println(p.FindMiddleNode().data);
    System.out.println(p.checkPalindrome());
    p.printLL();
  }
}
