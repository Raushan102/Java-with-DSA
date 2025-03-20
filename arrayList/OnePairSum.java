package arrayList;

import java.util.*;

public class OnePairSum {

  // brute-force approach time complexity O(n^2)

  public static boolean findPairs(ArrayList<Integer> list, int target) {
    for (int i = 0; i < list.size(); i++) {
      for (int j = i + 1; j < list.size(); j++) {
        if (list.get(i) + list.get(j) == target) {
          return true;
        }
      }
    }

    return false;
  }

  // two pointer and optimized way time complexity O(n)

  public static boolean findPair(ArrayList<Integer> list, int target) {
    int leftPointer = 0;
    int rightPointer = list.size() - 1;
    while (leftPointer < rightPointer) {
      if (list.get(leftPointer) + list.get(rightPointer) == target) {
        return true;
      } else if (list.get(leftPointer) + list.get(rightPointer) < target) {
        leftPointer++;
      }else{
        rightPointer--;
      }
    }

    return false;
  }

  public static void main(String[] args) {
    ArrayList<Integer> list = new ArrayList<>();
    // 1,2,3,4,5,6,7,8
    list.add(1);
    list.add(2);
    list.add(3);
    list.add(4);
    list.add(5);
    list.add(6);
    list.add(7);
    list.add(8);
    System.out.println(findPairs(list, 6));
    System.out.println(findPair(list, 6));

  }
}
