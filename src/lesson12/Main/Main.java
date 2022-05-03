package lesson12.Main;

public class Main {
    public static void main(String[] args) {
        Green green = new Green();
        Printer printer = new Printer();
        Red red = new Red();
        printer.print("Hello");
        green.print("Hello");
        red.print("Hello");
        printer.print("Hello");
        green.print("Hello");
    }
}
