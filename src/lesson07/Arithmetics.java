package lesson07;

import java.util.Scanner;

public class Arithmetics {
    private static final Scanner scanner = new Scanner(System.in);
    private static int a;
    private static int b;
    private static char action;

    public static void main(String[] args) {
        scanner();
        switch (action) {
            case '+':
                System.out.println(add(a, b));
                break;
            case '-':
                System.out.println(sub(a, b));
                break;
            case '*':
                System.out.println(mul(a, b));
            case '/':
                System.out.println(div(a, b));
                break;
            default:
                System.out.println("Choose another action");
        }
    }

    private static void scanner() {

        System.out.println("Enter the first number: ");
        a = scanner.nextInt();
        System.out.println("Enter the second number: ");
        b = scanner.nextInt();
        System.out.println("Choose action +, -, *, /: ");
        action = scanner.next().charAt(0);

    }

    private static int add(int a, int b) {
        return a + b;
    }

    private static int sub(int a, int b) {
        return a - b;
    }

    private static int mul(int a, int b) {
        return a * b;
    }

    private static int div(int a, int b) {
        if (b == 0) {
            System.out.println("Can not divide by zero");
            return 0;
        }
        return a / b;
    }

}
