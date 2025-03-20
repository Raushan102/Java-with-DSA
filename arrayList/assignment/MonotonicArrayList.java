package arrayList.assignment;

import java.util.ArrayList;

public class MonotonicArrayList {

  // check monotonic increasing 

  public static void checkIncreasing(ArrayList<Integer> list) {

    for (int i = 0; i < list.size() - 1; i++) {
      if (list.get(i) > list.get(i + 1)) {
        System.out.println("this series is not monotonic increasing ");
      }
    }
    System.out.println("this series is  monotonic increasing ");
  }
// check monotonic decreasing 
  public static void checkDecreasing(ArrayList<Integer> list) {
    for (int i = 0; i < list.size() - 1; i++) {
      if (list.get(i) < list.get(i + 1)) {
        System.out.println("this series is not monotonic decreasing ");
      }
    }
    System.out.println("this series is  monotonic decreasing ");

  }

  // call the function according to the increasing or decreasing or both

  public static void checkMonotonic(ArrayList<Integer> list) {
    for (int i = 0; i < list.size() - 1; i++) {
      if (list.get(i) > list.get(i + 1)) {
        checkDecreasing(list);
        return;
      }
      if (list.get(i) < list.get(i + 1)) {
        checkIncreasing(list);
        return;
      }
    }

    System.out.println("list is either be  monotonic increasing nor monotonic decreasing because all the element in the list are same");
  }

  public static void main(String[] args) {
    ArrayList<Integer> list = new ArrayList<>();

    // add element in arrayList

    list.add(4);
    list.add(3);
    list.add(2);
    list.add(2);
    checkMonotonic(list);
  }
}
