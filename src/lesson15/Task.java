package lesson15;

import java.util.Arrays;

public class Task {
    public static void main(String[] args) {
        System.out.println(task1(135));
        System.out.println(task2(248));
    }
    public static int task1(int a){
        int sum = 0;
        while (a != 0){
            sum += (a % 10);
            a /= 10;
        }
        return sum;
    }

    public static int task2(int n){
        int count = 0;
        int res = n;
        while (n != 0){
            n /= 10;
            count ++;
        }
        int[] num = new int[count];
        for(int i = 0; i < num.length; i++ ){
            num[i] = res % 10;
            res /= 10;
        }
        int j = 1;
        res = 0;
        for (int i = 0; i < count; i++) {
            res += num[i] * (int) (Math.pow(10.0,(double)(num.length - j)));
            j ++;
        }
        return res;
    }
}
