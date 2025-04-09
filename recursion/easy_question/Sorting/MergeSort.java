package recursion.easy_question.Sorting;

public class MergeSort {

  public static void printArray(int arr[]) {
    System.out.println("print");
    for (int el : arr) {
      System.out.print(el + " ");
    }
    System.out.println("printed");
  }

  public static void mergeSort(int arr[], int si, int ei) {
    // baseCase

    if (si >= ei) {
      return;
    }

    //
    int mid = si + (ei - si) / 2;
    mergeSort(arr, si, mid);
    mergeSort(arr, mid + 1, ei);
    merge(arr, mid, si, ei);

  }

  public static void merge(int arr[], int mid, int si, int ei) {
    int temArr[] = new int[ei - si + 1];
    int i = si;
    int j = mid + 1;
    int k = 0;

    while (i <= mid && j <= ei) {
      if (arr[i] > arr[j]) {
        temArr[k] = arr[j];
        j++;
        k++;
      } else {
        temArr[k] = arr[i];
        i++;
        k++;
      }
    }
    System.out.println("up left");

    // left
    while (i <= mid) {
      temArr[k++] = arr[i++];
    }
    System.out.println("up right");

    // right
    while (j <= ei) {
      temArr[k++] = arr[j++];
    }


    for (k = 0, i = si; k < temArr.length; k++, i++) {
      arr[i] = temArr[k];
    }
  }

  public static void main(String[] args) {
    int arr[] = { 4, 6, 7, 8, 7, 5, 65, 4, 4, 4, 3, 2, 2, 67, 8 };
    mergeSort(arr, 0, arr.length - 1);
    printArray(arr);
  }

}
