package collection.arraylist;

import java.util.ArrayList;

public class CreateArrayList {
    public static void main(String[] args) {

        // Create ArrayList
        ArrayList<Integer> nums = new ArrayList<>();

        // add(E element)
        nums.add(10);
        nums.add(20);
        nums.add(30);
        nums.add(40);
        System.out.println(nums); // [10, 20, 30, 40]

        // add(index, element)
        nums.add(1, 11);
        nums.add(3, 22);
        System.out.println(nums); // [10, 11, 20, 22, 30, 40]

        // get(index)
        System.out.println(nums.get(2)); // 20
        System.out.println(nums.get(5));// 40

        // set(index, element)
        nums.set(0, 33);
        nums.set(3, 44);
        System.out.println(nums);// [33, 11, 20, 44, 30, 40]

        // contains(element)
        System.out.println(nums.contains(11));// true
        System.out.println(nums.contains(12));// false

        // indexOf()
        System.out.println(nums.indexOf(30));// 4
        System.out.println(nums.indexOf(50));// -1

        // size()
        System.out.println(nums.size());// 6

        // isEmpty()
        System.out.println(nums.isEmpty());// false

        // remove(index)
        nums.remove(4);
        System.out.println(nums);// [33, 11, 20, 44, 40]

        // remove(object)
        nums.remove(Integer.valueOf(44));
        System.out.println(nums);// [33, 11, 20, 40]

        // clear()
        nums.clear();
        System.out.println(nums);// []

    }
}

// output:
// [33, 11, 20, 44, 30, 40]
// true
// false
// 4
// -1
// 6
// false
// [33, 11, 20, 44, 40]
// [33, 11, 20, 40]
// []