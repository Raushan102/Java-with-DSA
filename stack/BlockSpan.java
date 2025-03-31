package stack;

import java.util.Stack;

public class BlockSpan {

  public static void stockSpan(int stack[], int span[]) {
    Stack<Integer> stk = new Stack<>();
    span[0] = 1;
    stk.push(0);

    for (int i = 1; i < span.length; i++) {
      int currPrice = stack[i];

      while (!stk.isEmpty() && currPrice > stack[stk.peek()]) {
        stk.pop();
      }

      if (stk.isEmpty()) {
        span[i] = i + 1;
      } else {
        int c = stk.peek();
        span[i] = i - c;
      }

      stk.push(i);
    }

  }

  public static void main(String[] args) {
    int stack[] = { 100, 80, 60, 70, 60, 85, 100 };

    int span[] = new int[stack.length];

    stockSpan(stack, span);

    for (int i = 0; i < span.length; i++) {
      System.out.print(span[i] + " ");
    }

  }
}
