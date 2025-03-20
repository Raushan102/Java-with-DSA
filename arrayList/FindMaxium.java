package arrayList;
import java.util.*;
public class FindMaxium {
   public static void main(String[] args) {

    ArrayList<Integer> list=new ArrayList<>();
     list.add(2);
     list.add(8);
     list.add(5);
     list.add(13);
     list.add(23);
     list.add(23);

     int max=Integer.MIN_VALUE;
     for(int i=0;i<list.size()-1;i++){
       max=Math.max(max,list.get(i));
     }
     System.out.println(max);
   }

  
}
