package lesson10.Task2;

import java.util.Arrays;
import java.util.Scanner;

public class Book {
    private static final String[] book = new String[3];
    private static final Scanner s = new Scanner(System.in);

    public Book(Title t, Author a, Content c) {
        book[0] = t.getBookName();
        book[1] = a.getAuthorName();
        book[2] = c.getContent();
    }

    public Book() {
        System.out.println("No information about the book");
    }

    public void show() {
        System.out.println(Arrays.toString(book));
    }

    public static void main(String[] args) {
        Book empty = new Book();
        empty.show();
        Title t = new Title("Приключения Незнайки");
        Author a = new Author("Николай Носов");
        Content c = new Content("Незнайка на Луне");
        Book first = new Book(t, a, c);
        first.show();
        t.setBookName(s);
        a.setAuthorName(s);
        c.setContent(s);
        Book second = new Book(t, a, c);
        second.show();
    }
}
