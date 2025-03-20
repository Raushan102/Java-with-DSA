package backTracking;

import java.lang.reflect.Array;

public class Queen2 {

  public static void printArray(String str[][]) {
    for (int i = 0; i < str.length; i++) {
      for (int j = 0; j < str[0].length; j++) {
        System.out.print(str[i][j]);
      }
      System.out.println();
    }
  }
  public static void printZero(String str[][]) {
    for (int i = 0; i < str.length; i++) {
      for (int j = 0; j < str[0].length; j++) {
       str[i][j]="X";
      }
      System.out.println();
    }
  }

  public static void placeString(String str[][], int i) {
    if (i == str.length) {
      printArray(str);
      System.out.println("__________________");
      return;
    }

    for (int j = 0; j < str[0].length; j++) {
      str[i][j] = "Q";
      placeString(str, i + 1);
      str[i][j]="X";
    }
  }
  

  public static void main(String[] args) {
    String strArray[][] = new String[2][2];
    
    printZero(strArray);
    placeString(strArray, 0);
  }

}
