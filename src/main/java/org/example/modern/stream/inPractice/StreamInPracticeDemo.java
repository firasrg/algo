package org.example.modern.stream.inPractice;

import org.example.modern.Apple;
import org.example.modern.Color;

import java.util.List;
import java.util.stream.Collectors;

public class StreamInPracticeDemo {

    /**
     * Using stream internal iteration
     * @param args
     */
    public static void main(String[] args) {
        List<Apple> list = Apple.stock;

        System.out.println("list: " + list);

        List<Color> colors = list.stream()
            .filter(apple -> apple.getWeight() > 150)
            .map(Apple::getColor)
            .distinct()
            .limit(2)
            .collect(Collectors.toList());

        System.out.println("filtered colors: " + colors);
    }
}
