package recursion.revision;

public class Palindrome {

  public static int reverseTheNumber(int n, int reverse) {
    if (n == 0) {
      return reverse;
    }
    reverse = reverse * 10 + n % 10;
    return reverseTheNumber(n / 10, reverse);
  }

  public static void checkPalindrome(int n) {
    if (n == reverseTheNumber(n, 0)) {
      System.out.println("yes it is palindrome number");
      return;
    }

    System.out.println("no number is not palindrome ❌");
  }

  public static void main(String[] args) {
    System.out.println("this is the final string ");
    checkPalindrome(424);
  }
}
