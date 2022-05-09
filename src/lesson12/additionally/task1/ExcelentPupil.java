package lesson12.additionally.task1;

public class ExcelentPupil extends Pupil {
    @Override
    void study() {
        System.out.println("Study 5");
    }

    @Override
    void read() {
        System.out.println("Read 5");
    }

    @Override
    void write() {
        System.out.println("Write 5");
    }

    @Override
    void relax() {
        System.out.println("Relax 2");
    }

    void show() {
        study();
        read();
        write();
        relax();
    }
}
