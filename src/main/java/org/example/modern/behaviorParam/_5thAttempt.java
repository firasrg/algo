package org.example.modern.behaviorParam;

import org.example.modern.Apple;
import org.example.modern.Color;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class _5thAttempt {

    /**
     * Filter stock with lambda expression and predicate
     *
     * @param args
     */
    public static void main(String[] args) {

        // initial
        List<Apple> stock = Apple.stock;
        System.out.println("stock has: " + Apple.stock.toString());

        // filters

        List<Apple> filtered = filter(stock, a -> a.getWeight() > 150 && a.getColor().equals(Color.GREEN));

        System.out.println("****************");

        System.out.println("filtered apples are : " + filtered);

    }

    /**
     * Parameterizing predicate in method
     *
     * @param stock
     * @return
     */
    static List<Apple> filter(List<Apple> stock, Predicate<Apple> predicate) {

        List<Apple> result = new ArrayList<>();

        for(Apple a: stock){
            if(predicate.test(a))
                result.add(a);
        }

        return result;
    }

}
