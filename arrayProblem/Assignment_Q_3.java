package arrayProblem;

public class Assignment_Q_3 {

  public static void check(int arr[]) {
    System.out.print("[");
    for (int i = 1; i < arr.length; i++) {

      for (int j = 1; j < arr.length; j++) {

        for (int k = 1; k < arr.length; k++) {

          if (i != j && i != k && j != k && arr[i] + arr[j] + arr[k] == 0) {

            System.out.print("[" + arr[i] + "," + arr[j] + "," + arr[k] + "]");

          }

        }

      }

    }
    System.out.print(']');
  }

  public static void main(String[] args) {
    int array[] = { -1, 0, 1, 2, -1, -4};

    check(array);
  }
}
