package generics.pair;

public class Pair<K, V> {
    private K key;
    private V value;

    public Pair(K key, V value) {
        this.key = key;
        this.value = value;
    }

    public void print() {
        System.out.println("Key: " + this.key + ", Value: " + this.value);
    }
}
