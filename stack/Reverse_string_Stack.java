package stack;

import java.util.*;
import java.util.Stack;

public class Reverse_string_Stack {

  public static String reverseStack(Stack<Character> ss, StringBuffer st) {

    if (ss.isEmpty()) {
      return "";
    }

    st.append(ss.pop());
    reverseStack(ss, st);

    return String.valueOf(st);

  }

  public static void main(String[] args) {
    Stack<Character> ss = new Stack<>();

    String str = "raushan";
    int i = 0;
    while (i != str.length()) {
      ss.push(str.charAt(i));
      i++;
    }
    System.out.println(ss);
    StringBuffer st = new StringBuffer();
    System.out.println(str);
    System.out.println(reverseStack(ss, st));
  }
}
