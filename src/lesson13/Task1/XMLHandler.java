package lesson13.Task1;

public class XMLHandler extends AbstractHandler{
    @Override
    void open() {
        System.out.println("You opened xml document");
    }

    @Override
    void create() {
        System.out.println("Creating a new xml document");
    }

    @Override
    void change() {
        System.out.println("You changed the xml document");
    }

    @Override
    void save() {
        System.out.println("xml document saved");
    }
}
