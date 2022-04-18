package lesson10.Task2;

import java.util.Scanner;

public class Content {
    private static String content;

    public Content(String content) {
        Content.content = content;
    }

    public Content() {
        Content.content = "No information";
    }

    public String getContent() {
        return content;
    }

    public void setContent(Scanner content) {
        System.out.println("Enter content: ");
        Content.content = content.nextLine();
    }

    public void show() {
        System.out.println(content);
    }

}
