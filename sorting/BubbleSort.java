package sorting;

public class BubbleSort {
  public static void PerformBubbleSort(int arr[]) {
    for (int i = 0; i < arr.length - 1; i++) {
      System.out.println(arr.length);
      for (int j = 0; j < arr.length - 1 - i; j++) {
        if (arr[j] > arr[j + 1]) {
          int temp = arr[j];
          arr[j] = arr[j+1];
          arr[j+1] = temp;
        }
      }
    }

  }

  public static void main(String[] args) {
    int arr[] = { 2, 3, 4, 5, 6, 423, 12321, 1 };

    PerformBubbleSort(arr);
    for (int i : arr) {
      System.out.print(i + " ");
    }
  }
}
