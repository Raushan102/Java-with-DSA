package stack;

import java.util.Stack;

public class NestedGreater {
  public static void main(String[] args) {

    Stack<Integer> stack = new Stack<>();
    int arr[] = { 6, 8, 0, 1, 3 };
    int greaterArr[] = new int[arr.length];

    for (int i = arr.length - 1; i >= 0; i--) {

      int currElement = arr[i];
      while (!stack.isEmpty() && currElement > arr[stack.peek()]) {
        stack.pop();
      }

      if (stack.isEmpty()) {
        greaterArr[i] = -1;
      } else {
        greaterArr[i] = arr[stack.peek()];
      }

      stack.push(i);

    }

    for (int i : greaterArr) {
      System.out.print(i + " ");
    }

  }

}
