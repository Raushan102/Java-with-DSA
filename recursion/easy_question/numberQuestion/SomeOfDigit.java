package recursion.easy_question.numberQuestion;

public class SomeOfDigit {

   // add
   static int someOfDigitOfNumber(int n) {

      if (n == 0) {
         return 0;
      }

      return n % 10 + someOfDigitOfNumber(n / 10);
   }
   // multiply

   static int MultipleOfDigitOfNumber(int n) {

      if (n % 10 == n) {
         return n;
      }

      return n % 10 * someOfDigitOfNumber(n / 10);
   }

   // keep in mind

   static void print(int n) {
      if (n == 0) {
         return;
      }
      System.out.println(n);
      // print(n--);     // give me stack overFlow error because n-- means first pass the value the subtract
      print(--n);      //  this is the correct way  of doing this because --n means first subtract and then pass or assign
   }

   public static void main(String[] args) {
      System.out.println("this is the test stign ");
      System.out.println(someOfDigitOfNumber(1765));
   }
}
