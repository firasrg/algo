package org.example.classdesign;

public interface TestInterface {
    

    public static void testMethod() {
        System.out.println("Hello from interface");
    }

    static public void main(String[] args) {
        TestInterface.testMethod();
    }
}
