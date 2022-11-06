package org.example.algos.strings;

import java.util.Arrays;

public class CountStringSmallBig {

    private static int countOfSmallInBig(String big, String small){

        int result = 0;
        int bigLength = big.length();
        int smallLength = small.length();

        for(int i = 0; i < (bigLength - smallLength) + 1; i++) {

            StringBuilder sb = new StringBuilder();

            int index = i;

            for (int j = 0; j < small.length() ; j++) {
                sb.append(big.charAt(index));
                index++;
            }


            if (sb.toString().equals(small))
                result++;
        }

        return result;
    }

    public static void main(String[] args) {
        String bigStr = "OAKOJEDIOZJDIOZNJIODNAZDNZIUNDIUZNIJDNZIDNIZDNZDNZIODOK";
        String smallStr = "DN";

        int result = countOfSmallInBig(bigStr, smallStr);

        System.out.println(result);

    }
}
