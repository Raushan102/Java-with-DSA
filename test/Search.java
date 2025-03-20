package test;
public class Search {

  public static void search(int arr[], int key) {

    int start = 0;
    int last = arr.length-1;

    while (start <= last) {
      int mid = (start + last) / 2;
      System.out.println(mid);
      if (arr[mid] == key) {
        System.out.println("index of the given key is  = " + mid);
        return;
      }

      if (key > arr[mid]) {
        start = mid + 1;
      }

      if (key < arr[mid]) {
        last = mid - 1;
      }

    }

    System.out.println("number not present ");
    return;
  }

  public static void main(String[] args) {

    int[] arr = { 1, 2, 3, 4, 5, 6 };
    search(arr, 6);

    System.out.println("done");
  }

}
