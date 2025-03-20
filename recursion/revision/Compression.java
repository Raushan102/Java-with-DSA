package recursion.revision;

public class Compression {

  public static void compresser(String str, String newString, int i, int count) {
    // Base case: End of string
    if (i == str.length()) {
      System.out.println(newString);
      return;
    }

    // Check if the next character is the same
    if (i < str.length() - 1 && str.charAt(i) == str.charAt(i + 1)) {
      // Increment count and move to the next character
      compresser(str, newString, i + 1, count + 1);
      return;
    }

    // Add current character and count (if count > 1)
    newString += str.charAt(i);
    if (count > 1) {
      newString += count;
    }

    // Move to the next character and reset count
    compresser(str, newString, i + 1, 1);
  }

  public static void main(String[] args) {
    compresser("aabbccd", "", 0,1);
  }
}
