package stack;

import java.util.Stack;

public class Revese_element_in_stack {

  public static void InsertAtBottom(int data, Stack<Integer> stack) {
    if (stack.isEmpty()) {
      stack.push(data);
      return;
    }

    int val = stack.pop();
    InsertAtBottom(data, stack);
    stack.push(val);

  }

  public static void reverseStack(Stack<Integer> stack) {
    if (stack.isEmpty()) {
      return;
    }

    int val = stack.pop();
    reverseStack(stack);
    InsertAtBottom(val, stack);
  }

  public static void main(String[] args) {
    Stack<Integer> stack = new Stack<>();
    stack.push(1);
    stack.push(2);
    stack.push(3);
    stack.push(5);
    System.out.println(stack);
    reverseStack(stack);
    System.out.println(stack);
  }
}
