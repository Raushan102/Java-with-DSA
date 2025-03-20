import sorting.count;

public class Test2 {
  // bubble sort time complexity O(n^2)
  public static void BubbleSort(int[] arr) {
    for (int i = 0; i <= arr.length; i++) {
      for (int j = 0; j < arr.length - 1 - i; j++) {
        if (arr[j] > arr[j + 1]) {
          int temp = arr[j];
          arr[j] = arr[j + 1];
          arr[j + 1] = temp;
        }
      }
    }
  }

  // selection sort time complexity O(n^2)

  public static void SelectionSort(int arr[]) {
    for (int i = 0; i < arr.length; i++) {
      int current = i;
      for (int j = i; j < arr.length; j++) {
        if (arr[current] > arr[j]) {
          current = j;
        }

      }

      int temp = arr[i];
      arr[i] = arr[current];
      arr[current] = temp;
    }
  }

  // insertion sort   time complexity O(n^2)

  public static void insertionSort(int arr[]) {
    for (int i = 1; i < arr.length; i++) {
      int previous = i - 1;
      int current = arr[i];

      while (previous >= 0 && arr[previous] > current) {
        arr[previous + 1] = arr[previous];
        previous--;
      }

      arr[previous + 1] = current;
    }
  }

  // counting sort   time complexity  n log n; in some case  n;

  public static void countSort(int arr[]) {
    int largest = Integer.MIN_VALUE;
    for (int i = 0; i < arr.length; i++) {
      largest = Math.max(largest, arr[i]);
    }

    int Count[] = new int[largest + 1];

    for (int i = 0; i < arr.length; i++) {
      Count[arr[i]]++;
    }
    int j = 0;
    for (int i = 0; i < Count.length; i++) {
      while (Count[i] > 0) {
        arr[j] = i;
        j++;
        Count[i]--;
      }
    }
  }

  public static void main(String[] args) {
    int arr[] = { 2, 4, 5, 67, 76, 5, 5, 565 };
    countSort(arr);
    for (int i : arr) {
      System.out.print(i + " ");
    }
  }
}
