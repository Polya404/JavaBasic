package lesson17;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Worker {
    private static final Scanner scanner = new Scanner(System.in);
    private String fullName;
    private String position;
    private int startYear;
    private static final Worker[] workers = new Worker[5];

    @Override
    public String toString() {
        return "Worker{" +
                "fullName='" + fullName + '\'' +
                ", position='" + position + '\'' +
                ", startYear=" + startYear +
                '}';
    }

    public int getWorkLength() {
        return 2022 - startYear;
    }

    public Worker(String fullName, String position, int startYear) {
        this.fullName = fullName;
        this.position = position;
        this.startYear = startYear;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public int getStartYear() {
        return startYear;
    }

    public void setStartYear(int startYear) {
        this.startYear = startYear;
    }

    public static void program() {
        for (int i = 0; i < 5; i++) {
            try {
                System.out.println("Введите данные о " + (i + 1) + " работнике: ");
                System.out.println("    Ф.И.О.: ");
                var fullName = scanner.hasNext() ? scanner.next() : null;
                System.out.println("    Должность: ");
                var position = scanner.hasNext() ? scanner.next() : null;
                System.out.println("    Год поступления на работу: ");
                var startYear = scanner.nextInt();
                Worker.workers[i] = new Worker(fullName, position, startYear);
            } catch (InputMismatchException | NullPointerException ex) {
                System.out.println(ex.getMessage());
                break;
            }
        }
        SortWorkers(workers);
        printWorkers(workers);
        try {
            System.out.println("Введите необходимый стаж работы: ");
            int searchingWorkLength = scanner.nextInt();
            System.out.println("Работники со стажем " + searchingWorkLength + " и более:");
            int foundCount = 0;
            for (int i = 0; i < workers.length; i++) {
                if (workers[i].getWorkLength() >= searchingWorkLength) {
                    System.out.println(workers[i]);
                    foundCount++;
                }
            }
            if (foundCount == 0) {
                System.out.println("Работников со стажем " + searchingWorkLength + " не обнаружено.");
            }
        } catch (InputMismatchException ex) {
            System.out.println(ex.getMessage());
        }
    }


    private static void printWorkers(Worker[] workers) {
        System.out.println("Список рабочих:");
        for (var worker : workers) {
            System.out.println(worker);
        }
    }

    private int CompareTo(Object obj) {
        var an_worker = (Worker) obj;
        return this.fullName.compareTo(an_worker.fullName);
    }

    private static void SortWorkers(Worker[] workers) {
        boolean t = true;
        while (t) {
            t = false;
            try {
                for (int i = 0; i < workers.length - 1; i++) {
                    if (workers[i].CompareTo(workers[i + 1]) == 1) {
                        var temp = workers[i];
                        workers[i] = workers[i + 1];
                        workers[i + 1] = temp;

                        t = true;
                    }
                }
            } catch (NullPointerException ex) {
                System.out.println(ex.getMessage());
            }
        }
    }
}
