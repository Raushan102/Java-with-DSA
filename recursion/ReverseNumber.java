package recursion;

public class ReverseNumber {
  // reverse the number 
  public static int reverseNumber(int number, int reverse) {

    if (number == 0) {
      return reverse;
    } else {
      reverse = reverse * 10 + number % 10;
      return reverseNumber(number / 10, reverse);
    }

  }
  // palindrome the number 

  public static void checkPalindrome(int number) {
    int n = number;
    int reverse = reverseNumber(number, 0);
    if (n == reverse) {
      System.out.println("yes number is palindrome");
    } else {
      System.out.println("no number is not palindrome");
    }
  }

  public static void main(String[] args) {
    int number = 2546;
    int p=343;

    int n = reverseNumber(number, 0);
    checkPalindrome(p);
    System.out.println(n);
  }

}
