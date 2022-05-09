package lesson10.task2;

import java.util.Scanner;

public class Title {
    private static String bookName;

    public Title(String bookName) {
        Title.bookName = bookName;
    }

    public Title() {
        Title.bookName = "No information";
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(Scanner name) {
        System.out.println("Enter book name: ");
        Title.bookName = name.nextLine();
    }

    public void show() {
        System.out.println(bookName);
    }
}
