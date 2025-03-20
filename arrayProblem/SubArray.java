package arrayProblem;

public class SubArray {
  public static void main(String[] args) {
    int Array[] = { 2, 4, 6, 8, 10, 12 };
    for (int i = 0; i < Array.length; i++) {

      int min = Integer.MAX_VALUE;
      int max = Integer.MIN_VALUE;
      for (int j = i+1 ; j <= Array.length; j++) {
        System.out.print("(");
        int sum = 0;
        for (int k = i; k < j; k++) {
          if (k == i) {
            System.out.print(Array[k]);
            sum += Array[k];
          } else {
            System.out.print("," + Array[k]);
            sum += Array[k];
          }

        }
        System.out.print(")");
        if (sum > max) {
          max = sum;
        }
        if (sum < min) {
          min = sum;
        }
      }
      System.out.println(" maximum between some is equal to " + max + " and minimum between the pairs is = " + min);
      System.out.println();
    }
  }
}

// (2)(2,4)(2,4,6)(2,4,6,8)(2,4,6,8,10)
// (4)(4,6)(4,6,8)(4,6,8,10)(6)(6,8)(6,8,10)(8)(8,10)(10)

// (2)(2,4)(2,4,6)(2,4,6,8)(2,4,6,8,10)

// (2)(2,4)(2,4,6)(2,4,6,8)(2,4,6,8,10)(2,4,6,8,10,12)

// maximum between
// some is
// equal to 42
// and minimum
// between the
// pairs is = 2

// (4)(4,6)(4,6,8)(4,6,8,10)(4,6,8,10,12)
// maximum between
// some is
// equal to 40
// and minimum
// between the
// pairs is = 4

// (6)(6,8)(6,8,10)(6,8,10,12)
// maximum between
// some is
// equal to 36
// and minimum
// between the
// pairs is = 6

// (8)(8,10)(8,10,12)
// maximum between
// some is
// equal to 30
// and minimum
// between the
// pairs is = 8

// (10)(10,12)
// maximum between
// some is
// equal to 22
// and minimum
// between the
// pairs is = 10

// (12)
// maximum between
// some is
// equal to 12
// and minimum
// between the
// pairs is = 12