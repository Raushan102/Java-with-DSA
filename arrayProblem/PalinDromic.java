package arrayProblem;

public class PalinDromic {
  public static void main(String[] args) {
    int count = 1;
    int row = 5;
    for (int i = 1; i <= row; i++) {
      count = i;
      for (int j = 1; j <= 2 * 2 - i; j++) {
        System.out.print(" ");
      }
      for (int k = 1; k <= (2 * i) - 1; k++) {

        if (count == 0) {
          break;
        }

        if (count == 1) {
          for (int f = 1; f <= i; f++) {
            System.out.print(" "+f);
          }
          break;
        }
        System.out.print(" "+count);
        count--;
      }
      System.out.println();
    }
  }
}
