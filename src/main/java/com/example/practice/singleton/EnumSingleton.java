package com.example.practice.singleton;

public enum EnumSingleton {

    INSTANCE;

    public static void main(String[] args) {
        EnumSingleton singleton = EnumSingleton.INSTANCE;
    }
}
