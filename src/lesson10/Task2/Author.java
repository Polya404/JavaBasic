package lesson10.Task2;

import java.util.Scanner;

public class Author {
    private static String authorName;

    public Author(String authorName) {
        Author.authorName = authorName;
    }

    public Author() {
        Author.authorName = "No information";
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(Scanner authorName) {
        System.out.println("Enter author name: ");
        Author.authorName = authorName.nextLine();
    }

    public void show() {
        System.out.println(authorName);
    }

}
