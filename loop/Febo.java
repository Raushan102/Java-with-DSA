package loop;

public class Febo {
    int x = 10; // Instance variable

      public void myMethod() {

//        System.out.println("Value of x using this keyword: " + this.x); // Output: 10
        if(true){
            int x = 30; // This local variable shadows both the instance and method variables within this block
            System.out.println("Value of x inside block: " + x); // Output: 30
        }
        System.out.println("Value of x after block: " + x); // Output: 20 (The block's x is no longer in scope)
    }
    public static void main(String[] args) {


       new Febo().myMethod();
    }
}
