package backTracking;

public class Queen {

  public static boolean isSafe(char board[][], int row, int col) {
    for (int i = row - 1; i >= 0; i--) {
      if (board[i][col] == 'Q') {
        return false;
      }
    }

    for (int i = row - 1, j = col - 1; i >= 0 && j >= 0; j--, i--) {
      if (board[i][j] == 'Q') {
        return false;
      }
    }

    for (int i = row - 1, j = col + 1; i >= 0 && j < board[0].length; j++, i--) {
      if (board[i][j] == 'Q') {
        return false;
      }
    }

    return true;

  }

  public static void fillQueen(char board[][], int row) {
    if (row == board.length) {
      printBoard(board);
      return;
    }
    for (int j = 0; j < board[0].length; j++) {
        
      if (isSafe(board, row, j)) {
        board[row][j] = 'Q';
        fillQueen(board, row + 1);
        board[row][j] = 'x';
      }

    }

  }
  // print board

  public static void printBoard(char board[][]) {
    System.out.println("===================================");
    for (int i = 0; i < board.length; i++) {
      for (int j = 0; j < board[0].length; j++) {
        System.out.print(board[i][j] + "|");

      }
      System.out.println();
      System.out.println("-------------");
    }
  }

  public static void main(String[] args) {

    char board[][] = new char[5][5];

    for (int i = 0; i < board.length; i++) {
      for (int j = 0; j < board[0].length; j++) {
        board[i][j] = 'x';
      }
    }

    fillQueen(board, 0);
  }

}
