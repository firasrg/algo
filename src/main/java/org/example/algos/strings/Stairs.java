package org.example.algos.strings;

import java.io.*;

import static java.util.stream.Collectors.joining;

class Result {

    /*
     * Complete the 'staircase' function below.
     *
     * The function accepts INTEGER n as parameter.
     */

    public static void staircase(int n) {
        // Write your code here

        String str = "";
        for(int i = 0; i < n; i++){
            str += " ";
        }

        StringBuilder sb = new StringBuilder(str);

        for(int i = 0; i < n; i++){

            sb.replace((n -i) - 1, (n -i), "#");

            String res = sb.toString();

            System.out.println(res);
        }
    }
}

public class Stairs {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        Result.staircase(n);

        bufferedReader.close();
    }
}
