package org.example.modern.stream.inPractice;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class FlatMapDemo {

    public static void main(String[] args) {

        List<String> list = Arrays.asList("Hello", "World");

        System.out.println("list: " + list);

        List<String> strings = list.stream()
            .map(s -> s.split(""))
            .flatMap(Arrays::stream)
            .distinct()
            .toList();

        System.out.println("unique strings: " + strings);
    }
}
