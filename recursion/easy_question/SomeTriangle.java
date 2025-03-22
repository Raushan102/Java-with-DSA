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
