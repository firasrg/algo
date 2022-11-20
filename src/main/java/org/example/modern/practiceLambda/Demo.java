package org.example.modern.practiceLambda;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

@FunctionalInterface
interface BufferedReaderProcessor {
    String process(BufferedReader b) throws IOException;
}

/**
 * Using functional interface in practice
 */
public class Demo{
    public static void main(String[] args) {

        // we have a file that we want to read its 2 first lines
        String filePath = "./files/data.txt";
        String res = processFile(filePath, b -> b.readLine() + " " +b.readLine());

        System.out.println("result is : " + res);
    }

    public static String processFile(String filePath, BufferedReaderProcessor brp) {

        // try-with-resources is useful to autoclose a process after being end
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            return brp.process(br);
        } catch (IOException e){
            e.printStackTrace();
        }

        return null;
    }
}