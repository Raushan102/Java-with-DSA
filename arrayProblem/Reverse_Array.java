package arrayProblem;

public class Reverse_Array {

  public static void reverse_Array(int array[]) {
    int start = 0;
    int end = array.length - 1;
    while (start < end) {
      int temp = array[start];
      array[start] = array[end];
      array[end] = temp;
      start += 1;
      end -= 1;

    }

  }

  public static void main(String[] args) {
    int arr[] = { 1, 2, 4, 3, 5, 6, 7 };
    for (int i : arr) {
      System.out.print(i);
    }
    System.out.println();
    reverse_Array(arr);
    for (int i : arr) {
      System.out.print(i);
    }
  }
}
