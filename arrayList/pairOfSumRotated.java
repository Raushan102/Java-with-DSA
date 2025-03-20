package arrayList;

import java.util.ArrayList;

public class pairOfSumRotated {

  // brute-force approach time complexity is O(n^2)
  public static boolean brudeForceFindPair(ArrayList<Integer> list, int target) {
    int p = 0;
    int n = list.size();
    for (int i = 0; i < n; i++) {
      if (list.get(i) > list.get(i + 1)) {
        p = i;
        break;
      }
    }
    int lp = p + 1;
    int rp = p;

    while (lp != rp) {
      if (list.get(rp) + list.get(lp) == target) {
        return true;
      }
      if (list.get(rp) + list.get(lp) < target) {
        lp = (lp + 1) % n;
      } else {
        rp = (n + rp - 1) % n;
      }
    }

    return false;
  }

  // two pointer approach time complexity O(n)
  public static boolean TwoPointerFindPair(ArrayList<Integer> list, int target) {
    int p = 0;
    int n = list.size();
    for (int i = 0; i < list.size() - 1; i++) {
      if (list.get(i + 1) < list.get(i)) {
        p = i;
        break;
      }
    }

    int leftPointer = p + 1;
    int rightPointer = p;

    while (leftPointer != rightPointer) {
      if (list.get(rightPointer) + list.get(leftPointer) == target) {
        return true;
      }

      if (list.get(rightPointer) + list.get(leftPointer) < target) {
        leftPointer = (leftPointer + 1) % n;
      } else {
        rightPointer = (n * rightPointer - 1) % n;
      }
    }

    return false;
  }

  public static void main(String args[]) {
    // create an ArrayList
    ArrayList<Integer> list = new ArrayList<>();
    // 14,15,6,7,8,9,10
    // add element in list
    list.add(14);
    list.add(15);
    list.add(6);
    list.add(7);
    list.add(8);
    list.add(9);
    list.add(10);

    System.out.println(brudeForceFindPair(list, 25));
    System.out.println(TwoPointerFindPair(list, 25));

  }
}
