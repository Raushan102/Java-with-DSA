public class HardPattern {
  public static void main(String[] args) {
    char[] abc = { 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I' };

    int n = 5;

    for (int i = 1; i <= n; i++) {
      for (int j = 1; j <= n - i; j++) {
        System.out.print(' ');
      }
      for (int k = 1; k <= 2 * i - 1; k++) {
        System.out.print(abc[k - 1]);
      }

      System.out.println();
    }

    for (int i = n; i >= 1; i--) {

         if(i==n){
          continue;
         }
      for (int j = 1; j <= n - i; j++) {
        System.out.print(' ');
      }
      for (int k = 1; k <= 2 * i - 1; k++) {
        System.out.print(abc[k - 1]);
      }

      System.out.println();
    }

  }
}

// output

//     A
//    ABC
//   ABCDE
//  ABCDEFG
// ABCDEFGHI 
//  ABCDEFG
//   ABCDE
//    ABC
//     A
