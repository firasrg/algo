package org.example.algos.search;

import java.util.Arrays;

/**
 * Firas1220
 */
public class BinarySearchDemo {

    private static int binarySearchIterative(int[] arr, int key, int start, int end) {

        if(arr.length == 0)
            return -1;

        int midIndex = (start + end) / 2;

        while (start < end || start == end) {

            if (arr[midIndex] == key)
                return midIndex;

            if (arr[midIndex] > key)
                end = midIndex - 1;

            if (arr[midIndex] < key)
                start = midIndex + 1;

            midIndex =  (start + end) / 2;

        }

        return -1;
    }

    private static int binarySearchRecurive(int[] arr, int key, int start, int end) {

//        System.out.println("start: " + start);
//        System.out.println("end: " + end);

        if(arr.length == 0)
            return -1;

        int middleIndex = (start + end) / 2;
        int current = arr[middleIndex];

        if (current == key)
            return middleIndex;

        if(start >= end)
            return -1;

        if (key < current)
            return binarySearchRecurive(arr, key, start, middleIndex - 1);

        else if (key > current)
            return binarySearchRecurive(arr, key, middleIndex + 1, end);

        return -1;
    }

    public static void main(String[] args) {

        int[] arr = new int[]{2, 5};
        int key = 2;

        System.out.println(binarySearchRecurive(arr, key, 0 , arr.length -1));
        System.out.println("result is: " + binarySearchIterative(arr, key, 0, arr.length - 1));

    }
}
