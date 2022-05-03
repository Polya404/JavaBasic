package lesson12.Main;

public class Green extends Printer {
    @Override
    void print(String value) {
        super.print(Color.ANSI_GREEN + value);
    }
}
