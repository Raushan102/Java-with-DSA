package recursion.easy_question;

import recursion.assignment.number_in_to_english;

public class Armstrong {
  static int numberLength = 0;

  // main function to check weather function in Armstrong or not
  
  static void checkArmestrong(int n) {
    if (n == helper(n)) {
      System.out.println("Armstrong number ");
    } else {
      System.out.println("not Armstrong");
    }
  }

  // helper function for find the Armstrong number

  static int helper(int n) {
    if (n == 0) {
      return 0;
    }
    if (numberLength == 0) {
      // numberLength = String.valueOf(n).length(); first way to find the length of
      // the number
      numberLength = (int) (Math.log10(n)) + 1; // second way to find the length of the number by mathematic formula
    }

    return (int) Math.pow((double) n % 10, (double) numberLength) + helper(n / 10);
  }

  static void h(int n) {
    System.out.println((int) (Math.log10(n)) + 1);
  }

  public static void main(String[] args) {
    System.out.println("hello i  am raushan kumar saw");
    checkArmestrong(153);
    h(3454);
  }
}
