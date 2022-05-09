package lesson14;

import java.util.Arrays;

public class MyArrayList implements ArrayList {
    private int[] arr = new int[1];
    private int size = 0;
    private int capacity = 1;

    @Override
    public String toString() {
        return "MyArrayList{" +
                "arr=" + Arrays.toString(arr) +
                '}';
    }


    @Override
    public void add(int number) {
        if (size == capacity) {
            grow();
        }

            arr[size] = number;
            size++;

    }

    private void grow() {
        capacity = (int) (capacity * 1.5);
        arr = Arrays.copyOf(arr, capacity);

    }

    @Override
    public int size() {
        return size;
    }


    @Override
    public void remove(int index) {

    }

    @Override
    public void clear() {

    }

    @Override
    public int get(int index) {
        return 0;
    }
}
