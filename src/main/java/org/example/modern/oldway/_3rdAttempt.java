package org.example.modern.oldway;

import org.example.modern.Apple;

import java.util.ArrayList;
import java.util.List;

public class _3rdAttempt {

    /**
     * Filter stock based on size
     * 
     * @param args
     */
    public static void main(String[] args) {

        List<Apple> stock = Apple.stock;

        System.out.println("stock has: " + Apple.stock.toString());

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
}
