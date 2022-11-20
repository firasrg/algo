package org.example.modern.behaviorParam;

import org.example.modern.Apple;
import org.example.modern.Color;

import java.util.ArrayList;
import java.util.List;

/**
 * This class demonstrates parameterization
 * (farmer inventory)
 */
public class _1stAttempt {

    /**
     * Filter stock looking for green apples
     * @param args
     */
    public static void main(String[] args) {
        
        List<Apple> stock = Apple.stock;
        
        System.out.println("stock has: " + Apple.stock.toString());
        
        List<Apple> filtered = filterGreenApples(stock);

        System.out.println("filtered has: " + filtered);

    }

    /**
     * A method to search only green apples
     * @param stock
     * @return
     */
    static List<Apple> filterGreenApples(List<Apple> stock) {

        List<Apple> result = new ArrayList<>();

        for(Apple a: stock){

            if(Color.GREEN.equals(a.getColor()))
                result.add(a);
        }

        return result;
    }
    
}
