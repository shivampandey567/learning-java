package generics.util;

public class Main {
    public static void main(String[] args) {

        String s = Util.getValue("walia");
        Integer i = Util.getValue(69);
        Double d = Util.getValue(78238.233);
        Character c = Util.getValue('R');
        Boolean b = Util.getValue(false);

        System.out.println(s);
        System.out.println(i);
        System.out.println(d);
        System.out.println(c);
        System.out.println(b);

    }
}

// output:
// walia
// 69
// 78238.233
// R
// false