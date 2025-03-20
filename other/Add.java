
import java.util.Scanner;
import java.lang.Math;
public class Add {
  // Define the add method at the class level
  public static boolean add(int number) {
    int preserveNumber = number;
    int some = 0;
    int t=(int) Math.log10(number)+1;
    while (number != 0) {
      int r = number % 10;

      some = some + (int) Math.pow(r, t);
      System.out.println("some"+some);
      System.out.println(r);
      number = number / 10;
    }

    if (some == preserveNumber) {
      return true;
    }
    System.out.println(some);
    return false;
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println(add(sc.nextInt()));
  }
}
