package org.example.datastructure;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class _SearchHourglassIn2Array {

    public static void hourglassSum(int[][] arr) {

        // 1st hourglass sum is 6
        System.out.println("" + arr[0][0] + arr[0][1] + arr[0][2]);
        System.out.println(arr[1][1]);
        System.out.println("" + arr[2][0] + arr[2][1] + arr[2][2]);

        System.out.println("---------------------------------");

        // 2nd hourglass sum is 10
        System.out.println("" + arr[0][1] + arr[0][2] + arr[0][3]);
        System.out.println("" + arr[1][1] + arr[1][2] + arr[1][3]);
        System.out.println("" + arr[2][1] + arr[2][2] + arr[2][3]);

        System.out.println("---------------------------------");


        List<Integer> list = new ArrayList<>();
        int oneHourglasLength = 3;

        for (int k = 0; k < arr.length - oneHourglasLength + 1; k++) {

            int hourglassSum = 0;

            for (int i = k; i < k + 3; i++) {

                if (i % 2 == 0) {

                    for (int j = i; j < 3; j++)
                        hourglassSum += arr[i][j];
                }

                if (i % 2 != 0)
                    hourglassSum += arr[i][1];
            }

            list.add(hourglassSum);
        }

        System.out.println(list);
    }

    public static void main(String[] args) throws IOException {

        int[][] _2dArr = {
            {1, 1, 1, 0, 0, 0},
            {0, 0, 5, 4, 4, 0},
            {1, 1, 1, 0, 0, 0},
            {0, 1, 0, 0, 0, 0},
            {0, 0, 0, 2, 0, 0},
        };

        hourglassSum(_2dArr);

//        System.out.println(result);
    }
}
