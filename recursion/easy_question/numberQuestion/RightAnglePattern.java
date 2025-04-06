package recursion.easy_question.numberQuestion;

public class RightAnglePattern {

  public static void printPattern(int row, int col) {
    if (row == 0) {
      return;
    }
    if (col == 0) {
      row--;
      col = row;
      System.out.println();
      printPattern(row, col);
      return;
    }
    System.out.print("*");

    printPattern(row, --col);

  }

  public static void main(String[] args) {
    printPattern(4, 4);

  }

}
