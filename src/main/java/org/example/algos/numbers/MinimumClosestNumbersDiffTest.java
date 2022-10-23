package org.example.algos.numbers;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MinimumClosestNumbersDiffTest {

public static void main(String args[]) {

    Scanner in = new Scanner(System.in);
    int N = in.nextInt();

    List<Integer> powers = new ArrayList<>();

    for (int i = 0; i < N; i++) {
        int pi = in.nextInt();

        Integer piAsObj = Integer.valueOf(pi);
        powers.add(piAsObj);
    }

    int min = 0;

    for (int i = 0; i < powers.size(); i++) {
        int power = powers.get(i);

        for (int j = 0; j < powers.size(); j++) {

            int powerToCompareWith = powers.get(j);

            if (i != j) {

                int diff = 0;

                if (power >= powerToCompareWith)
                    diff = power - powerToCompareWith;
                else
                    diff = powerToCompareWith - power;

                if ((j == 1 && i == 0) || min > diff)
                    min = diff;

            }
        }
    }

    System.out.println(min);
}
}