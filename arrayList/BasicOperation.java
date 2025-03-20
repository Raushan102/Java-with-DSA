package arrayList;
import java.util.*;
public class BasicOperation {
  public static void main(String[] args) {
    ArrayList <Integer> list=new ArrayList<>();

    list.add(3);
    list.add(4);
    list.add(5);
    list.add(6);



    System.out.println(list);
    System.out.println(list.get(2));
    System.out.println(list.size());
    list.set(0, 20);
    System.out.println(list);
    System.out.println(list.remove(1));
    System.out.println(list);
    list.set(list.size()-1,50);
    list.add(76);
    list.addFirst(345);
    System.out.println(list);
  }
}
