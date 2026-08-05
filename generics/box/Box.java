package generics.box;

public class Box<T> {
    // instance variable
    private T value;

    // getter
    public T get() {
        return this.value;
    }

    // setter
    public void set(T value) {
        this.value = value;
    }
}