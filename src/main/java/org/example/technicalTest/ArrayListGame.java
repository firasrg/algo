package org.example.technicalTest;


import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArrayListGame {
    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(1, -1, -0, +4);

        Collections.sort(list);

        Integer array[] = list.toArray(new Integer[4]);

        System.out.println(array[2]);
    }
}