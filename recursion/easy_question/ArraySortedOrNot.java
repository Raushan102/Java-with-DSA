package recursion.easy_question;

public class ArraySortedOrNot {
  // function to check function is sorted or not

  public static void check(int[] array) {

    if (helper(array, 0)) {
      System.out.println("yes array is sorted ");
    } else {
      System.out.println("No here array is not sorted ");
    }

  }

  private static boolean helper(int[] array, int i) {
    if (i == array.length - 1) {
      return true;
    }

    if (array[i] > array[i + 1]) {
      return false;
    }
    return helper(array, ++i);
  }

  // another way to solve this problem

  public static void anotherSolution(int[] arr) {

    if (anotherHelper(arr, 0, arr.length - 1)) {
      System.out.println("yes array is sorted ");
    } else {
      System.out.println("No here array is not sorted ");
    }

  }
  // divide and conquer method O(log n)

  public static boolean anotherHelper(int[] array, int start, int end) {
    if (start >= end) {
      return true;
    }

    if (start == end - 1) {
      return array[start] <= array[end];
    }

    int mid = start + (end - start) / 2;
    return anotherHelper(array, start, mid) && anotherHelper(array, mid + 1, end) && array[mid] <= array[mid + 1];

  }

  public static void main(String[] args) {
    int arr[] = { 1, 2, 100, 500, 800, 700 };
    anotherSolution(arr);
  }
}