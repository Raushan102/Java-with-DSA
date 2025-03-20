package recursion;

public class FillTiles {
  public static int findWays(int n) {
    if (n == 0 || n == 1) {
      return 1;
    }

    int verticalWays = findWays(n - 1);
    int horizontalWays = findWays(n - 2);

    return verticalWays + horizontalWays;

  }

  public static void main(String args[]) {
    int n = 5;
    System.out.println(findWays(n));
  }
}
