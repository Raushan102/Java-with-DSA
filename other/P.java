package other;

public class P {

    public static void main(String[] args) {
        int row = 7;
        int col = 7;
        //=================================hoole rectangle================
        //     for (int i = 1; i <= row; i++) {
        //         for (int j = 1; j <= col; j++) {
        //             if (i == 1 || j == 1 || i == row || j == col) {
        //                 System.out.print("*");
        //             } else if (j>1 || j<col) {
        //                 System.out.print(' ');
        //             }
        //         }
        //         System.out.println();        }

        //================================
//      for(int i=4 ;i>=1;i--){
//       for(int j=1;j<=i;j++){
//         System.out.print("*");
//       }
//       System.out.println();
//      }
// 
//================================
        // for (int i = 1; i <= row; i++) {
        //     for (int j = 1; j <= row - i; j++) {
        //         System.out.print(" ");
        //     }
        //     for (int k = 1; k <= 2 * i - 1; k++) {
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }
//=============================
        for (int i = 1; i <= row; i++) {
            for (int j = i; j <= row; j++) {
                System.out.print(" "+j);
            }
            for (int k = 1; k <= i - 1; k++) {
                System.out.print(" "+k);
            }
            System.out.println();
        }
    }
}
