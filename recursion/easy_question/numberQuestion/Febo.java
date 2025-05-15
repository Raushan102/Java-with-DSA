package recursion.easy_question.numberQuestion;

public class Febo {

    public  static  int febo(int n){
        if(n<2){
            return n;
        }
        return febo(n-1)+febo(n-2);

    }
    public static void main(String[] args) {
       int f= febo(10);
        System.out.println(f);
    }
}
