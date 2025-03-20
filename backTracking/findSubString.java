package backTracking;

public class findSubString {
  public static void findSubstring(String str, String ans, int i) {
    if (i == str.length()) {
      System.out.println(ans);
      return;
    }

    findSubstring(str, ans + str.charAt(i), i + 1);
    findSubstring(str, ans, i + 1);
  }

  public static void main(String[] args) {
    String str = "abc";
    findSubstring(str, "", 0);
  }
}
