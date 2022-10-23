package org.example.algos.strings;

import java.util.Scanner;

public class AnagramCount {

    static int countManipulations(String s1, String s2) {
        int count = 0;

        // store the count of character
        int char_count[] = new int[26];

        // iterate though the first String and update
        // count
        for (int i = 0; i < s1.length(); i++)
            char_count[s1.charAt(i) - 'a']++;

        // iterate through the second string
        // update char_count.
        // if character is not found in char_count
        // then increase count
        for (int i = 0; i < s2.length(); i++) {
            char_count[s2.charAt(i) - 'a']--;
        }

        for (int i = 0; i < 26; ++i) {
            if (char_count[i] != 0) {
                count += Math.abs(char_count[i]);
            }
        }

        return count / 2;
    }


    static void codingGameDemo(){

        Scanner in = new Scanner(System.in);

        int currentHeight = 0;
        int indexOfMax = 0;

        for (int i = 0; i < 4; i++) {
            int mountainH = in.nextInt(); // represents the height of one mountain.
            System.out.println(mountainH); // The index of the mountain to fire on.
//            in.nextLine();
            if(currentHeight < mountainH) {
                currentHeight = mountainH;
                indexOfMax = i;
            }
        }

        // Write an action using System.out.println()
        // To debug: System.err.println("Debug messages...");

        System.out.println(indexOfMax); // The index of the mountain to fire on.
    }

    public static void main(String[] args) {

//        String str1 = "accb";
//        String str2 = "cbde";
//        int minCharsAnagram = countManipulations(str1, str2);
//
//        System.out.println("result: " + minCharsAnagram);

//        List<Integer> list = new ArrayList<>();
//        list.add(-4);
//        list.add(3);
//        list.add(-9);
//        list.add(0);
//        list.add(4);
//        list.add(1);
//
//        bigDecimalDemo(list);

        codingGameDemo();
    }
}