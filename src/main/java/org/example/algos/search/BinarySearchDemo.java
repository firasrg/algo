package org.example.algos.search;

import java.util.Arrays;

public class BinarySearchDemo {


    private static int binarySearch(int[] arr, int key, int start, int end) {

        System.out.println("start: " + start);
        System.out.println("end: " + end);


        int middleIndex = (start + end) / 2;
        int current = arr[middleIndex];

        if (current == key)
            return middleIndex;

        if(start >= end)
            return -1;

        if (key < current)
            return binarySearch(arr, key, start, middleIndex - 1);

        else if (key > current)
            return binarySearch(arr, key, middleIndex + 1, end);

        return -1;
    }

    public static void main(String[] args) {

        int[] arr = new int[]{-40, -2, 0 , 3, 45 , 99 , 100};
        int key = 0;

        System.out.println(binarySearch(arr, key, 0 , arr.length -1));

    }
}
