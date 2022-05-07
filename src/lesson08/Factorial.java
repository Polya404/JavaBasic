package lesson08;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.print("Факторил числа " + n + " равен " );
        System.out.println(factorial(n));
    }

    private static long factorial(int n){
        if (n < 0){
            return 0;
        }
        if (n == 0 || n == 1){
            return 1;
        }
        else {
            return n * factorial(n-1);
        }
    }
}
