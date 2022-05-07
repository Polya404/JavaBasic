package lesson01;

import java.util.Scanner;

public class Test3 {

    public static void main(String[] args) {
        //напишите тут ваш код
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] array = new int[n];
        if (n > 0){
            for (int i = 0; i < array.length; i++) {
                array[i] = in.nextInt();
            }
            if (n%2==0){
                for (int i = array.length-1; i >= 0; i--) {
                    System.out.println(array[i]);
                }
            }
            else{
                for (int i = 0; i <= array.length-1; i++) {
                    System.out.println(array[i]);
                }
            }
        }

    }
}
