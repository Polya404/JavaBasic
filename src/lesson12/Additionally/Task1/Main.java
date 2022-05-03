package lesson12.Additionally.Task1;

public class Main {
    public static void main(String[] args) {
        Pupil first = new ExcelentPupil();
        Pupil second = new BadPupil();
        Pupil third = new BadPupil();
        Pupil fourth = new GoodPupil();
        ClassRoom classRoom = new ClassRoom(first, second, third, fourth);
        classRoom.show();
        ClassRoom classRoom1 = new ClassRoom(first, second);
        classRoom1.show();
    }
}
