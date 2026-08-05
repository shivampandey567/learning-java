package generics.storage;

public class StudentStorage implements Storage<String> {
    private String Student;

    @Override
    public void add(String item){
        Student=item;
    }

    @Override
    public String get(){
        return Student;
    }
}
