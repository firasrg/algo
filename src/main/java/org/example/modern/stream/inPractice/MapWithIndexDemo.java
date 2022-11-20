package org.example.modern.stream.inPractice;

import org.example.modern.Apple;

import java.util.List;
import java.util.stream.IntStream;

public class MapWithIndexDemo {

    public static void main(String[] args) {
        List<Apple> list = Apple.stock;

        System.out.println("list: " + list);

        List<Apple> filtered = IntStream
            .range(0, list.size())
            .filter(i -> {
                // print index
                System.out.println(i);
                return true;
            })
            // get objet
            .mapToObj(list::get)
            .toList();

        System.out.println("filtered: " + filtered);

    }
}
