package functions;

public class VarLengthVariable {
    public static void main(String[] args) {
         f1(43);   //
    }

    public  static  void f1(int ...name){
        System.out.println("hello");
        System.out.println(name.toString());
    }
    public static  void  f1(String ...student){
        System.out.println("hello2");
        System.out.println(student);
    }

}
