package sorting;

public class Selection {
  public static void SelectionSort(int arr[]) {
    int n = arr.length;
    for (int i = 0; i < n-1; i++) {
      int min_Position = i;
      for (int j = i + 1; j < n; j++) {
         if(arr[min_Position] > arr[j]){
          min_Position=j;
         }
      }

      int temp= arr[min_Position];
        arr[min_Position]= arr[i];
        arr[i]=temp;
    }
  }

  public static void main(String[] args) {
    int array[] = { 1, 3, 5, 4, 6, 8, 9 };
    SelectionSort(array);
    for (int k : array) {
      System.out.print(k + " ");
    }
  }
}
