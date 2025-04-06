package recursion.easy_question.stringQuestion;

public class AubString {
  public static void printsubString(String str, int k, int j, String newStr) {
    System.out.print("(");
    if (k == j) {
      System.out.print(str.charAt(k));
      System.out.print(")");
      return;
    }

    System.out.print(str.charAt(k));
    printsubString(str, k + 1, j, newStr);

  }

  public static void calculate(String str, int i, int j, String newStr) {
    int StringLength = str.length();
    if (i == StringLength) {
      return;
    }

    if (j == StringLength-1) {
      i++;
      j = i;
      calculate(str, i, j , newStr);
    }

    printsubString(str, i, j + 1, newStr);

  }

  public static void main(String[] args) {
    String str = "abcab";
    String newStr = " ";
    int i = 0;
    int j = 0;

    calculate(str, i, j, newStr);
  }
}
