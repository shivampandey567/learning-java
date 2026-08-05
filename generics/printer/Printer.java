package generics.printer;

public class Printer {
    public <T> void print(T value){
        System.out.println(value);
    }
}