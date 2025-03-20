package other;
public class WavePAttern {
  public static void main(String[] args) {
    int h = 4;
    int w = 6;
    for (int i = 1; i <= h; i++) {
      fristStar: for (int j = 1; j <= w; j++) {

        if (i % 2 == 0) {

          if (j % 2 == 0) {
            System.out.print("*");
          } else {

            System.out.print(".");

          }

        } else {

          if (j % 2 == 0) {
            System.out.print(".");
          } else {

            System.out.print("*");
          }
        }

      }

      System.out.println();
    }
  }
}
