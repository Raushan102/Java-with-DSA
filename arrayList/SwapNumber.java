package arrayList;
import java.util.*;
public class SwapNumber {


public static void swapper(ArrayList <Integer> list,int i,int j){

  int temp=list.get(i);
   list.set(i,list.get(j));
   list.set(j,temp);

  
}
   public static void main(String[] args) {
    ArrayList <Integer> list=new ArrayList<>();
     list.add(2);
     list.add(8);
     list.add(5);
     list.add(13);
     list.add(23);
     list.add(23);

     swapper(list,1,3);
     System.out.println(list);
   }
}