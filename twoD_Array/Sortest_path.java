package twoD_Array;

public class Sortest_path {

  public static void finsDisplacement(String str) {
    int StringLength = str.length() - 1;
    int x2 = 0;
    int y2 = 0;

    for (int i = 0; i <= StringLength; i++) {
      if (str.charAt(i) == 'W') {
        x2--;
      }
      if (str.charAt(i) == 'S') {
        y2--;
      }
      if (str.charAt(i) == 'N') {
        y2++;
      }
      if (str.charAt(i) == 'E') {
        x2++;
      }

    }

    int n = (int) Math.pow(x2 - 0, 2) + (int) Math.pow(y2 - 0, 2);

    double displacement = Math.sqrt(n);
    System.out.println(displacement);

  }

  public static void main(String[] args) {
    String str = "WNEENESENNN";
    finsDisplacement(str);
  }
}
