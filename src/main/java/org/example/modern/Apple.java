package org.example.modern;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Data
@AllArgsConstructor
public class Apple {
    private Color color;
    private int weight;
    
    public static List<Apple> stock = new ArrayList<>(5);
    
    // filling the stock with static data
    static {

        Random r = new Random();
        for (int i = 0; i < 5; i++) {
            // random color
            int randomColorIndex = r.nextInt(Color.values().length);
            Color color = Color.values()[randomColorIndex];
            
            // random size
            int min = 150;
            int max = 300;
            
            int size =  r.nextInt((max + 1) - min) + min;
            
            stock.add(new Apple(color, size));
        }
    }

    @Override
    public String toString() {
        return 
            "\n" +
            "Apple {" +
            "\t\ncolor:" + color + "\n" + 
            "size:" + weight + "\n" +
            "}";
    }
}
