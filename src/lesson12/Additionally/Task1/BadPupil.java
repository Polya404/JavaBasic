package lesson12.Additionally.Task1;

public class BadPupil extends Pupil {
    @Override
    void study() {
        System.out.println("Study 2");
    }

    @Override
    void read() {
        System.out.println("Read 1");
    }

    @Override
    void write() {
        System.out.println("Write 2");
    }

    @Override
    void relax() {
        System.out.println("Relax 5");
    }

    void show() {
        study();
        read();
        write();
        relax();
    }
}
