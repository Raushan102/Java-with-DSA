package recursion;

public class Pair {
   public static int friendPairing(int n){
    if(n==1 || n==2){
      return 2;
    }
    int single=friendPairing(n-1);
    int pair=n-1*friendPairing(n-2);
    return single + pair;
   }
  public static void main(String[] args) {
     int n=3;
     System.out.println(friendPairing(n));
  }
}
