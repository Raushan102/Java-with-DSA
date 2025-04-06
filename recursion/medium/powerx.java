package recursion.medium;

public class powerx {

  public static int calculatePower(int x, int power) {
    if (power == 0) {
      return 1;
    }

    int halfPower = calculatePower(x, power / 2);
    int fullPower = halfPower * halfPower;

    if (power % 2 != 0) {
      fullPower = fullPower * x;
    }
    return fullPower;

  }

  public static void main(String[] args) {
    System.out.println(calculatePower(2, 3));
  }
}
