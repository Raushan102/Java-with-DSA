package arrayProblem;

public class Decimal_to_Binary {
  public static void main(String[] args) {
    int decimalNumber = 20;
    int binary = 0;
    int multiple = 1;
    while (decimalNumber > 0) {
      int r = decimalNumber % 2;
      binary = binary + r * multiple;
      decimalNumber = decimalNumber / 2;
      multiple *= 10;
      

    }

    System.out.println(binary);
  }
}
