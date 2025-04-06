package recursion.easy_question.numberQuestion;

public class CountZero {

  static int countHelper(int number, int count) {
    if (number % 10 == number) {
      if (number == 0) {

        return ++count;
      }else{
        return count;
      }
    }

    if (number % 10 == 0) {
      return countHelper(number/10, ++count);
    }
    return countHelper(number/10, count);

  }

  static int count(int number) {
    return countHelper(number, 0);
  }

  public static void main(String[] args) {
    System.out.println(count(230230230));
  }
}
