package other;
public class MAx {

  static void printMAx(int[] array1) {
    int max = 0;

    for (int number : array1) {
      if (max < number) {
        max = number;
      } else {
        continue;
      }
    }
    System.out.println("the max value in this array ="+max);
  }

  public static void main(String[] args) {
  
    int [] ar={1,2,3,4,5,6,7,8,10,1000};
    printMAx(ar);

  }
}
