package recursion.easy_question;

public class First_word_upper {
//  array printer

  static void printer(String arr[]) {
    for (String string : arr) {
      System.out.print(string + "  , ");
    }
  }

  // function to replace the first word to the upper case  O(string.length)

  private static String helper(String str, int i, StringBuffer sb) {
    if (i == str.length() - 1) {
      sb.append(str.charAt(i));
      return String.valueOf(sb);
    }
    if (i == 0) {
      sb.append(String.valueOf(str.charAt(i)).toUpperCase());
      return helper(str, ++i, sb);
    }
    sb.append(str.charAt(i));

    if (String.valueOf(str.charAt(i)).equals(" ")) {
      i++;
      sb.append(String.valueOf(str.charAt(i)).toUpperCase());
      return helper(str, ++i, sb);
    }

    return helper(str, ++i, sb);
  }

  // main function

  private static String firstLetterUpper(String str) {
    StringBuffer st = new StringBuffer();
    System.out.println(String.join(" ", helper2(str.split(" "), 0)));

    return helper(str, 0, st);
  }

  //  another way to perform the same task

  static String[] helper2(String arr[], int i) {
    System.out.println(arr.length - 1);
    if (i == arr.length) {
      return arr;
    }

    arr[i] = arr[i].replaceFirst(String.valueOf(arr[i].charAt(0)), String.valueOf(arr[i].charAt(0)).toUpperCase());

    return helper2(arr, ++i);

  }

  public static void main(String[] args) {
    String str = "hello my name is raushan";
    System.out.println(firstLetterUpper(str));
  }

}