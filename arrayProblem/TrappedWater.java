package arrayProblem;

public class TrappedWater {

  public static void findTrappedWater(int array[]) {
    int leftMaxArray[] = new int[array.length];
    int RightMaxArray[] = new int[array.length];
    leftMaxArray[0] = array[0];
    int n = array.length;

    // calculating the right max value for every element
    for (int i = 1; i < array.length; i++) {
      leftMaxArray[i] = Math.max(leftMaxArray[i - 1], array[i]);
    }

    // calculating the right max value for every element
    RightMaxArray[n - 1] = array[n - 1];

    for (int j = n - 2; j >= 0; j--) {
      RightMaxArray[j] = Math.max(RightMaxArray[j + 1], array[j]);
    }

    int trappedWater = 0;

    for (int i = 1; i < n; i++) {
      // calculating the water Level
      int waterLevel = Math.min(leftMaxArray[i], RightMaxArray[i]);
      // adding the trapped water of all height
      trappedWater += waterLevel - array[i] < 0 ? 0 : waterLevel - array[i];

    }
    System.out.println("trapped water is = " + trappedWater);

  }

  public static void main(String[] args) {
    int array[] = { 4, 2, 0, 6, 3, 2, 5 };
    findTrappedWater(array);
  }
}
