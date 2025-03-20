package arrayList.assignment;

import java.util.*;

public class LonelyNumbersInArrayList {

  public static ArrayList<Integer> findLonelyElement(ArrayList<Integer> list) {
    int n = list.size() - 1;
    ArrayList<Integer> LonelyList = new ArrayList<>();
    Collections.sort(list);
    for (int i = 0; i < list.size(); i++) {

      if (i == 0) {
        if (list.get(i) != list.get(i + 1) && list.get(i) + 1 != list.get(i + 1)) {
          LonelyList.add(list.get(i));
        }
      }

      if (i > 0 && i < n) {
        if (list.get(i) != list.get(i + 1) && list.get(i) + 1 != list.get(i + 1) && list.get(i) != list.get(i - 1)
            && list.get(i) - 1 != list.get(i - 1)) {
          LonelyList.add(list.get(i));
        }
      }

      if (i == n) {
        if (list.get(i) != list.get(i - 1) && list.get(i) - 1 != list.get(i - 1)) {
          LonelyList.add(list.get(i));
        }
      }

    }

    return LonelyList;
  }

  public static void main(String args[]) {
    ArrayList<Integer> list = new ArrayList<>();

    // add element in ArrayList;
    list.add(1);
    list.add(3);
    list.add(5);
    list.add(3);

    System.out.println(findLonelyElement(list));

  }
}
