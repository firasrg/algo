package org.example.algos.numbers;

import java.io.PrintStream;
import java.util.Arrays;
import java.util.Scanner;

public class ClosestNumberToZeroDemo {


    public static void computeClosestToZero(int[] arr) {

        int current = 0;
        int close = arr[0];

        Arrays.sort(arr);

        for ( int i = 0 ; i < arr.length; i++ ){

            current = arr[i] * arr[i];
            if ( current <= (close * close) )  {
                close = arr[i];
            }
        }

        System.out.println(close);
    }

    public static void main(String args[]) {

        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int[] ts = new int[n];

        for (int i = 0; i < n; i++) {
            ts[i] = in.nextInt();
        }

        PrintStream outStream = System.out;
        System.setOut(System.err);
        /*int solution = */computeClosestToZero(ts);
        System.setOut(outStream);
//        System.out.println(solution);
    }
}
