package oops;

public class SwapTest {
  public static void swapNumber(int a ,int b) {
    int temp = a;
    a = b;
    b = temp;
  }

  public static void main(String[] args) {
    int a =10;
    int b=20;

  swapNumber(a,b);
  
  Student st=new  Student("rohan ",345,34.9f);

  System.out.println(st.name);

  Hello h=new Hello();
  h.name="hello1";

  System.out.println(h.name);

  }
}
