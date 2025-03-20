package arrayList.assignment;

import java.util.*;

public class Question3 {

  public static ArrayList<Integer> giveSolution(int target) {
    System.out.println("yes  called ");
    ArrayList<Integer> list = new ArrayList<>();
    for (int i = 0; i < target; i++) {
      list.add(i + 1);
    }
    System.out.println(list);

    for (int i = 0; i < list.size(); i++) {
      for (int j = 0; j < list.size(); j++) {
        for (int k = i+1; k < j; k++) {
          if (2 * list.get(k) == list.get(i) + list.get(j)) {
            int maxIndex = 0;
            if (list.get(i) > list.get(j)) {
              maxIndex = i;
            } else {
              maxIndex = j;
            }

            int temp = list.get(maxIndex);
            list.set(maxIndex, list.get(k));
            list.set(k, temp);
            System.out.println(i + " " + j);
          }
        }
      }
    }
    System.out.println("out of the loop");
    return list;
  }

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    System.out.println(" inter the target ");
    int target = sc.nextInt();

    ArrayList<Integer> list = giveSolution(target);
    System.out.println(list);
  }

}
