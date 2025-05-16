package com.example.practice;

interface IA {
    void method ();
}

interface IB {
    int method ();
}

// This will not compile
public class SameNameAndDifferentSignature implements IA{

    @Override
    public void method() {

    }
}
