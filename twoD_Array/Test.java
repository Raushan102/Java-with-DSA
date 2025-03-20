package twoD_Array;

public class Test {
  // O(n^2)
  public static void spiralMatrix(int arr[][]) {

    int startRow = 0;
    int endRow = arr.length - 1;
    int startCol = 0;
    int endCol = arr[0].length - 1;

    while (startCol <= endCol && startRow <= endRow) {
      // top
      for (int i = startRow; i <= endCol; i++) {
        System.out.print(arr[startRow][i] + " ");
      }
      // right
      for (int j = startRow + 1; j <= endRow; j++) {
        System.out.print(arr[j][endCol] + " ");
      }
      // bottom

      for (int b = endCol - 1; b >= startCol; b--) {
        if (startRow == endRow) {
          break;
        }
        System.out.print(arr[endRow][b] + " ");
      }

      // left

      for (int l = endRow - 1; l >= startRow + 1; l--) {

        if (startCol == endCol) {
          break;
        }
        System.out.print(arr[l][startCol] + " ");
      }

      startRow++;
      endRow--;
      startCol++;
      endCol--;

    }

  }

  // time complexity O(n)
  public static int diagonalSum(int arr[][]) {
    int sum = 0;
    for (int i = 0; i < arr.length; i++) {
      sum += arr[i][i];
      if (i != arr.length - 1 - i) {
        sum += arr[i][arr.length - 1 - i];
      }
    }

    return sum;
  }

  // time complexity of o(N+M) its depend on the which one is greater n > m and
  // m>n
  public static void search(int arr[][], int key) {
    int row = 0;
    int col = arr[0].length - 1;

    while (row < arr.length && col >= 0) {
      if (arr[row][col] == key) {
        System.out.println("[" + row + "]" + "[" + col + "]");
        return;
      }

      if (arr[row][col] > key) {
        col--;
      } else {
        row++;
      }

    }
    System.out.println("key not found");
  }

  public static void Transpose(int arr[][]) {
    int startRow = 0;
    int endRow = arr.length;
    int startCol = 0;
    int endCol = arr[0].length;

    int TransposedMat[][] = new int[endCol][endRow];

    for (int i = startRow; i < endRow; i++) {
      for (int j = startCol; j < endCol; j++) {
        TransposedMat[j][i] = arr[i][j];
      }
    }

    for (int i = 0; i < TransposedMat.length; i++) {
      for (int j = 0; j < TransposedMat[0].length; j++) {
        System.out.print(TransposedMat[i][j]+" ");
      }
      System.out.println();
    }
  }

  public static void main(String[] args) {
    int array[][] = { { 1, 2, 3, 4 }, { 12, 13, 14, 5 }, { 11, 16, 15, 6 }, { 10, 9, 8, 7 } };

    int arr[][] = { { 10, 20, 30, 40 }, { 15, 25, 35, 45 }, { 27, 29, 37, 48 }, { 32, 33, 39, 50 } };
    spiralMatrix(array);
    System.out.println();
    System.out.println(diagonalSum(array));

    search(arr, 29);
    
    int d[][]={{2,3,5,6,7},{3,6,4,8,54}};
    Transpose(d);
  }

}
