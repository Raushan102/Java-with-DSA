package arrayProblem;

public class Prefix_some {
  public static void prefix_some(int[] arr) {
    int prefixArray[] = new int[arr.length];

    prefixArray[0] = arr[0];

    for (int i = 1; i < prefixArray.length; i++) {
      prefixArray[i] = prefixArray[i - 1] + arr[i];
    }

    int max = Integer.MIN_VALUE;

    for (int i = 0; i < arr.length; i++) {

      for (int j = i + 1; j < arr.length; j++) {
        int subArraySome = 0;
        subArraySome = i == 0 ? prefixArray[j] : prefixArray[j] - prefixArray[i - 1];
        if (subArraySome > max) {
          max = subArraySome;
        }
      }
    }

    System.out.println("max = " + max);

  }

  public static void kadans(int arr[]) {
    int sum = 0;
    int mx = 0;
    for (int i = 0; i < arr.length; i++) {
      sum += arr[i];

      if (sum < 0) {
        sum = 0;
      }
      mx = Math.max(sum, mx);
    }
    System.out.println("max = "+mx);
  }

  public static void main(String[] args) {
    int arr[] = { 1, -2, 6, -1, 3 };
    int arrSec []={-2,-3,4,-1,-2,1,5,-3};
    prefix_some(arrSec);
    kadans(arrSec);
  }
}