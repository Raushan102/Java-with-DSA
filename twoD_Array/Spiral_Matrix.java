package twoD_Array;

public class Spiral_Matrix {

  public static void spiral(int arr[][]) {
    int startRow = 0;
    int endRow = arr.length - 1;
    int startCol = 0;
    int endCol = arr[0].length - 1;

    while (startRow <= endRow && startCol <= endCol) {
      // start
      for (int i = startCol; i <= endCol; i++) {
        System.out.print(arr[startRow][i] + " ");
      }
      // right
      for (int j = startRow + 1; j <= endRow; j++) {
        System.out.print(arr[j][endCol] + " ");
      }
      // left
      for (int k = endCol - 1; k >= startRow; k--) {
        if (startCol == endCol) {
          break;
        }
        System.out.print(arr[endRow][k] + " ");
      }
      // botton
      for (int m = endRow - 1; m >= startCol + 1; m--) {
        if (startRow == endRow) {
          break;
        }
        System.out.print(arr[m][startCol] + " ");
      }

      startRow++;
      startCol++;
      endCol--;
      endRow--;

    }
  }

  public static void main(String[] args) {
    int array[][] = { { 1, 2, 3, 4 }, { 12, 13, 14, 5 }, { 11, 16, 15, 6 }, { 10, 9, 8, 7 } };
    int arry[][] = { { 1, 2, 3 }, { 10, 11, 4 }, { 9, 12, 5 } };

    spiral(arry);
  }
}