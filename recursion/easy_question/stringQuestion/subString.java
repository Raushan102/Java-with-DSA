package recursion.easy_question.stringQuestion;

import java.util.ArrayList;
import java.util.Arrays;

public class subString {

  public static ArrayList<String> subString(String p, String up){
    if (up.isEmpty()) {
      ArrayList <String> list=new ArrayList<>();
      list.add(p);
      return list;
    }

    char ch=up.charAt(0);

    ArrayList <String> right= subString(ch+p,up.substring(1));
    ArrayList <String> left=  subString(p,up.substring(1));
    left.addAll(right);
    return  left;
  }



  public static void main(String[] args) {
     String str="abc";
    System.out.println(subString("",str));
  }

}
