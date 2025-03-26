
// Given an array of integers, print a sum triangle from it such that the first level has all array elements. From then, at each level number of elements is one less than the previous level and elements at the level is be the Sum of consecutive two elements in the previous level. 
// Example :

// Input : A = {1, 2, 3, 4, 5}
// Output : [48]
//          [20, 28] 
//          [8, 12, 16] 
//          [3, 5, 7, 9] 
//          [1, 2, 3, 4, 5] 

// Explanation :
// Here,   [48]
//         [20, 28] -->(20 + 28 = 48)
//         [8, 12, 16] -->(8 + 12 = 20, 12 + 16 = 28)
//         [3, 5, 7, 9] -->(3 + 5 = 8, 5 + 7 = 12, 7 + 9 = 16)
//         [1, 2, 3, 4, 5] -->(1 + 2 = 3, 2 + 3 = 5, 3 + 4 = 7, 4 + 5 = 9)

package recursion.easy_question;

public class SomeTriangle {

  // print the array
  static void printer(int[] arr) {
    System.out.print("[");
    for (int i : arr) {
      System.out.print(i + " ");
    }
    System.out.print("]");
    System.out.println();
  }

  // print all the filled array
  public static void some(int arr[]) {

    if (arr.length == 1) {
      printer(arr);
      return;
    }
    int[] hArr = new int[arr.length - 1];
    helper(arr, 0, hArr);
    printer(arr);
  }

  // helper function to fill the array with triangle some
  public static void helper(int arr[], int i, int hArr[]) {

    if (i == arr.length - 1) {
      some(hArr);
      return;
    }
    hArr[i] = arr[i] + arr[i + 1];
    helper(arr, i + 1, hArr);
  }

  public static void main(String[] args) {

    int[] arr = { 1, 2, 3, 4, 5 };

    some(arr);

  }
}
