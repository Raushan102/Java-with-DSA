package other;

import java.util.Scanner;

public class Secons {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long number = sc.nextLong();

        long factorial = 1;
        while (number != 0) {

            factorial = factorial * number;
            number--;

        }
        System.out.println("totoal digit of this number is = " + factorial);
    }
}
