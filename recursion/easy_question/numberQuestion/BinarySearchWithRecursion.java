package recursion.easy_question.numberQuestion;

public class BinarySearchWithRecursion {

  public static int Binary(int[] array, int key, int start, int end) {
    if (start > end) {
      return -1;
    }

    int mid = start + (end - start) / 2;

    if (array[mid] == key) {
      return mid;
    }

    if (array[mid] > key) {
      end = mid - 1;
      return Binary(array, key, start, end);
    }

    start = mid + 1;

    return Binary(array, key, start, end);

  }

  public static void main(String[] args) {
    int[] arr = { 1, 2, 3, 4, 5, 6, 7 };
    System.out.println(Binary(arr, 1, 0, arr.length - 1));
  }
}
