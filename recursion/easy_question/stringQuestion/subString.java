package recursion.easy_question.stringQuestion;

public class subString {
  static int c = 0;

  public static void printAllSubstring(int k, int j, String str, String newString) {

    if (k > j) {

      if (newString.charAt(0) == newString.charAt(newString.length() - 1)) {
        c++;
      }
      System.out.println(newString);
      return;
    }

    newString += str.charAt(k);

    printAllSubstring(k + 1, j, str, newString);

  }

  public static void print(int i, String str, int j) {

    if (i == str.length()) {
      System.out.println("total string is = "+c);
      return;
    }

    if (j == str.length()) {
      print(i + 1, str, i + 1);
      return;
    }

    printAllSubstring(i, j, str, "");
    print(i, str, j + 1);

  }

  public static void main(String[] args) {
    print(0, "abcab", 0);
  }

}
