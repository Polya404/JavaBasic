package lesson12.additionally.task1;

public class GoodPupil extends Pupil {
    @Override
    void study() {
        System.out.println("Study 4");
    }

    @Override
    void read() {
        System.out.println("Read 3");
    }

    @Override
    void write() {
        System.out.println("Write 4");
    }

    @Override
    void relax() {
        System.out.println("Relax 3");
    }

    void show() {
        study();
        read();
        write();
        relax();
    }
}
