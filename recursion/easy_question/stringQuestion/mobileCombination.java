package recursion.easy_question.stringQuestion;

import java.util.ArrayList;

public class mobileCombination {
    public static void main(String[] args) {
        ArrayList<String> list = padWithArrayList("", "12");
        pad("","12");
        System.out.println(list);
    }
    static void pad(String p, String up) {
        if (up.isEmpty()) {
            System.out.println(p);
            return;
        }
        int digit = up.charAt(0) - '0'; // converting the string number to number like '2'= 2;
        for (int i = (digit - 1) * 3; i < digit * 3; i++) {
            char ch = (char) ('a' + i);
           pad(p+ch,up.substring(1));
        }

    }

    // another function  that return the   Arraylist
    static ArrayList<String> padWithArrayList(String p, String up) {
        if (up.isEmpty()) {

            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        ArrayList<String> ans = new ArrayList<>();
        int digit = up.charAt(0) - '0'; // converting the string number to number like '2'= 2;
        for (int i = (digit - 1) * 3; i < digit * 3; i++) {
            char ch = (char) ('a' + i);
            ans.addAll(padWithArrayList(p + ch, up.substring(1)));
        }
        return ans;
    }

}
