package lesson03;

import java.util.Objects;
import java.util.Scanner;

public class homeWork {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        boolean flag = true;
        while (flag) {
            int num1 = getInt();
            int num2 = getInt();
            char operation = getOperation();
            int result = calc(num1, num2, operation);
            System.out.println("Результат операции: " + result);
            System.out.println("Хотите продолжить? Напишите да или нет");
            String answer = scanner.next();
            if ((Objects.equals(answer, "да")) || (Objects.equals(answer, "нет"))) {
                if (answer.equals("нет")) {
                    flag = false;
                }
            } else {
                System.out.println("Вы допустили ошибку при вводе");
                flag = false;
            }
        }
    }

    public static int getInt(){
        System.out.println("Введите число:");
        int num;
        if(scanner.hasNextInt()){
            num = scanner.nextInt();
        } else {
            System.out.println("Вы допустили ошибку при вводе числа. Попробуйте еще раз.");
            scanner.next();
            num = getInt();
        }
        return num;
    }

    public static char getOperation(){
        System.out.println("Введите операцию:");
        char operation;
        if(scanner.hasNext()){
            operation = scanner.next().charAt(0);
        } else {
            System.out.println("Вы допустили ошибку при вводе операции. Попробуйте еще раз.");
            scanner.next();
            operation = getOperation();
        }
        return operation;
    }

    public static int calc(int num1, int num2, char operation){
        int result;
        switch (operation) {
            case '+' -> result = num1 + num2;
            case '-' -> result = num1 - num2;
            case '*' -> result = num1 * num2;
            case '/' -> result = num1 / num2;
            default -> {
                System.out.println("Операция не распознана. Повторите ввод.");
                result = calc(num1, num2, getOperation());
            }
        }
        return result;
    }
}
