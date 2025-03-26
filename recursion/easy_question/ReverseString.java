package recursion.easy_question;

public class ReverseString {
  static void reverseTheArray(char[] ch) {
    int start = 0;
    int end = ch.length - 1;
    System.out.print("[");
    char[] c = helper(ch, start, end);
    for (int i = 0; i < c.length; i++) {
      System.out.print(ch[i]);
      if (!(i == c.length - 1)) {
        System.out.print(",");
      }
    }

    System.out.println("]");

  }

  static char[] helper(char[] ch, int start, int end) {
    if (start == end) {
      return ch;
    }

    char temp = ch[start];
    ch[start] = ch[end];
    ch[end] = temp;
    return helper(ch, ++start, --end);
  }

  public static void main(String[] args) {
    char[] ch = { 'h', 'e', 'l', 'l', 'o' };
    reverseTheArray(ch);
  }
}
