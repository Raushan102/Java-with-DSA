package basic;

public class Primitive {

    public  static void febo(int n){
        int a=0;int b=1;
        System.out.print(a);

        while(n!=1){
             b=a+b;
             a=b-a;
             n--;
            System.out.print(" " + b);
        }
    }

    public  static  void twop(){
        int [] arry={3,4,5,7,7,7,34,2,3,32,7};
        int key=7;
        int start = 0;
        int end=arry.length-1;
        int count=0;
        int d=0;

        while(start <= end){
            if(arry[start]==key || arry[end]==key){
               count++;
            }
            System.out.println(++d);
            start++;
            end--;
        }
        System.out.println("value of  count = "+count);

    }


    public  static  void checkedString(String name){
        name="golu kumar saw ";
    }
    static int a=10;
    public static void main(String[] args) {
        // what is primitive datatype ?
        // data type that can not be divided in to another datatype is called primitive datatype .
        // int a =24 , char='h' ;
        // but string c="hello this is raushan" ; this is not string because this can be further divided in char


        int roll_no = 34;
        char letter = 'h';
        float marks = 34.34f; // we add F suffix because java default datatype of decimal value is double to indicate the i
                               // float we add f same with L default datatype  of integer is int ;
        double largeDecimalValue = 34234532.3422;
        long largerInteger = 3242443423443432L;
        boolean check=false ;
        String name = "raushan kumar saw ";

     checkedString(name);
        System.out.println(name );




    }

}
