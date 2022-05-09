package lesson13.task1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        definition("res.doc");
        definition("doc.txt");
        definition("ans.xml");
        definition("document");
    }

    private static void definition(String doc){
        if (doc.endsWith(".xml") || doc.endsWith(".jpeg"))
        {
            System.out.println("This is a XML document!");
            XMLHandler xml = new XMLHandler();
            redactor(xml);
        }
        else if (doc.endsWith(".txt") || doc.endsWith(".html"))
        {
            System.out.println("This is a TXT document");
            TXTHandler txt = new TXTHandler();
            redactor(txt);
        }
        else if (doc.endsWith(".doc") || doc.endsWith(".docx"))
        {
            System.out.println("This is a Word document");
            DOCHandler word = new DOCHandler();
            redactor(word);
        }
        else
        {
            System.out.println("Unknown format");
        }
    }

    private static void redactor(AbstractHandler doc){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Write what you want do: open, create, change, save");
        String action = scanner.nextLine();
        if (action.equals("open")){
            doc.open();
        }
        if (action.equals("create")){
            doc.create();
        }
        if (action.equals("change")){
            doc.change();
        }
        if (action.equals("save")){
            doc.save();
        }
    }
}
