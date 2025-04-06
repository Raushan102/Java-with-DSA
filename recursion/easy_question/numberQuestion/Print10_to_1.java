package recursion.easy_question.numberQuestion;

public class Print10_to_1 {

  public static void Decreasing(int n) {
    if (n == 1) {
      System.out.print(n);
      return;
    }
    System.out.print(n + " ");
    Decreasing(n - 1);
  }

  public static void main(String[] args) {
    int n = 10;
    Decreasing(n);
  }
}
