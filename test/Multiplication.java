package test;
import java.util.*;

public class Multiplication {

  public static void fillMatrix(String matrixName,int[][] matrix) {
    Scanner sc = new Scanner(System.in);
    System.out.println("enter the element of the of matrix "+ matrixName );
    for (int i = 0; i < matrix.length; i++) {
      for (int j = 0; j < matrix[0].length; j++) {
        matrix[i][j] = sc.nextInt();
      }
    }
  
  }

  public static void main(String[] args) {

    int[][] matrix1 = new int[2][2];
    int[][] matrix2 = new int[2][2];
    int[][] MultiplicationMatrix = new int[2][2];
    fillMatrix("matrix1",matrix1);
    fillMatrix("matrix2",matrix2);

    for (int i = 0; i < MultiplicationMatrix.length; i++) {
      for (int j = 0; j < MultiplicationMatrix[0].length; j++) {
        MultiplicationMatrix[i][j] = matrix1[i][j] * matrix2[i][j];
      }
    }
    System.out.println("Multiplication of matrix1 and matrix 2");

    for (int i = 0; i < MultiplicationMatrix.length; i++) {
      System.out.print("[");
      for (int j = 0; j < MultiplicationMatrix[0].length; j++) {
       System.out.print(MultiplicationMatrix[i][j]+" ");
      }
      System.out.println("]");
    }
  
  }
}
