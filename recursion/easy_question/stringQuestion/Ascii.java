package recursion.easy_question.stringQuestion;

import java.util.ArrayList;
import java.util.Scanner;

public class Ascii {

    public static int giveMeSsciiVal(char ch) {
        return ch;
    }

    public static ArrayList<String> printSubString(String p, String up) {
        if (up.isEmpty()) {
            ArrayList<String> list = new ArrayList<>();

            list.add(p);
            return list;
        }

        char ch = up.charAt(0);
        ArrayList<String> left = printSubString(p + ch, up.substring(1));
        ArrayList<String> ascii = printSubString(p + (ch + 0), up.substring(1));
        ArrayList<String> right = printSubString(p, up.substring(1));
        left.addAll(right);
        left.addAll(ascii);
        return left;

    }

    public static void main(String[] args) {
        Scanner cs = new Scanner(System.in);
          //System.out.println("enter the character that you want to know ascii value");
         // char ch = cs.nextLine().charAt(0);
        //System.out.println(giveMeSsciiVal(ch));
        System.out.println(printSubString("", "abc"));
    }
}
