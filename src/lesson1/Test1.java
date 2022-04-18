package lesson1;

public class Test1 {
    public static void main(String[] args) {
        //System.out.println(60/(3*(5-10)));
        int a = 5;
        int b = 3;
        a = b;
        b =( a & b + b ) + a;

        System.out.println(6<<3);

        System.out.println("a = " + a + "\nb = " + b);

        for(int i = 0; i <= 10; i ++)
        System.out.println(2<<i);
    }
}
