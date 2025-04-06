package recursion.easy_question.numberQuestion;

public class fibonacci {
  public static int fibonacciOf(int n) {
    if (n == 0) {
      return n;
    }
    if (n == 1) {
      return n;
    }
    int fnm1 = fibonacciOf(n - 1);
    int fnm2 = fibonacciOf(n - 2);
    int fibonacciOfn = fnm1 + fnm2;
  
    return fibonacciOfn;
  }

  public static void main(String[] args) {
    int n = 5;

    System.out.println("feb = " + fibonacciOf(n));

  }

}
