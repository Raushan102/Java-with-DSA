package recursion;

public class FirstOccurence {

  public static int firstOccurrence(int arr[], int key, int i) {

    if (i == arr.length) {
      return -1;
    }
    if (arr[i] == key) {
      return i;
    }
    return firstOccurrence(arr, key, i + 1);
  }

  public static int LastOccurrence(int arr[], int key, int i) {
    if (i == arr.length) {
      return -1;
    }

    int findIndex = LastOccurrence(arr, key, i + 1);
    if (arr[i] == key && findIndex == -1) {
      return i;
    }
    return findIndex;
  }

  public static void main(String[] args) {
    int arr[] = { 1, 2, 5, 4, 5, 3, 2, 5, 22 };
    int key = 0;
    int i = 0;
    System.out.println(LastOccurrence(arr, key, i));
  }
}
