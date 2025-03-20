package sorting;

public class count {

  public static void countSort(int arr[]) {
    int largest = Integer.MIN_VALUE;
    for (int el : arr) {
      largest = Math.max(el, largest);
    }
    System.out.println(largest);

    int count[] = new int[largest + 1];
    for (int i = 0; i < arr.length; i++) {
      count[arr[i]]++;
    }

    // sorting
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
     int arr[]={1,4,6,8,3,5};
      countSort(arr);
      for(int i : arr){
        System.out.print(i+" ");
      }
  }
}
