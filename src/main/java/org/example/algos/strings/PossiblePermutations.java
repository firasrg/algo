package org.example.algos.strings;

import java.util.Arrays;

public class PossiblePermutations {

    private static int possiblePermutations(String big, String small){

        int result = 0;
        int bigLength = big.length();
        int smallLength = small.length();
        char[] smallArr = small.toCharArray();

        Arrays.sort(smallArr);

        for(int i = 0 ; i < bigLength - smallLength + 1 ; i++){
            StringBuilder sb = new StringBuilder();

            int index = i;
            for(int j = 0; j < smallLength; j++){
                sb.append(big.charAt(index));
                index++;
            }

            char[] sbAsChars = sb.toString().toCharArray();

            Arrays.sort(sbAsChars);

            if(Arrays.equals(sbAsChars,smallArr))
                result++;

        }

        return result;
    }

    public static void main(String[] args) {

        String bigStr = "HELLLLEOLLELK";
        String smallStr = "ELLL";

//        "ELLL", "LELL", "LLEL", "LLLE"

        int result = possiblePermutations(bigStr, smallStr);

        System.out.println(result);
    }
}
