package string;

// function to check greater String

// to compare the string java provide special function to check weather  string is greater or not that is 
// ===="apple".compareTo("banana"); // Output: -1
// ===="Hello".equalsIgnoreCase("hello"); // Output: true
// -value   string small 
// 0        strings are equal 
// 1 value  string are greater

public class PrintLargestString {

  public static String checkGreaterString(String[] str) {
    String largest = str[0];

    for (int i = 1; i < str.length; i++) {

      if (largest.compareToIgnoreCase(str[i]) < 0) {
        largest = str[i];
        System.out.println(largest);
      }
    }

    return largest;
  }

  public static void main(String[] args) {
    String[] str = { "apple", "mongo", "banana" };
    System.out.println(checkGreaterString(str));
  }
}
