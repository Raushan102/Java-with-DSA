package arrayList;

import java.util.ArrayList;
import java.util.*;

public class Sorting {
  public static void main(String[] args) {
    
    ArrayList<Integer> list=new ArrayList<>();
     list.add(2);
     list.add(8);
     list.add(5);
     list.add(13);
     list.add(23);
     list.add(23);
     
     // ascending 
     Collections.sort(list);
     System.out.println(list);

     // descending
     Collections.sort(list,Collections.reverseOrder());
     System.out.println(list);
  }
}
