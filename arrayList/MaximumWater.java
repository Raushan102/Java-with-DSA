package arrayList;

import java.util.*;

public class MaximumWater {

  // ==============================brute-force approach
  // ===========================================>
  // ===================================time complexity is
  // O(n^2)======================================>
  public static int calculateMaximumHoldWater(ArrayList<Integer> list) {
    // initializing a variable with negative infinity value
    int max = Integer.MIN_VALUE;
    // iterating over the list
    for (int i = 0; i < list.size(); i++) {
      for (int j = i + 1; j < list.size(); j++) {
        int height = Math.min(list.get(i), list.get(j)); // calculating the height of the line
        int weight = j - i; // calculating the weight of the line

        int holdWater = height * weight; // calculate the hold water

        max = Math.max(max, holdWater); // compare with max hold water
      }
    }

    return max;
  }

  // ============================================optimized way time complexity is O(n
  //======================================>

  public static int  optimizedWay(ArrayList<Integer> list) {
    int leftPointer = 0;
    int rightPointer = list.size() - 1;
    int max = Integer.MIN_VALUE;
    while (leftPointer < rightPointer) {
      int height = Math.min(list.get(leftPointer), list.get(rightPointer));
      int weight = rightPointer - leftPointer;
      int holdWater = height * weight;
      max = Math.max(max, holdWater);

      if(list.get(leftPointer) < list.get(rightPointer)){
         leftPointer++;
      }else{
        rightPointer--;
      }
    }

    return max;
  }

  public static void main(String[] args) {
    // creating a ArrayList
    ArrayList<Integer> list = new ArrayList<>();
    // adding elements in ArrayList
    list.add(1);
    list.add(8);
    list.add(6);
    list.add(2);
    list.add(5);
    list.add(4);
    list.add(8);
    list.add(3);
    list.add(7);
    int maximumHoldWaterIs = calculateMaximumHoldWater(list);

    System.out.println("maximum hod water is = " + maximumHoldWaterIs); // 49  time complexity= O(n^2)

    int optimizedHoldWater=optimizedWay(list);

    System.out.println("maximum hold water calculated by optimized way is = " + optimizedHoldWater); // 49 time complexity=O(n)

  }
}
