// Q2 - Given an array of size n, find the total number of occurrences of given number every element.
package arrayProblem;

public class Problem_02 {

  static boolean skip(int arr[], int i, int currentDigit) {
    for (int j = 0; j < i; j++) {
      if (currentDigit == arr[j]) {
        return true;
      }
    }
    return false;
  }

  static int check(int arr[]) {

    for (int i = 0; i < arr.length; i++) {
      int currentDigit = arr[i];
      int count = 0;
      boolean isSkip = skip(arr, i, currentDigit);

      if (isSkip) {
        continue;
      }

      for (int j = 0; j < arr.length; j++) {
        if (currentDigit == arr[j]) {
          count++;
        }
      }
      System.out.println(arr[i] + " come " + count + " times in array");
    }
    return 1;
  }

  public static void main(String[] args) {
    int array[] = { 3, 4, 6, 6, 6, 45, 45, 0, 0 };
    check(array);
  }
}
