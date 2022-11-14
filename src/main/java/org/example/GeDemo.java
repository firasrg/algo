package org.example;

import java.util.Map;
import java.util.TreeMap;

public class GeDemo {


    private static void demo() {
        // TODO: learn about java 9 features
        // TODO: learn about hashmap and treemap
        // TODO: The big o notation (google it!)
        // TODO:
    }

    public static void main(String[] args) {

//        For all numbers between 1 and 100, print out a specific string:
//        - If the number is divisible by 3 without a remainder, print "Fizz"
//        - If the number is divisible by 5 without a remainder, print "Buzz"
//        - If the number is divisible by 3 and 5 without a remainder, print "FizzBuzz"
//        - If the number is not divisible by 3 or 5, print the number itself.

//        - If the number is divisible by 7 without a remainder, print "Bark"
//        - If the number is divisible by 3 and 7, print "FizzBark"
//        - If the number is divisible by 5 and 7, print "BuzzBark"
//        - If the number is divisible by 3, 5 and 7, print "FizzBuzzBark"

        int n = 120;

        final String IGA = "Iga";
        final String TUNISIE = "Tunisie";
        final String YEAR_2022 = "2022";
//        final String TREE = "Tree";
//        final String FIZZ_BUZZ = FIZZ + BUZZ;
//        final String FIZZ_BARK = FIZZ + BARK;
//        final String BUZZ_BARK = BUZZ + BARK;
//        final String FIZZ_BUZZ_BARK = FIZZ + BUZZ + BARK;

        // other consts
        final Map<Integer,String> tree = new TreeMap<>();
        tree.put(3, IGA);
        tree.put(5, TUNISIE);
        tree.put(7, YEAR_2022);
//        tree.put(13, TREE);

        for (int i = 1 ; i <= n ; i++) {

            boolean hasDivisor= false;

//            boolean isDivisableBy3 = index % 3 == 0;
//            boolean isDivisableBy5 = index % 5 == 0;
//            boolean isDivisableBy7 = index % 7 == 0;
//
//            boolean isDivisableBy5And3 = isDivisableBy3 && isDivisableBy5;
//            boolean isDivisableBy3And7 = isDivisableBy3 && isDivisableBy7;
//            boolean isDivisableBy5And7 = isDivisableBy5 && isDivisableBy7;
//            boolean isDivisableBy3And5And7 = isDivisableBy5 && isDivisableBy3 && isDivisableBy7;
//
//            if (isDivisableBy3And5And7)
//                System.out.println(FIZZ_BUZZ_BARK);
//            else if (isDivisableBy3And7)
//                System.out.println(FIZZ_BARK);
//            else if (isDivisableBy5And7)
//                System.out.println(BUZZ_BARK);
//            else if (isDivisableBy5And3)
//                System.out.println(FIZZ_BUZZ);
//            else if (isDivisableBy3)
//                System.out.println(FIZZ);
//            else if (isDivisableBy5)
//                System.out.println(BUZZ);
//            else if (isDivisableBy7)
//                System.out.println(BUZZ);
//            else
//                System.out.println(index);
            for(int divisor : tree.keySet()) {
                if (i % divisor == 0) {
                    System.out.print(tree.get(divisor));
                    hasDivisor = true;
                }
            }

            if(!hasDivisor)
                System.out.print(i);

            System.out.println();
        }
    }
}
