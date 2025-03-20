package arrayList;
import java.util.*;
public class PrintReverse {
  public static void main(String[] args) {
    ArrayList<Integer> list=new ArrayList<>();
    list.add(2);
    list.add(8);
    list.add(5);
    list.add(13);
    list.add(23);
    list.add(23);

    for(int i=list.size()-1;i>=0;i--){
      System.out.print(list.get(i)+" ");
    }
  }
}
