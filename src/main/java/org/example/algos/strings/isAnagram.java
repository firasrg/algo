package org.example.algos.strings;

import java.util.Arrays;

public class isAnagram {

    public static void main(String[] args) {

        String str1 = "aBcd";
        String str2 = "AdBc";

        boolean isAnagram = true;

        char[] str1Chars = str1.toLowerCase().toCharArray();
        char[] str2Chars = str2.toLowerCase().toCharArray();

        if(!(str1Chars.length != str2Chars.length)) {

            Arrays.sort(str1Chars);
            Arrays.sort(str2Chars);

            for (int i = 0; i < str1Chars.length; i++) {
                if (str1Chars[i] != str2Chars[i]) {
                    isAnagram = false;
                    break;
                }
            }
        }

        if(isAnagram)
            System.out.println("Anagram");
        else
            System.out.println("Not Anagram");

    }
}
