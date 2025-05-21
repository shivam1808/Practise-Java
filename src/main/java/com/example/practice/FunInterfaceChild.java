package com.example.practice;

@FunctionalInterface
public interface FunInterfaceChild extends FunInterfaceExample {

    @Override
    default void defaultMethod() {
        System.out.println("Child Default Method");
    }

}
