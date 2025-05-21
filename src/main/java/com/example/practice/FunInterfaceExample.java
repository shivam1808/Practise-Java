package com.example.practice;

@FunctionalInterface
public interface FunInterfaceExample {

    void absMethod();

    /*
        Functional interface can contain any number of default, static methods but
        only one abstract method.
    */
    default void defaultMethod() {
        System.out.println("Default Method");
    }

    static void staticMethod() {
        System.out.println("Static Method");
    }
}
