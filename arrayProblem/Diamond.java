
package arrayProblem;

public class Diamond {
  public static void main(String[] args) {
     int row=4;
     // first part of diamond
     for (int line = 1; line <= row; line++) {
       for (int space = 1; space <= (2 * 2) - line; space++) {
         System.out.print(" ");
       }
       for (int star = 1; star <= 2 * line - 1; star++) {
         System.out.print("*");
       }
       System.out.println();
     }
     // second part of the diamond
   
     for (int line = row; line >= 1; line--) {
       for (int space = 1; space <= (2 * 2) - line; space++) {
         System.out.print(" ");
       }
       for (int star = 1; star <= 2 * line - 1; star++) {
         System.out.print("*");
       }
       System.out.println();
     }
  }
}
