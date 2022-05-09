package lesson12.additionally.task1;

public class ClassRoom {
    private final Pupil[] pupils = new Pupil[4];

    public ClassRoom(Pupil first, Pupil second, Pupil third, Pupil fourth) {
        pupils[0] = first;
        pupils[1] = second;
        pupils[2] = third;
        pupils[3] = fourth;
    }

    public ClassRoom(Pupil first, Pupil second, Pupil third) {
        pupils[0] = first;
        pupils[1] = second;
        pupils[2] = third;
        pupils[3] = null;
    }

    public ClassRoom(Pupil first, Pupil second) {
        pupils[0] = first;
        pupils[1] = second;
        pupils[2] = null;
        pupils[3] = null;
    }

    public ClassRoom(Pupil first) {
        pupils[0] = first;
        pupils[1] = null;
        pupils[2] = null;
        pupils[3] = null;
    }

    void show() {
        for (int i = 0; i < pupils.length; i++) {
            if (pupils[i] == null) {
                break;
            }
            System.out.println(i + 1 + " pupil: ");
            pupils[i].show();
            System.out.println();
        }
    }
}
