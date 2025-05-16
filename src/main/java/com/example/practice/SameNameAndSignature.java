package com.example.practice;

interface InA {
    void method ();
}

interface InB {
    void method ();
}

public class SameNameAndSignature implements InA, InB{

    @Override
    public void method() {

    }
}
