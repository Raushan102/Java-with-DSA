package other;
public class T {
  public static int check(int a, int n) {
    System.out.println("n = "+n);
    if (n == 0) {
      return 1;
    }
    int halPower = check(a, n / 2);
    int halfPowerSqr=halPower * halPower;
    if (n % 2 != 0) {
      halfPowerSqr = a * halfPowerSqr;
    }
   
    System.out.println("half po ="+ halfPowerSqr);
    return halfPowerSqr;
  }

  public static void main(String[] args) {

  
    int a = 2;
    int n = 10;
   System.out.println(check(a, n));
  }
}
