package recursion.assignment;

public class givenIndexElement {
  public static void findIndex(int arr[], int key, int i) {
    if (i == arr.length) {
      return;
    }

    if (arr[i] == key) {
      System.out.print(i+" ");
    }
    findIndex(arr, key, ++i);

  }

  public static void main(String[] args) {
    int arr[] = { 2, 4, 3, 6, 8, 8, 3, 3, 5 };
    int key = 3;
    findIndex(arr, key, 0);
  }

}
