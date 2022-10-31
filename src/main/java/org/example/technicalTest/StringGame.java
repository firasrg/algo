package org.example.technicalTest;

public class StringGame {
    public static void main(String[] args) {
        
        final String CONSTANT_STRING = "My String"; 
        
        String str1 = CONSTANT_STRING;
        
        String str2 = new String(str1);
        
        if (CONSTANT_STRING.equals(str1)) 
            System.out.println("one");
        
        if (str2 == str1) 
            System.out.println("two");
        
        if (str2.equals(str1)) 
            System.out.println("three");
        
        if (CONSTANT_STRING == str1) 
            System.out.println("four");
        
        if (CONSTANT_STRING == str2) 
            System.out.println("five");
    }
}