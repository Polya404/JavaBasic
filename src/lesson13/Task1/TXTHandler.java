package lesson13.Task1;

public class TXTHandler extends AbstractHandler{
    @Override
    void open() {
        System.out.println("You opened txt document");
    }

    @Override
    void create() {
        System.out.println("Creating a new txt document");
    }

    @Override
    void change() {
        System.out.println("You changed the txt document");
    }

    @Override
    void save() {
        System.out.println("txt document saved");
    }
}
