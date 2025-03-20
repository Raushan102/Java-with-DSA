package test;
public class Main {
  public static void main(String[] args) {
    ThreadZ th = new ThreadZ();
    th.start();
    int i=0;
    while (i!=1000) {
      System.out.println("raushan");
      i++;
    }
  }
}
