package recursion;

public class MaxNumber {
  public static int findGreatest(int arr[], int i) {
    int max = Integer.MIN_VALUE;
    if (i == arr.length - 1)  return arr[i];
    max = Math.max(arr[i], findGreatest(arr, i + 1));
    return max;
  }
  
  public static int findLowest(int arr[], int i) {
    int max = Integer.MAX_VALUE;
    if (i == arr.length - 1)
      return arr[i];
    max = Math.min(arr[i], findLowest(arr, i + 1));
    return max;
  }


  public static void main(String[] args) {

    int arr[] = { 1, 3, 5, 7,1000, 3,0, 8 ,20,50,100};
    // int n = findGreatest(arr, 0);
     int n=findLowest(arr, 0);
    System.out.println(n);

  }
}
