package recursion;

public class Print_1_to_10 {
  public static void increase(int n) {
    if (n == 1) {
      System.out.print(n + " ");
      return;
    }
    increase(n - 1);
    System.out.print(n + " ");
  }

  public static void main(String[] args) {
    int n = 10;
    increase(n);
  }

}
