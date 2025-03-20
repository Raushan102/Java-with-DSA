package twoD_Array;

public class Digonal_sum {
  public static void calculate_digonal_som(int arr[][]) {
    int n = arr.length - 1;
    if (n != arr[0].length - 1) {
      System.out.println("diagonal sum is  not  possible  ");
      return;
    }
    int sum = 0;
    for (int i = 0; i <= n; i++) {
      sum += arr[i][i];

      if (i != n - i) {
        sum += arr[i][n - i];
      }

    }
    System.out.println("diagonal sum is equal to = " + sum);
  }

  public static void main(String[] args) {
    int arr[][] = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
    int arr1[][] = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 }, { 13, 14, 15, 16 } };
    calculate_digonal_som(arr1);
  }

}
