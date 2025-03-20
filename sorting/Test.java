package sorting;

public class Test {

  public static void SelectionSort(int[] arr) {
    for (int i = 0; i < arr.length - 1; i++) {
      int currData = i;
      for (int j = i; j < arr.length; j++) {
        if (arr[currData] > arr[j]) {
          currData = j;
        }
      }
      System.out.println(arr[currData]);

      int temp = arr[i];
      arr[i] = arr[currData];
      arr[currData] = temp;
    }

  }

  public static void insertionSort(int[] arr) {
    for (int i = 1; i < arr.length; i++) {
      int current = arr[i];
      int previous = i - 1;

      while (previous >= 0 && arr[previous] > current) {
        arr[previous + 1] = arr[previous];
        previous--;
      }
      arr[previous + 1] = current;
    }
  }

  public static void countingSort(int[] arr) {
    int largest = Integer.MIN_VALUE;

    for (int i = 0; i < arr.length; i++) {
     
      largest = Math.max(largest, arr[i]);
    }

    int count[] = new int[largest + 1];

    System.out.println(count.length);

    for (int i = 0; i < arr.length; i++) {
      count[arr[i]]++;
    }
    int j = 0;

    for (int i = 0; i < count.length; i++) {
      while (count[i] > 0) {
        arr[j] = i;
        j++;
        count[i]--;
      }
    }
  }

  public static void main(String[] args) {
    int arr[] = { 2, 5, 5, 6, 4, 7, 3 };
    countingSort(arr);
    for (int i : arr) {
      System.out.print(i + " ");
    }
  }
}
