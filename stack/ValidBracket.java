package stack;

import java.util.Stack;

public class ValidBracket {

  public static boolean isValid(String str) {
    Stack <Character> stack = new Stack<>();

    for (int i = 0; i < str.length(); i++) {
      Character curr = str.charAt(i);
      System.out.println(curr);

      if (curr == '(' || curr == '{' || curr == '[') {
        stack.push(curr);
        System.out.println("push " + curr);
      } else {
        if (stack.isEmpty()) {
          return false;
        }
        // "()"
        if ((curr == ')' && stack.peek() == '(') || (curr == '}' && stack.peek() == '{')
            || (curr == ']' && stack.peek() == '[')) {
          stack.pop();
        } else {
          return false;
        }

      }

    }

    if (!stack.isEmpty()) {
      return false;
    }
    return true;

  }

  public static boolean checkDuplicate(String string) {
    Stack<Character> stack = new Stack<>();
    for (int i = 0; i < string.length(); i++) {
      
      Character curr = string.charAt(i);

      if (curr == ')' || curr == '}' || curr == ']') {
        if (stack.isEmpty()) {
          return false;
        }

        int count = 0;
        System.out.println(count);
        System.out.println(stack);

        while (!stack.isEmpty() && !((curr == ')' && stack.peek() == '(') || (curr == '}' && stack.peek() == '{')
            || (curr == ']' && stack.peek() == '['))) {
           stack.pop();
           count++;
           System.out.println(count);
           System.out.println(stack);
        }
        
        if ((curr == ')' && stack.peek() == '(') || (curr == '}' && stack.peek() == '{')
            || (curr == ']' && stack.peek() == '[')) {
          stack.pop();
        }

        if (count <= 0) {
         
          return false;
        }

      } else {
        stack.push(curr);
      }

    }

    if(!stack.isEmpty()){
      return false;
    }

    return true;
  }

  public static void main(String[] args) {
    String str = "((a)f)";
    System.out.println(checkDuplicate(str));

  }
}
