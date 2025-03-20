package sorting;

public class Insertion {
  public static void insertion(int arr[]) {
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

  public static void main(String[] args) {
       int arr []={2,3,5,7,2,9,10,15};
       insertion(arr);
       for(int i : arr){
        System.out.print(i+" ");
       }
  }
}
