package lesson4;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class MobilePhone {
    private static Scanner in = new Scanner(System.in);
    private static String operator;
    private static String sim1 = "3805078594";
    private static String sim2 = "3809594352";
    private static int balance1 = 5;
    private static int balance2 = 3;

    public static void main(String[] args) {
        boolean flag = true;
        while (flag) {
            menu();
            System.out.println("Хотите продолжить нажмите 1\n" +
                    "Чтоб завершить работу нажмите 0");
            int ch = in.nextInt();
            if ((ch == 0) || (ch == 1)) {
                if (ch == 0) {
                    System.out.println("Завершение работы");
                    break;
                }
            } else {
                System.out.println("Такого значения нет");
                break;
            }

        }
    }

    public static void menu() {
        try {
            System.out.println("""
                    Чтоб посмотреть данные пользователя нажмите 1
                    Чтоб посмотреть список контактов нажмите 2
                    Чтоб отправить смс нажмите 3
                    Чтоб посмотреть баланс или пополнить счет нажмите 4
                    Чтоб узнать тариф нажмите 5
                    Чтоб сменить оператора нажмите 6""");
            int action = in.nextInt();
            if ((action == 1) || (action == 2) || (action == 3) || (action == 4) || (action == 5) || (action == 6)) {
                switch (action) {
                    case 1 -> System.out.println("Данные пользователя: " + userData("Max", sim1, sim2));
                    case 2 -> System.out.println("Список контактов: " + contactList());
                    case 3 -> System.out.println("Отправлено: " + sendSms());
                    case 4 -> System.out.println(phoneBalance(balance2));
                    case 5 -> System.out.println(operatorTariff(operator));
                    case 6 -> changeOperator();
                }
            } else {
                System.out.println("Выберте другое действие");
            }
        } catch (Exception ex) {
            System.out.println("Что-то пошло не так");
        }
    }

    public static HashMap userData(String name, String mainNumber, String secondNumber) {
        HashMap<String, String> user = new HashMap<>();
        user.put("Main number", mainNumber);
        user.put("Second number", secondNumber);
        user.put("Name", name);
        return user;
    }

    public static String sendSms() {
        System.out.println("Введите смс");
        String text = in.next();
        System.out.println("Выберете с какого номера хотите отправить смс:\n 1 = Main number(sim1) or 2 = Second number(sim2)");
        int chooseNumber = in.nextInt();
        if ((chooseNumber == 1) || (chooseNumber == 2)) {
            if (chooseNumber == 1) {
                if (balance1 < 1) {
                    System.out.println("Недостаточно денег на счету");
                }
            }
            if (chooseNumber == 2) {
                if (balance2 < 1) {
                    System.out.println("Недостаточно денег на счету");
                }
            }
            System.out.println("Выберете кому хотите отправить смс");
            System.out.println(contactList());
            String contact = in.next();
            if ((contact.equals("Inna")) || (contact.equals("Alla")) || (contact.equals("Mike"))) {
                switch (contact) {
                    case "Alla" -> System.out.println("Отправленно Alla");
                    case "Inna" -> System.out.println("Отправленно Inna");
                    case "Mike" -> System.out.println("Отправленно Mike");
                }
            } else {
                System.out.println("Такого контакта нет");
                return null;
            }

            if (chooseNumber == 1) {
                System.out.println("смс отправлена с sim 1");
                balance1 -= 1;
            } else {
                System.out.println("смс отправлена с sim 2");
                balance2 -= 1;
            }
        } else {
            System.out.println("Вы ввели неправильное значение");
            return null;
        }
        return text;
    }

    public static int phoneBalance(int balance) {
        System.out.println("Выберете действие: 1 - пополнить баланс\n" +
                "2 - посмотреть счет");
        int action = in.nextInt();
        if ((action == 1) || (action == 2)) {
            if (action == 1) {
                System.out.println("Введите сумму");
                int money = in.nextInt();
                balance += money;
                System.out.print("На вашем счету: ");
            } else {
                System.out.print("На вашем счету: ");

            }
        } else {
            System.out.println("Вы ввели неправильное значение");
            return 0;
        }
        return balance;
    }


    public static ArrayList operatorTariff(String operator) {
        ArrayList<String> data = new ArrayList<>();
        operator = "MTS";
        data.add(operator);
        data.add("150 грн / мес");
        data.add("1Гб");
        data.add("Бесплатные звонки в вашей стране");
        return data;

    }

    public static void changeOperator() {
        System.out.println("У вас оператор мтс, выберете подходящего оператора");
        System.out.println("1 - Киевстар; 2 - MTS; 3 - Билайн ");
        int change = in.nextInt();
        if ((change == 1) || (change == 2) || (change == 3)) {
            switch (change) {
                case 1 -> operator = "Киевстар";
                case 2 -> operator = "MTS";
                case 3 -> operator = "Билайн";
            }
            System.out.println("Вы поменяли оператора на " + operator);
        } else {
            System.out.println("Вы ввели неправильное значение");
        }
    }

    public static HashMap contactList() {
        HashMap<String, String> contacts = new HashMap<>();
        contacts.put("Alla", "3809643567");
        contacts.put("Inna", "0973862543");
        contacts.put("Mike", "38074528457");
        return contacts;
    }


}