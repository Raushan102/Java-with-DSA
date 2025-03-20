package recursion;

public class BinaryString {
  public static void makeString(int n, int lastFilledString, String str) {
    if (n == 0) {
      System.out.println(str);
      return;
    }

    makeString(n - 1, 0, str + "0");

    if (lastFilledString == 0) {
      makeString(n - 1, 1, str + "1");
    }

  }

  public static void main(String args[]) {
    int n = 3;
    StringBuilder str = new StringBuilder("");
    makeString(n, 0, str.toString());

  }
}
