package lesson14;

public interface ArrayList<T> {
    int size();

    void add(T number);

    void remove(int index);

    void clear();

    T get(int index);
}
