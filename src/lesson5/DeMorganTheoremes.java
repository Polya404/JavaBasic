package lesson5;

import java.util.Scanner;

public class DeMorganTheoremes {
    private static Scanner in = new Scanner(System.in);
    private static boolean a;
    private static boolean b;

    public static void main(String[] args) {
        System.out.println("Enter a and b");
        try {

            a = in.nextBoolean();
            b = in.nextBoolean();

            one(a, b);
            System.out.println();
            two(a, b);
            System.out.println();
            three(a, b);
            System.out.println();
            four(a, b);
            System.out.println();
            five(a, b);
            System.out.println();
            six(a, b);
            System.out.println();
            seven(a, b);
            System.out.println();
            eight(a, b);

        } catch (Exception ex) {
            System.out.println("Try again");
        }
        pow2();
        changeAB();

    }

    public static void pow2() {
        // с каждым сдвигом число умножается на 2
        for (int i = 0; i < 10; i++) {
            System.out.println((i + 1) + " степень двойки = " + (2 << i)); // два умножаем на 2 в степени i
        }
    }

    public static void changeAB() {
        int a = 5;
        int b = 3;
        a = b;
        // вначале 3 + 3, затем операция 3 "и" 3,
        // что дает в результате побитовго сравнения
        // нам 2 и добавляем переменную а, которая равна 3
        // получаем 5
        b = (a & b + b) + a;

        System.out.println("a = " + a + "\nb = " + b);
    }

    public static boolean one(boolean a, boolean b) {
        System.out.println("(!a & !b): " + (!a & !b));
        System.out.println("!(a | b): " + (!(a | b)));
        return (!a & !b);
    }

    public static boolean two(boolean a, boolean b) {
        System.out.println("(!a & b): " + (!a & b));
        System.out.println("!(a | !b): " + !(a | !b));
        return (!a & b);
    }

    public static boolean three(boolean a, boolean b) {
        System.out.println("(a & !b): " + (a & !b));
        System.out.println("!(!a | b): " + !(!a | b));
        return (a & !b);
    }

    public static boolean four(boolean a, boolean b) {
        System.out.println("(a & b): " + (a & b));
        System.out.println("!(!a | !b): " + !(!a | !b));
        return (a & b);
    }

    public static boolean five(boolean a, boolean b) {
        System.out.println("(!a | !b): " + (!a | !b));
        System.out.println("!(a & b): " + !(a & b));
        return (!a | !b);
    }

    public static boolean six(boolean a, boolean b) {
        System.out.println("(!a | b): " + (!a | b));
        System.out.println("!(a & !b): " + !(a & !b));
        return (!a | b);
    }

    public static boolean seven(boolean a, boolean b) {
        System.out.println("(a | !b): " + (a | !b));
        System.out.println("!(!a & b): " + !(!a & b));
        return (a | !b);
    }

    public static boolean eight(boolean a, boolean b) {
        System.out.println("(a | b): " + (a | b));
        System.out.println("!(!a & !b): " + !(!a & !b));
        return (a | b);
    }
}
