package com.example.practice;

import java.util.Arrays;

public class MainMethodOverload {

    // JVM will search for only this method signature
    public static void main(String[] args) {
        System.out.println("Main With String Args");
        main(new int[]{1, 2, 3});
    }

    public static void main(int[] args) {
        System.out.println("Main With Int Args " + Arrays.toString(args));
    }
}
