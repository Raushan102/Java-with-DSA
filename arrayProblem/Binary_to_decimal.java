package arrayProblem;

import java.math.*;

public class Binary_to_decimal {
  public static void main(String[] args) {

    int n = 10000;
    int pow = 0;
    int decimal = 0;

    while (n > 0) {
      int r = n % 10;
      int power = (int) Math.pow(2, pow);
      decimal = decimal + (r * power);
      n = n / 10;
      pow++;

    }
    System.out.println(decimal);

  }

}
