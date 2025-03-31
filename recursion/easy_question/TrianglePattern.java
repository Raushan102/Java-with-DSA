package recursion.easy_question;

public class TrianglePattern {

  public static void PrintTriangle(int row,int start){

    if(row==0){
      return;
    }
    printSpace(row, 1);
   printStar(row,start);
    System.out.println();
    PrintTriangle(--row,++start);
  }

  public static void printSpace(int row, int spaceCount) {

    if (spaceCount == row) {
      return;
    }
    System.out.print(" ");
    printSpace(row, ++spaceCount);
  }

  public static void printStar(int row,int start){
    if(start==0){
      return;
    }
    System.out.print("*");
    System.out.print(" ");
    printStar(row,--start);
  }

  public static void main(String[] args) {
  PrintTriangle(4,1);
  }
}
