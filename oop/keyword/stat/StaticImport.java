// Static import allows us to use
// static members without writing
// the class name every time.

// static import helps to reduce this 
// System.out.println(Math.sqrt(25));
// to this System.out.println(sqrt(25));

// just import this in code to use it
// import static java.lang.Math.*;

package oop.keyword.stat;

import static java.lang.Math.*;

public class StaticImport {
    public static void main(String[] args) {

        System.out.println(abs(-25)); // 25

        System.out.println(sqrt(64)); // 8.0

        System.out.println(pow(2, 10)); // 1024.0

        System.out.println(max(20, 50)); // 50

        System.out.println(min(20, 50)); // 20

        System.out.println(cbrt(27)); // 3.0

        System.out.println(ceil(5.2)); // 6.0

        System.out.println(floor(5.9)); // 5.0

        System.out.println(round(5.6)); // 6

        System.out.println(random());

    }
}

// output:
// 25
// 8.0
// 1024.0
// 50
// 20
// 3.0
// 6.0
// 5.0
// 6
// 0.17439435504051182