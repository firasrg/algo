package org.example.algos.strings;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

// TODO: reverse each word and
//  replace numbers with character on the left
public class reverseAndDescrypt {

    public static void main(String[] args) {

        String str = "abc abcd  a4biqii";

        String[] arr = str.split(" ");

        List<String> list = Arrays.asList(arr);

        Collections.reverse(list);

        StringBuilder sb = new StringBuilder();

        for (String s : list) {
            sb.append(s);
            sb.append(" ");
        }

        String reversedAndTrimmed = sb.toString().trim();

        String res = "";

        for(int i = 0 ; i < reversedAndTrimmed.length(); i++){

            char a = reversedAndTrimmed.charAt(i);
            String aP = String.valueOf(a);

            if(a <= '9' && a >= '0'){
                System.out.println(Character.getNumericValue(a));

                for(int j = 0; j < Character.getNumericValue(a); j++)
                    aP += reversedAndTrimmed.charAt(i - 1);


                if(aP.length() > 0)
                    aP = aP.substring(1, aP.length() - 1);
            }

            res += aP;
        }

        System.out.println(res);

    }
}
