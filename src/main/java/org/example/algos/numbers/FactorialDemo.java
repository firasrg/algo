package org.example.algos.numbers;

public class FactorialDemo {

    private static int fact(int n) {

        if (n <= 1) return 1;

         return n * fact(n - 1);
    }

    public static void main(String[] args) {
        int n = 5;
        // todo: calculate 5!

        int res = fact(n);

        System.out.println(res);
    }
}
