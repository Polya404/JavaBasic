package lesson10.task3;

import java.util.Arrays;

public class Computer {
    private static final Object[] computers = new Object[5];

    public String[] getComputers() {
        return new String[]{Arrays.toString(computers)};
    }

    public void setComputers(Object a, Object b, Object c, Object d, Object e) {
        computers[0] = a;
        computers[1] = b;
        computers[2] = c;
        computers[3] = d;
        computers[4] = e;
    }

    public static void main(String[] args) {
        Computer a = new Computer();
        Computer b = new Computer();
        Computer c = new Computer();
        Computer d = new Computer();
        Computer e = new Computer();
        Computer x = new Computer();
        x.setComputers(a, b, c, d, e);
        System.out.println(Arrays.toString(x.getComputers()));
    }
}
