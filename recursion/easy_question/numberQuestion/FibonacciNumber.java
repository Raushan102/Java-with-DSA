package recursion.easy_question.numberQuestion;

public class FibonacciNumber {

  public static int fibonacci(int n) {
    if (n <= 1) {
      return n;
    }
    return fibonacci(n - 1) + fibonacci(n - 2);
  }

  public static void main(String[] args) {

    int n = fibonacci(8);
    System.out.println(n);
  }
}
