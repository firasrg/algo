package org.example.algos.sort;

import java.util.Arrays;

public class SortingExample {

    public static void main(String[] args) {

        int[] uArr = {-1100, 1, -5000, 1, 3, 0, 4848, 1};

        for (int i = 0; i < uArr.length; i++) {

            for (int j = i + 1; j < uArr.length; j++) {

                if (uArr[i] > uArr[j]) {
                    int temp = uArr[i];
                    uArr[i] = uArr[j];
                    uArr[j] = temp;
                }
                String res = Arrays.toString(uArr);
                System.out.println(res);
            }
        }

        String res = Arrays.toString(uArr);
        System.out.println("result" + res);
    }
}
