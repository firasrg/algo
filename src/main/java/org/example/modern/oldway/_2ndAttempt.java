package org.example.modern.oldway;

import org.example.modern.Apple;
import org.example.modern.Color;

import java.util.ArrayList;
import java.util.List;

public class _2ndAttempt {

    /**
     * Filter stock on color entry
     * @param args
     */
    public static void main(String[] args) {

        List<Apple> stock = Apple.stock;

        System.out.println("stock has: " + Apple.stock.toString());

        List<Apple> filteredGreen = filterByColor(stock, Color.GREEN);
        List<Apple> filteredRed = filterByColor(stock, Color.RED);

        System.out.println("****************");

        System.out.println("green apples are : " + filteredGreen);
        System.out.println("red apples are : " + filteredRed);

    }

    /**
     * Parameterizing color in method
     *
     * @param stock
     * @return
     */
    static List<Apple> filterByColor(List<Apple> stock, Color c) {

        List<Apple> result = new ArrayList<>();

        for(Apple a: stock){

            if(c.equals(a.getColor()))
                result.add(a);
        }

        return result;
    }
}
