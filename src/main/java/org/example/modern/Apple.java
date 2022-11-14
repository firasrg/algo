package org.example.modern;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.ToString;

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
        for (int i = 0; i < 5; i++) {
            // random color
            int randomColorIndex = new Random().nextInt(Color.values().length);
            Color color = Color.values()[randomColorIndex];
            
            // random size
            int min = 80;
            int max = 300;
            
            int size = new Random().nextInt((max + 1) - min) + min;
            
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
