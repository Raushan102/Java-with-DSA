package other;
public class Patter1 {
   public static void main(String[] args) {
     for(int i=1;i<=5;i++){
          if(i==3){
            for(int j=1;j<=7;j++){
              System.out.print('*');
            }
            continue;
          }
          for(int j=1;j<=2;j++){
            System.out.print(' ');
          }
          for(int k=1;k<=1;k++){
            System.out.println('*');
          }
     }
   }
}
