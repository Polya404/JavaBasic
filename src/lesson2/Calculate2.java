package lesson2;
import java.util.Scanner;

public class Calculate2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Input a numbers: ");
        int a = in.nextInt();
        int b = in.nextInt();

        System.out.println(sum(a,b));
        System.out.println(difference(a,b));
        System.out.println(multiplication(a,b));
        System.out.println(division(a,b));
    }


    public static int sum (int a,int b){

        return a + b;
    }

    public static int difference(int a, int b) {
        return a-b;
    }

    public static int multiplication (int a, int b){
        return a*b;
    }

    public static int division (int a, int b){
        return a/b;
    }
}
