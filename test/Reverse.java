package test;

import java.util.Scanner;

public class Reverse {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int number = sc.nextInt();
    sc.close();
    System.out.println("reverse of  of " + number + "is = " + reverseNumber(number, 0));
  }

  public static int reverseNumber(int number, int reverse) {
    if (number == 0) {
      return reverse;
    }

    int lastDigit = number % 10;
    reverse = reverse * 10 + lastDigit;
    return reverseNumber(number / 10, reverse);

  }

}
