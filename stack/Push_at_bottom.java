package stack;

import java.util.Stack;

public class Push_at_bottom {

  public static void insert_At_bottom(int data, Stack<Integer> s) {
    if (s.empty()) {
      s.push(data);
      return;
    }

    int val = s.pop();
    insert_At_bottom(data, s);
    s.push(val);

  }

  public static void main(String args[]) {
    Stack<Integer> s = new Stack<>();

    s.push(2);
    s.push(3);
    s.push(4);
    s.push(5);
    insert_At_bottom(6, s);
   s.peek();
   System.out.println(s.pop());
   System.out.println(s);
  }
}
