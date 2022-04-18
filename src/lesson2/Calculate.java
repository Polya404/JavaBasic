package lesson2;

import java.util.Scanner;

public class Calculate {
    static Scanner in = new Scanner(System.in);
    static double num1;
    static double num2;

    public static void main(String[] args) {
        try {
            boolean flag = true;
            while (flag) {
                data();
                calculate(num1, num2);
                System.out.println("Want to continue? Write 1 = yes or 0 = no");
                byte answer = in.nextByte();
                if ((answer == 1) || (answer == 0)) {
                    if (answer == 0) {
                        flag = false;
                    }
                } else {
                    System.out.println("You entered incorrect data");
                    flag = false;
                }
            }
        } catch (Exception ex) {
            System.out.println("Wrong");
        }
    }

    public static void data() {
        try {

            System.out.println("Input a numbers: ");
            num1 = in.nextInt();
            num2 = in.nextInt();
            System.out.println("choose an action and press the appropriate number:\n" +
                    "'+' = 1, '-' = 2, '*' = 3, '/' = 4, '>' = 5, '<' = 6");
        } catch (Exception ex) {
            System.out.println("You entered incorrect data");
        }
    }

    public static void calculate(double num1, double num2) {

        byte choose = in.nextByte();
        try {
            if ((choose == 1) || (choose == 2) || (choose == 3) || (choose == 4) || (choose == 5) || (choose == 6)) {
                if ((num1 == num2) && ((choose == 5) || (choose == 6))) {
                    System.out.println("The numbers are equal");
                } else {
                    switch (choose) {
                        case 1 -> System.out.println(num1 + "+" + num2 + "=" + (num1 + num2));
                        case 2 -> System.out.println(num1 + "-" + num2 + "=" + (num1 - num2));
                        case 3 -> System.out.println(num1 + "*" + num2 + "=" + (num1 * num2));
                        case 4 -> System.out.println(num1 + "/" + num2 + "=" + (num1 / num2));
                        case 5 -> System.out.println(num1 + ">" + num2 + "=" + (num1 > num2));
                        case 6 -> System.out.println(num1 + "<" + num2 + "=" + (num1 < num2));
                    }
                }
            } else {
                System.out.println("You entered incorrect data");
            }
        } catch (Exception ex) {
            System.out.println("You entered incorrect data");
        }
    }
}
