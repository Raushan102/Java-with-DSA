package arrayProblem;

public class roatedArray {
  public static int search(int arr[], int target, int si, int ei) {
    if (si > ei) {
      return -1;
    }

    int mid = si + (ei - si) / 2;
    if (target == arr[mid]) {
      return mid;
    }

    if (arr[si] < arr[mid]) {
      if (arr[si] <= target && target <= arr[mid]) {
        search(arr, target, si, mid - 1);

      } else {
        search(arr, target, mid + 1, ei);
      }
    } else {
      if (arr[mid] <= target && target <= arr[ei]) {
        search(arr, target, mid + 1, ei);
      } else {
        search(arr, target, si, mid - 1);
      }
    }
    return -1;
  }

  public static void main(String[] args) {
    int arr[] = { 6, 7, 8, 9, 0, 1, 2, 3, 4, 5 };
    int target = 0;
   int index= search(arr, target, 0, arr.length - 1);
   System.out.println("index of the given target is = " + index);
  }
}
