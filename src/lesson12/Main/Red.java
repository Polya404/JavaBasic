package lesson12.Main;

public class Red extends Printer {
    @Override
    void print(String value) {
        super.print(Color.ANSI_RED + value);
    }
}
