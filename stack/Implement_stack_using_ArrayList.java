package stack;

import java.util.*;

class Stack {
  ArrayList<Integer> list = new ArrayList<>();

  public boolean isEmpty() {
    return list.size() == 0;
  }

  public void push(int data) {
    list.add(data);
  }

  public int pop() {
    if (this.isEmpty()) {
      System.out.println("stack is empty");
      return -1;
    }
    int val = list.get(list.size() - 1);
    list.remove(list.size() - 1);
    return val;
  }

  public int peek() {
    if (this.isEmpty()) {
      System.out.println("stack is empty");
      return -1;
    }
    int val = list.get(list.size() - 1);
    return val;
  }

  public void print() {
    int i = 0;
    while (i != list.size()) {
      System.out.print(list.get(i) + " ");
      i++;
    }
  }

}

public class Implement_stack_using_ArrayList {

  public static void main(String[] args) {
    Stack s = new Stack();
    System.out.println(s.isEmpty());

    s.push(1);
    s.push(3);
    s.push(34);
    System.out.println(s.pop());
    System.out.println(s.peek());

    System.out.println(s.isEmpty());

    s.print();
  }
}
