package recursion.easy_question.Sorting;
// bubble short using the recursion

public class BubbleShort {

  // printer to print the array
  static void printer(int array[]) {
    System.out.print('[');
    for (int i : array) {
      System.out.print(i + " ");
    }
    System.out.println("]");
  }

  public static int[] bubbleShort(int[] array, int i, int j) {

    if (i == array.length - 1) {
      printer(array);
      return array;
    }

    // swapping the number

    if (array[j] > array[j + 1]) {
      int temp = array[j];
      array[j] = array[j + 1];
      array[j + 1] = temp;
    }

    if (j == array.length - 2) {
      j = 0;
      return bubbleShort(array, ++i, j);
    }

    return bubbleShort(array, i, ++j);

  }

  public static void main(String[] args) {
    int array[] = { 1, 254, 567, 343, 23 };
    bubbleShort(array, 0, 0);
  }
}
