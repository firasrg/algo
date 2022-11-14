package org.example.modern.oldway;

import org.example.modern.Apple;
import org.example.modern.Color;

import java.util.ArrayList;
import java.util.List;

public class _4thAttempt {
    
    /**
     * Filter stock based on weight and/or color (both)
     *
     * @param args
     */
    public static void main(String[] args) {

        // initial
        List<Apple> stock = Apple.stock;
        System.out.println("stock has: " + Apple.stock.toString());

        // filters
        
        List<Apple> filteredOnWeight = filterByWeight(stock, 150);

        System.out.println("****************");

        System.out.println("filtered apples are : " + filteredOnWeight);

    }

    /**
     * Parameterizing color in method
     *
     * @param stock
     * @return
     */
    static List<Apple> filterByWeight(List<Apple> stock, int weight) {

        List<Apple> result = new ArrayList<>();

        for(Apple a: stock){
            if(weight <= a.getWeight())
                result.add(a);
        }

        return result;
    }

    /**
     * Parameterizing color in method
     *
     * @param stock
     * @return
     */
    static List<Apple> filterApples(List<Apple> stock, Color c) {

        List<Apple> result = new ArrayList<>();

        for(Apple a: stock){

            if(c.equals(a.getColor()))
                result.add(a);
        }

        return result;
    }
}
