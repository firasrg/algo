package org.example.modern.stream.inPractice;

import java.util.Arrays;
import java.util.List;

/**
 * The anyMatch method can be used to answer the question
 * “Is there an element in the stream matching the given predicate?”
 */
public class MatchDemo {

    public static void main(String[] args) {

        List<String> list = Arrays.asList("Hello", "   ");

        System.out.println("list: " + list);

        // anyMatch() returns boolean and its a terminal operation!
        boolean hasAtLeastBlank = list
            .stream()
            .anyMatch(String::isBlank);

        boolean hasNoEmptyStrings = list
            .stream()
            .noneMatch(String::isEmpty);

        boolean hasEmpty = list
            .stream()
            .allMatch(String::isEmpty);

        if(hasAtLeastBlank) System.out.println("The list contains at least one blank string!");
        if(hasNoEmptyStrings) System.out.println("The list has no empty strings 1");
        if(!hasEmpty) System.out.println("The list has no empty strings 2");

    }
}
