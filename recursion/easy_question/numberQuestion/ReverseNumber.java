package recursion.easy_question.numberQuestion;

public class ReverseNumber {
  // reverse the number

  // helper function for reverse number 



  public static int reverseNumber(int number) {
    if(number==0){
      return 0;
    }
    int digit = (int) (Math.log10(number)) + 1;
    int n = helper(number, digit);  
    return n;

  }
  
  static int helper(int number, int digit) {
    if (number % 10 == number) {
      return number;
    } else {
      return number % 10 * (int) Math.pow(10, digit - 1) + helper(number / 10, digit);
    }
  }
  // palindrome the number

  public static void checkPalindrome(int number) {
    int n = number;
    int reverse = reverseNumber(number);
    if (n == reverse) {
      System.out.println("yes number is palindrome");
    } else {
      System.out.println("no number is not palindrome");
    }
  }

  public static void main(String[] args) {
    int number = 2546;
    int p = 343;

    int n = reverseNumber(number);
    // checkPalindrome(p);
    System.out.println(n);
  }

}
