package test;

import java.util.*;

public class SumOfDigit {
  public static int findSum(int number) {
    if (number == 0) {
      return 0;
    }    
    return number % 10 + findSum(number/10);
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("enter the number ");
    int number = sc.nextInt();
    sc.close();
    int sum = findSum(number);
    System.out.println("sum of the number is = " + sum);
  }

}
