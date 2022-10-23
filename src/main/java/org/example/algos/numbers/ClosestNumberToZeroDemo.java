package org.example.algos.numbers;

import java.io.PrintStream;
import java.util.Arrays;
import java.util.Scanner;

public class ClosestNumberToZeroDemo {


    public static void computeClosestToZero(int[] data) {

        int current = 0;
        int near = data[0];

        Arrays.sort(data);

        for ( int i = 0 ; i < data.length; i++ ){

            current = data[i] * data[i];
            if ( current <= (near * near) )  {
                near = data[i];
            }
        }

        System.out.println(near);
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
