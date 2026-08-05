package generics.mathutil;

public class Main {
    public static void main(String[] args) {
        Integer[] nums = { 3, 7, 9, 0 };
        String[] names = { "ben", "peter", "harry", "marry" };
        Character[] grades = { 'B', 'P', 'H', 'M' };

        MathUtil.display(nums);
        MathUtil.display(names);
        MathUtil.display(grades);
    }
}

// output:
// 3
// 7
// 9
// 0
// ben
// peter
// harry
// marry
// B
// P
// H
// M