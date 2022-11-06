package org.example.algos.strings;

import java.time.LocalDate;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class CountDuplicateChars {

    private static void countDuplicates(String str){

        char[] chars = str.toCharArray();

        Set<Character> set = new HashSet<>();

        for (int i = 0; i < chars.length; i++) {

            char current = chars[i];

            if(set.contains(current))
                continue;

            int count = 1;

            for (int j = 0; j < chars.length; j++) {

                if (j == i) continue;

                if (current == chars[j]) {
                    count++;
                    set.add(current);
                }
            }

            if(count > 1)
                System.out.println(current + " : " + count);

        }
    }


    public static void main(String[] args) {

        String str = "HLLOOOO";
        countDuplicates(str);
//        countDuplicatesStream(str);

        // another way - powerful
//        Map<Character, Long> res = str.chars()
//            .mapToObj(c -> (char) c)
//            .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
//        System.out.println(res);
    }
}
