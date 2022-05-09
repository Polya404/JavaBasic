package lesson13.task1;

public class DOCHandler extends AbstractHandler{
    @Override
    void open() {
        System.out.println("You opened doc document");
    }

    @Override
    void create() {
        System.out.println("Creating a new doc document");
    }

    @Override
    void change() {
        System.out.println("You changed the doc document");
    }

    @Override
    void save() {
        System.out.println("doc document saved");
    }
}
