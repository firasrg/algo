package org.example.modern.methodRef;

import org.example.modern.Apple;

import java.util.Comparator;
import java.util.List;

/**
 * There are some interesting functional interfaces here
 * 1. Predicate<T>
 * 2. Consumer<T>
 * 3. Function<T, R>
 */
public class MethodRefDemo {

    public static void main(String[] args) {
        List<Apple> list = Apple.stock;
        list.sort(Comparator.comparing(Apple::getWeight));

        System.out.println(list);
    }
}
