package org.example.exception;

public class ExceptionDemo {

    public void start() {
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

    public void hold() {
        System.out.print("5");

        // null object here
        Object nullable = null;
        nullable.toString();

        System.out.print("6");
    }

    public static void main(String[] args) {
        new ExceptionDemo().start();
    }

}
