package lesson14;

import java.util.Arrays;

public class MyArrayList<T> implements ArrayList<T> {
    private Object[] arr = new Object[0];
    private int size = 0;
    private int capacity = 0;

    @Override
    public String toString() {
        return "MyArrayList{" +
                "arr=" + Arrays.toString(arr) +
                '}';
    }

    @Override
    public void add(T variable) {
        if (size == capacity) {
            grow();
        }
        if (variable != null) {
            arr[size] = variable;
            size++;
        }
    }

    private void grow() {
        capacity = capacity + 1;
        arr = Arrays.copyOf(arr, capacity);
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public void remove(int index) {
        System.arraycopy(arr, index + 1, arr, index, size - index - 1);
        arr = Arrays.copyOf(arr, size - 1);
        size -= 1;
    }

    @Override
    public void clear() {
        arr = new Object[0];
        size = 0;
        capacity = 0;
    }

    @Override
    public T get(int index) {
        return (T) arr[index];
    }
}
