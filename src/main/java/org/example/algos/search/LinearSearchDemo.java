package org.example.algos.search;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class LinearSearchDemo {


    private static int search(Integer[] arr,int arrSize, int key){

        if(arrSize == 0)
            return - 1;

        else if (arr[arrSize - 1] == key) {
            return arrSize - 1;
        }

        else
            return search(arr, arrSize - 1, key);

    }


    public static void main(String[] args) {
        // TODO: linear search
        Integer[] arr = {0,848,4,9,10,3};

        int result = search(arr,arr.length,4);

        System.out.println("result: " + result);
    }
}
