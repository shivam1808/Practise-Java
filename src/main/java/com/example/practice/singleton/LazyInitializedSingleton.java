package com.example.practice.singleton;

public class LazyInitializedSingleton {

    private static LazyInitializedSingleton instance;

    private LazyInitializedSingleton() {
    }

    /*
        Disadvantage - In multi-threaded code, if two threads are trying to getInstance then
        both the threads are coming here they are checking it's null then they will create
        two instance of it.
    */
    public static LazyInitializedSingleton getInstance() {
        if (instance == null) {
            return new LazyInitializedSingleton();
        }
        return instance;
    }
}
