package arrayProblem;

import java.util.Scanner;

public class ButterFly_pattern {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Note:-\n     please inter row and col same for better butterfly pattern ");
    System.out.println("please inter the Colum");
    int col = sc.nextInt();
    System.out.println("please inter the row");
    int row = sc.nextInt();
    // first part of butterfly : upperSide
    for (int line = 1; line <= row / 2; line++) {
      for (int fStar = 1; fStar <= line; fStar++) {
        System.out.print("*");
      }
      for (int space = 1; space <= col - (2 * line); space++) {
        System.out.print(" ");
      }
      for (int sStar = 1; sStar <= line; sStar++) {
        System.out.print("*");
      }
      System.out.println();
    }
    // second part of the butterfly
    for (int line = row / 2; line >= 1; line--) {
      for (int fStar = 1; fStar <= line; fStar++) {
        System.out.print("*");
      }
      for (int space = 1; space <= col - (2 * line); space++) {
        System.out.print(" ");
      }
      for (int sStar = 1; sStar <= line; sStar++) {
        System.out.print("*");
      }
      System.out.println();
    }
  }
}
