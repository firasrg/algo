package org.example.modern.stream.inPractice;

import org.example.modern.Apple;
import org.example.modern.Color;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

/**
 * stream().takewhile() can be useful instead of .filter()
 * but the list must be sorted
 */
public class TakeWhileDemo {

    public static void main(String[] args) {
        List<Apple> list = Apple.stock;

        // takeWhile works with sorted lists read more in docs
        list.sort(Comparator.comparing(Apple::getWeight));

        System.out.println("list: " + list);

        List<Apple> filtered = list.stream()
            .takeWhile(apple -> apple.getWeight() > 150)
            .toList();

        System.out.println("filtered: " + filtered);

    }
}
