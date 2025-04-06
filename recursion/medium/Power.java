package recursion.medium;

public class Power {
  public static int check(int n, int power) {
    if (power == 1) {
      return n;
    }
    int PowerIs = 2 * check(n, power - 1);
    return PowerIs;
  }

  public static void main(String[] args) {
    int n=2;
    int power=10;
    System.out.println(check(n, power));
  }
}
