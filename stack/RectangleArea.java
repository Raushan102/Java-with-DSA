package stack;

import java.util.Stack;

public class RectangleArea {

  public static int MaxAreaOfRectangle(int arr[]) {
    int maxArea = Integer.MIN_VALUE;

    int[] MRV = new int[arr.length];
    int[] MLV = new int[arr.length];
    int n = arr.length;
    Stack<Integer> s = new Stack<>();

    for (int i = n - 1; i >= 0; i--) {
      // right smallest val
      while (!s.isEmpty() && arr[s.peek()] >= arr[i]) {
        s.pop();
      }
      if (s.empty()) {
        MRV[i] = n;
      } else {
        MRV[i] = s.peek();
      }

      s.push(i);

    }

    Stack<Integer> k = new Stack<>();
    for (int i = 0; i < n; i++) {
      // left smalllest value
      while (!k.isEmpty() && arr[k.peek()] >= arr[i]) {
        k.pop();
      }

      if (k.isEmpty()) {
        System.out.println(arr[i]);
        MLV[i] = -1;
      } else {
        MLV[i] = k.peek();
      }

      k.push(i);
    }

    for (int i = 0; i < n; i++) {

      int height = arr[i];
      int width = MRV[i] - MLV[i] - 1;
      int currentArea = height * width;
      maxArea = Math.max(maxArea, currentArea);

    }

    return maxArea;

  }

  public static void main(String[] args) {
    int arr[] = { 2, 1, 5, 6, 2, 3 };
    System.out.println(MaxAreaOfRectangle(arr));
  }
}
