package recursion.easy_question.numberQuestion;

public class PalindromeIndex {
  static void checkPalindrome(int number) {
    String strNumber = String.valueOf(number);
    int start = 0;
    int end = strNumber.length() - 1;

    if (helper(strNumber, start, end)) {
      System.out.println("palindrome number");
    } else {
      System.out.println("not Palindrome");
    }

    helper(strNumber, start, end);
  }

  private static boolean helper(String strNumber, int start, int end) {
    if (start == end) {
      return true;
    }

    if (!String.valueOf(strNumber.charAt(start)).equals(String.valueOf(strNumber.charAt(end)))) {
      return false;
    }
    return helper(strNumber, ++start, --end);
  }

  public static void main(String[] args) {
   checkPalindrome(123454321);
  }
}
