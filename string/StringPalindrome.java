package string;

import backTracking.findSubString;

public class StringPalindrome {

  // function to check weather any string in palindrome or not

  public static void pass(String[] str) {
    for (String string : str) {
      check(string);
    }
  }

  public static void check(String str) {
    int start = 0;
    int end = str.length() - 1;

    while (start < end) {
      if (str.charAt(start) != str.charAt(end)) {
        System.out.println(str + "  is not palindrome ❌");
        return;
      }

      start++;
      end--;
    }
    System.out.println(str + "  is palindrome 👍");

  }

  public static void main(String[] args) {

    String[] words = { "madam", "hello", "racecar", "java", "level", "world", "noon", "openai" };
    pass(words);
  }
}
