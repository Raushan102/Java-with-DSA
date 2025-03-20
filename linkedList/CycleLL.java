package linkedList;

public class CycleLL {
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

  // add Node at start

  public void addFirst(int data) {
    Node newNode = new Node(data);
    if (head == null) {
      tail = head = newNode;
      return;
    }

    newNode.next = head;
    head = newNode;
  }

  public boolean checkCycle() {
    Node slow = head;
    Node fast = head;

    while (fast != null && fast.next != null) {
      slow = slow.next;
      fast = fast.next.next;

      if (fast == slow) {
        return true;
      }
    }

    return false;
  }

  // function to create the dummy cycle or loop

  public void makeLoop() {
    tail.next = head.next.next;
  }

  public void print() {
    Node temp = head;
    while (temp != null) {
      System.out.print(temp.data + "=>");
      temp = temp.next;
    }
    System.out.println("null");
  }

  
// cycle removed
  public void removeCycle() {
    Node fast = head;
    Node slow = head;
    boolean cycle = false;

    while (fast != null && fast.next != null) {
      slow = slow.next;
      fast = fast.next.next;
      if (slow == fast) {
        cycle = true;
        break;
      }
    }

    if (cycle == false) {
      return;
    }

    slow = head;
    Node previous = null;
    System.out.println(fast.data);
    System.out.println("we are in the loop");
    while (slow != fast) {
      previous = fast;
      slow = slow.next;
      fast = fast.next;
    }

    previous.next = null;

  }

  public static void main(String[] args) {
    CycleLL c = new CycleLL();
    c.addFirst(1);
    c.addFirst(2);
    c.addFirst(3);
    c.addFirst(4);
    c.addFirst(5);
    c.makeLoop();
    System.out.println(c.checkCycle());
    c.removeCycle();
    c.print();

  }

}
