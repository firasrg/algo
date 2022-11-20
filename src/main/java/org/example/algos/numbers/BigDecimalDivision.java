package org.example.algos.numbers;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class BigDecimalDivision {

    static BigDecimal getNumberDivided(int positives, int scale, BigDecimal divider) {
        BigDecimal result = new BigDecimal(positives)
                .setScale(scale)
                .divide(divider, BigDecimal.ROUND_HALF_EVEN);
        return result;
    }

    static void bigDecimalDemo(List<Integer> arr) {

        int negatives = 0;
        int zeros = 0;
        int positives = 0;

        for (Integer integer : arr) {

            if (integer > 0)
                positives++;

            else if (integer < 0)
                negatives++;

            else
                zeros++;
        }

        BigDecimal arrSize = new BigDecimal(arr.size());
        int SCALE_VALUE = 6;

        int[] categories = {positives, negatives, zeros};

        for (int a : categories) {
            BigDecimal result = getNumberDivided(a, SCALE_VALUE, arrSize);
            System.out.println(result);
        }
    }

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(-4);
        list.add(3);
        list.add(-9);
        list.add(0);
        list.add(4);
        list.add(1);

        bigDecimalDemo(list);
    }
}
