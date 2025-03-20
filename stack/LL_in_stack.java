package stack;

import java.util.*;

public class LL_in_stack {
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

  public boolean isEmpty() {
    return head == null;
  }

  public void push(int data) {
    Node newNode = new Node(data);
    if (isEmpty()) {
      head = tail = newNode;
      return;
    }
    newNode.next = head;
    head = newNode;
  }

  public int pop() {
    if (isEmpty()) {
      System.out.println("stack is empty");
    }

    int val = head.data;
    head = head.next;
    return val;
  }

  public int peek() {
    if (isEmpty()) {
      System.out.println("stack is empty");
    }
    int val = head.data;
    return val;

  }

  // @Override

  // public String toString() {
  // StringBuilder ss = new StringBuilder();

  // if (isEmpty()) {
  // ss.append("[]");
  // String str = String.valueOf(ss);
  // return str;
  // }

  // Node temp = head;
  // ss.append("[");
  // while (temp != null) {
  // ss.append(temp.data);
  // ss.append(",");
  // }

  // ss.append("]");

  // String str = String.valueOf(ss);
  // return str;
  // }

  public static void main(String[] args) {
    LL_in_stack stack = new LL_in_stack();

    stack.push(1);
    stack.push(2);
    stack.push(3);

    System.out.println(stack.pop());
    System.out.println(stack.peek());
    System.out.println(stack.isEmpty());

  }

}
