package lesson09;

import java.util.Arrays;

public class MathArr {
    private static int[] arr = new int[10];

    public static void main(String[] args) {
//        for (int i = 0; i < arr.length; i++){
//            arr[i] = (int) (Math.random()*21-10);
//        }
//        System.out.println(Arrays.toString(arr));
//        //arr = Arrays.copyOf(arr, 12);
//        //System.out.println(Arrays.toString(arr));
//        System.arraycopy(arr, 1, arr,4,3);
//        System.out.println(Arrays.toString(arr));
        int[] arr1 = new int[]{1, 5, 9, 2, 9, 45, 21, 6, 8};
        int[] arr2 = new int[]{1, 5, 9, 2, 9, 45, 21, 6, 8};
        //Arrays.fill(arr1, 3);
        //Arrays.sort(arr1);
        System.out.println(Arrays.equals(arr1, arr2));
        System.out.println(arr1.equals(arr2));
    }

}
