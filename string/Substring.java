package string;

import recursion.assignment.subString;

// function to find substring to the given string 

public class Substring {
  public static String GetSubstring(String str, int s, int e) {
    String st = "";
    for (int i = 0; i < e; i++) {
      st += str.charAt(i);
    }

    return st;
  }

 // one another way to get the substring java provide a separate method to find the substring of any string 

  public static String FindSubstringWithBuiltInMethod(String str, int s, int e){
    return  str.substring(s, e);
  }

  public static void main(String[] args) {
    String str = "hello my name is raushan";
    System.out.println(
        FindSubstringWithBuiltInMethod(str, 0, 5));
  }

}
