package string;

import java.lang.reflect.Array;

public class UpperCase {
  // function to convert the fist letter uppercase of each word in the string
  public static void convert(String str) {
    String[] convertedString;

    convertedString = str.split(" ");

    for (int i = 0; i < convertedString.length; i++) {

      convertedString[i] = convertedString[i].replace(convertedString[i].charAt(0),
          (char) Character.toUpperCase(convertedString[i].charAt(0)));
    }

    String st = String.join(" ", convertedString);

    System.out.println(st);

  }

  // another way to do the same thing
  public static void anotherWayToConvert(String str) {
    StringBuilder st = new StringBuilder(" ");

    st.append(Character.toUpperCase(str.charAt(0)));

    for (int i = 1; i < str.length(); i++) {
      if (str.charAt(i) == ' ' && i < str.length() - 1) {
        st.append(str.charAt(i));
        i++;
        st.append(Character.toUpperCase(str.charAt(i)));

      } else {

        st.append(str.charAt(i));
      }
    }

    System.out.println(st);
  }

  public static void main(String[] args) {
    String str = "hello my name is raushan";

    anotherWayToConvert(str);

  }
}
