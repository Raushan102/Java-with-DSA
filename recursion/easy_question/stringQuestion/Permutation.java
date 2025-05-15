package recursion.easy_question.stringQuestion;

import java.util.ArrayList;

public class Permutation {
    public static void main(String[] args) {

        permutationString("","abc");
        System.out.println( permutationStringwithArrayList("","abc",0));
        System.out.println(permutationCount("","abc"));
    }

    static  void permutationString(String p,String up){
         if(up.isEmpty()){
             System.out.println(p);
             return;
         }
         char ch= up.charAt(0);
         for (int i=0;i<=p.length();i++){
             String s=p.substring(0,i);
             String f=p.substring(i,p.length());
             permutationString(f+ch+s,up.substring(1));
         }
    }

    // another function to do the same thing but i need an arrayList

    static  ArrayList <String> permutationStringwithArrayList(String p,String up,int step){
        if(up.isEmpty()){
           ArrayList <String> list=new ArrayList<>();
           step++;
           list.add(p);
            return list;
        }
        char ch= up.charAt(0);
        ArrayList <String> ans=new ArrayList<>();
        for (int i=0;i<=p.length();i++){
            String s=p.substring(0,i);
            String f=p.substring(i,p.length());
         ans.addAll(permutationStringwithArrayList(f+ch+s,up.substring(1),step));
        }
        return  ans;
    }

    // another function to count the permutation

    static  int permutationCount(String p,String up){
        if(up.isEmpty()){
            return 1;
        }
        int count=0;
        char ch=up.charAt(0);
        for(int i=0;i<=p.length();i++){
          String s = p.substring(0,i);
          String  f = p.substring(i,p.length());
          count +=permutationCount(f+ch+s,up.substring(1));
        }
        return  count;
    }
}
