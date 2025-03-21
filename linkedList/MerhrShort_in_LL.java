package linkedList;

import java.util.LinkedList;

public class MerhrShort_in_LL {

  public class Node {
    int data;
    Node next;

    Node(int data) {
      this.data = data;
      this.next = null;
    }

  }

  public  Node head = null;
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

  public void printLL() {
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

  public  Node findMiddel(Node head) {

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

  public Node mergeLL(Node head1, Node head2) {
    Node tempLL = new Node(-1);
    Node temp = tempLL;

    while (head1 != null && head2 != null) {
      if (head1.data <= head2.data) {
        temp.next = head1;
        head1 = head1.next;
        temp = temp.next;

      } else {
        temp.next = head2;
        head2 = head2.next;
        temp = temp.next;
      }
    }

    while (head1 != null) {
      temp.next = head1;
      head1 = head1.next;
      temp = temp.next;
    }

    while (head2 != null) {
      temp.next = head2;
      head2 = head2.next;
      temp = temp.next;
    }
    return tempLL.next;
  }

  public Node mergeSort(Node head) {

    if(head==null || head.next==null){
      return head;
    }

    Node mid = findMiddel(head);


    Node rightHEAd = mid.next;
    mid.next = null;
    Node leftNode = mergeSort(head);
    Node rightNode = mergeSort(rightHEAd);

    return mergeLL(leftNode, rightNode);

  }

  public static void main(String[] args) {
    MerhrShort_in_LL ll = new MerhrShort_in_LL();

    ll.addFirst(1);
    ll.addFirst(2);
    ll.addFirst(3);
    ll.addFirst(4);
    ll.addFirst(5);
    ll.printLL();
    ll.head = ll.mergeSort(ll.head);
    ll.printLL();

  }
}
