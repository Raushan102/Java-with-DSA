package arrayProblem;

public class Palindromic_Pattern {
   public static void main(String[] args) {
    int count=1;
    int row=5;
     for(int line=1;line<=row;line++){
      for(int space=1;space<=row-line;space++){
        System.out.print(" ");
      
      }
      for(int c=1;c<=line;c++){
        System.out.print(" "+count);
      }
      count++;
      System.out.println();
     }
   }
}
