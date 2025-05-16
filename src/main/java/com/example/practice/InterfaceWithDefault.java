package com.example.practice;

interface A {
    default void method () {
        System.out.println("Interface A");
    }
}

interface B {
    default void method () {
        System.out.println("Interface B");
    }
}

public class InterfaceWithDefault implements A, B {

    @Override
    public void method() {
        A.super.method();
        B.super.method();
    }

}
