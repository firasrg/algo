package org.example.technicalTest;

public class ExceptionsGame {

    public static void main(String[] args) {

        System.out.print("1");
        try {
            hold();
        } catch (ArithmeticException e) {
            System.out.print("2");
        } finally {
            System.out.print("3");
        }

        System.out.print("4");
    }

    static void hold() {

        System.out.print("5");

        Object nullable = null;
//        nullable.toString();

        System.out.print("6");
    }
}


