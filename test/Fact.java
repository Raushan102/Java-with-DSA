package test;

import java.util.Scanner;

public class Fact {

 
  public static void main(String[] args) {
  Scanner sc=new Scanner(System.in);
  int number = sc.nextInt();
  sc.close();
  System.out.println("factorial of " + number + "is = "+findFact(number));
  }

  public static int findFact(int number) {
    if (number == 1) {
      return 1;
    }

    return number * findFact(number - 1);
  }

}
