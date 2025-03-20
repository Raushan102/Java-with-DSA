package arrayList;

import java.util.*;

public class MultiDimention {

  public static void printArrayList(ArrayList<ArrayList<Integer>> mainList) {
    for (int i = 0; i < mainList.size(); i++) {
      ArrayList<Integer> current = mainList.get(i);
      for (int j = 0; j < current.size(); j++) {
        System.out.print(current.get(j)+" ");
      }
      System.out.println();
    }
  }

  public static void main(String args[]) {
    ArrayList<ArrayList<Integer>> mainList = new ArrayList<>();

    ArrayList<Integer> list = new ArrayList<>();
    list.add(2);
    list.add(8);
    list.add(5);
    list.add(13);
    list.add(23);
    list.add(23);
    mainList.add(list);

    ArrayList<Integer> list2 = new ArrayList<>();
    list2.add(10);
    list2.add(20);
    list2.add(30);
    list2.add(40);
    list2.add(50);
    list2.add(60);
    mainList.add(list2);


    

    printArrayList(mainList);
     System.out.println(mainList);
  }
}
