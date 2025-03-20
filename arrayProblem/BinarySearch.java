package arrayProblem;

public class BinarySearch {

  public static int BSearcher(int array[], int key) {
    int end = array.length - 1;
    int start = 0;

    while (start <= end) {

      int mid = (start + end) / 2;  // calculating the mid index of  array

      if (array[mid] == key) {     // check  element on mid index is equal to key or not 
        return mid;
      }

      if (array[mid] < key) {        
        start = mid + 1;            // updating the start if element on index mid is smaller than key;
      }

      if (array[mid] > key) {
        end = mid - 1;
      }

    }
    return -1;
  }

  public static void main(String[] args) {
    int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
    int key = 10;
    int index = BSearcher(arr, key);
    if (index == -1) {
      System.out.println("element not found");
    } else {
      System.out.println("index of given key is equal to =" + index);
    }

  }
}
