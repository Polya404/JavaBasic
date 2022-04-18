package lesson10.Task1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Rectangle {
    private final double side1;
    private final double side2;
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        try {
            double side1 = scanner.nextDouble();
            double side2 = scanner.nextDouble();
            Rectangle r = new Rectangle(side1, side2);
            r.print();
        } catch (InputMismatchException e) {
            System.out.println("Пишите через запятую");
            e.printStackTrace();
        }

    }

    public double getSide1() {
        return side1;
    }

    public double getSide2() {
        return side2;
    }

    public Rectangle(double side1, double side2) {
        this.side1 = side1;
        this.side2 = side2;
    }

    private static double areaCalculator(double side1, double side2) {
        return side1 * side2;
    }

    private static double perimeterCalculator(double side1, double side2) {
        return 2 * (side1 + side2);
    }

    private void print() {
        System.out.println(areaCalculator(this.side1, this.side2));
        System.out.println(perimeterCalculator(this.side1, this.side2));
    }
}
