package sorting;

public class MergeSort {
  public static void mergeSort(int arr[], int si, int ei) {
    if (si >= ei) {
      return;
    }

    int mid = si + (ei - si) / 2;

    mergeSort(arr, si, mid);
    mergeSort(arr, mid + 1, ei);
    merge(arr, si, ei, mid);

  }

  public static void merge(int arr[], int si, int ei, int mid) {
    int temp[] = new int[ei - si + 1];
    int i = si;
    int j = mid + 1;
    int k = 0;

    while (i <= mid && j <= ei) {

      if (arr[i] < arr[j]) {
        temp[k++] = arr[i++];
      
      } else {
        temp[k++] = arr[j++];
      }

    }

    while (i <= mid) {
      temp[k++] = arr[i++];
    }

    while (j <= ei) {
      temp[k++] = arr[j++];
    }

    for (int l = 0, m = si; l < temp.length; l++, m++) {
      arr[m] = temp[l];
    }

  }

  public static void printArray(int arr[]) {
    for (int i : arr) {
      System.out.print(i + " ");
    }
  }

  public static void main(String args[]) {
    int arr[] = { 1, 5, 2, 9, 23, 45, 6744534, 234, 23 };
    mergeSort(arr, 0, arr.length - 1);
    printArray(arr);
  }

}
