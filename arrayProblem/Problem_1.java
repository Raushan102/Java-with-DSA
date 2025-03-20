//Q1 - Given an array sorted in increasing order of size n and an integer x, find if there exists a pair in the array whose absolute difference is exactly x.(n>1)

package arrayProblem;

public class Problem_1 {

  static boolean pair(int[] arr, int x) {
    boolean signal = false;
    for (int i = 0; i < arr.length; i++) {
      for (int j = 0; j < arr.length; j++) {

        if ((arr[i] - arr[j]) == x) {

          signal = true;
          break;
        }
      }
    }

    if (signal == true) {
      System.out.println("yes");
    } else {
      System.out.println("No");
    }
    return signal;
  }

  public static void main(String[] args) {
    // int n = 7;
    // int[] array1 = {1, 2, 3, 4, 5, 6, 7};  // No

      int [] array1 = {5,10,15,20,26};
         int n=10;   // yes


    pair(array1, n);
  }

}
