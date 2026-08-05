package generics.storage;

public interface Storage<T> {
    void add(T item);

    T get();
}