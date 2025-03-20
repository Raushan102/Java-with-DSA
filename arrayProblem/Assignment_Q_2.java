package arrayProblem;

public class Assignment_Q_2 {
  public static void check(int arr[]) {
    int leftMax[] = new int[arr.length];
    int rightMax[] = new int[arr.length];
    int totalTappedWater = 0;
    leftMax[0] = arr[0];
    for (int i = 1; i < arr.length; i++) {
      leftMax[i] = Math.max(leftMax[i - 1], arr[i]);
    }

    rightMax[arr.length - 1] = arr[arr.length - 1];

    for (int j = arr.length - 2; j >= 0; j--) {
      rightMax[j] = Math.max(rightMax[j + 1], arr[j]);
    }

    for (int i = 0; i < arr.length; i++) {
     
      int n = Math.min(leftMax[i], rightMax[i]);
     
      int trappedWater = n - arr[i] < 0 ? 0
          : n - arr[i];
   
      totalTappedWater += trappedWater;
 
    }

  System.out.println("total trapped water is "+ totalTappedWater);
  }

  public static void main(String[] args) {
    int array[] = { 4, 2, 0, 3, 2, 5 };
    check(array);
  }
}
