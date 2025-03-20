package recursion.assignment;
import java.util.*;

public class number_in_to_english {
  public static void convertNumberToString(int n) {
    if (n <= 0) {
      return;
    }
    String[] strArray = { "zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine" };

    convertNumberToString(n / 10);
    int number = n % 10;
    System.out.print(strArray[number] + " ");
  }

  public static void main(String[] args) {


    Scanner sc=new Scanner(System.in);
    System.out.println("please inter the number and last integer must be non-zero");
    int n =sc.nextInt();
    if (n % 10 == 0) {
      System.out.println("please inter number that last element must be non-zero integer");
    } else {
      convertNumberToString(n);
    }
    sc.close();
  }

}
