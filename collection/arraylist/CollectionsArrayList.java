package collection.arraylist;

import java.util.ArrayList;
import java.util.Collections;

public class CollectionsArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(50);
        nums.add(10);
        nums.add(80);
        nums.add(20);
        nums.add(70);

        // Collections.sort()
        Collections.sort(nums);
        System.out.println(nums); // [10, 20, 50, 70, 80]

        // Collections.reverse()
        Collections.reverse(nums);
        System.out.println(nums);// [80, 70, 50, 20, 10]

        // Collection.suffle()
        Collections.shuffle(nums);
        System.out.println(nums);// [20, 80, 70, 50, 10]

        // Collections.max()
        System.out.println(Collections.max(nums));// 80

        // Collections.min()
        System.out.println(Collections.min(nums));// 10

        // Collections.frequency(obj,value)
        ArrayList<Integer> grades = new ArrayList<>();
        grades.add(1);
        grades.add(1);
        grades.add(2);
        grades.add(2);
        grades.add(3);
        grades.add(1);
        System.out.println(Collections.frequency(grades, 1));// 3

        // Collections.binarySearch()
        Collections.sort(nums);
        System.out.println(Collections.binarySearch(nums, 70));// 3

        // forEach()
        System.out.print("forEach(): ");
        nums.forEach(item -> System.out.print(item + " "));
        System.out.println(); // forEach(): 10 20 50 70 80
    }
}

// output:
// [10, 20, 50, 70, 80]
// [80, 70, 50, 20, 10]
// [80, 50, 20, 10, 70]
// 80
// 10
// 3
// 3
// forEach(): 10 20 50 70 80