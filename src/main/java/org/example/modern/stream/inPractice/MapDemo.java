package org.example.modern.stream.inPractice;

import org.example.modern.Apple;
import org.example.modern.Color;

import java.util.Comparator;
import java.util.List;

public class MapDemo {

    public static void main(String[] args) {

        List<Apple> list = Apple.stock;
        System.out.println("list: " + list);

        List<String> weights = list.stream()
            .map(Apple::getColor)
            // a second map to select from obj in prev map()
            .map(Color::name)
            .toList();

        System.out.println("weights: " + weights);
    }
}
