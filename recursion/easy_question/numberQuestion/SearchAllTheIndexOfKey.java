package recursion.easy_question.numberQuestion;

import java.util.ArrayList;

public class SearchAllTheIndexOfKey {

  public static void returnTheArrayListOfKeyIndex(int array[], int key) {
    ArrayList<Integer> arr = new ArrayList<>();
    System.out.println(anotherHelper(array, key, 0));

  }

  private static ArrayList<Integer> helper(int[] array, ArrayList<Integer> arr, int key, int i) {
    if (i == array.length) {
      return arr;
    }

    if (array[i] == key) {
      arr.add(i);
    }
    return helper(array, arr, key, ++i);
  }

  // if we don't take list from parameter and also not creating the list outside
  // the function in the global context
  // we need list should be created in the function body

  public static ArrayList<Integer> anotherHelper(int[] array, int key, int i) {
    ArrayList<Integer> list = new ArrayList<>();

    if (i == array.length) {
      return list;
    }

    if (array[i] == key) {
      list.add(i);
    }

    // collect all the index list coming from above function calls
    ArrayList<Integer> IndexComeingFromAboveCall = anotherHelper(array, key, ++i);
    // adding the above list in the main list and return
    list.addAll(IndexComeingFromAboveCall);
    return list;
  }

  public static void main(String[] args) {
    int[] array = { 34, 45, 6, 6, 6, 6, 78, 6 };
    returnTheArrayListOfKeyIndex(array, 6);
  }
}
