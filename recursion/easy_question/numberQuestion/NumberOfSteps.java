package recursion.easy_question.numberQuestion;

public class NumberOfSteps {

  static int steps(int number) {
    return helper(number, 0);
  }

  private static int helper(int number, int steps) {
    if (number == 0)
      return steps;

    if (number % 2 == 0) {
      return helper(number / 2, ++steps);
    }
    return helper(--number, ++steps);

  }

  public static void main(String[] args) {
    System.out.println(steps(234));
  }
}
