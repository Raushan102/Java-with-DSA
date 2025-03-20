
package sorting;

public class QuickSort {

  public static int findPivot(int arr[], int si, int ei) {
   
    int pivot = arr[ei];
    int i = si - 1;

    for (int j = si; j < ei; j++) {
      if (arr[j] <  pivot) {
        i++;
        int temp = arr[j];
        arr[j] = arr[i];
        arr[i] = temp;

      }
   System.out.println(ei+" "+j);
    }

    System.out.println("i = "+i);
    i++;
    int temp = pivot;
    arr[ei] = arr[i];
    arr[i] = temp;

    return i;

  }

  public static void quickSort(int arr[], int si, int ei) {
    if (si >= ei) {
      return;
    }
    int p = findPivot(arr, si, ei);

    quickSort(arr, si, p - 1);
    quickSort(arr, p + 1, ei);
  }

  public static void printArray(int arr[]) {
    for (int i : arr) {
      System.out.print(i + " ");
    }
  }

  public static void main(String args[]) {
    int arr[] = { 2, 4, 6, 1, 2, 3342, 12, 345 };

    quickSort(arr, 0, arr.length - 1);
    printArray(arr);
  }
}