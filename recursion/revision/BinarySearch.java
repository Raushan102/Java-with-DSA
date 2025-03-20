package recursion.revision;

public class BinarySearch {
  private static void bSearch(int[] arr, int start, int end, int key) {
    int mid = (start + end) / 2;

    if (start > end) {
      System.out.println("key not present in the array");
      return;
    }
    if (arr[mid] == key) {
      System.out.println("we get the key " + mid + "index of array");
      return;
    }

    if (arr[mid] < key) {
      start = mid + 1;
      bSearch(arr, start, end, key);
    } else {
      end = mid - 1;
      bSearch(arr, start, end, key);
    }

  }

  public static void main(String[] args) {
    int[] arr = { 2, 3, 4, 5, 6, 7, 8 };

    bSearch(arr, 0, arr.length - 1, 8);
  }

}
