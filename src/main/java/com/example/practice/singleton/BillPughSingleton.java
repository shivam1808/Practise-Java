package com.example.practice.singleton;

public class BillPughSingleton {

    private BillPughSingleton() {
    }

    /*
        Nested Class Access Rights: In Java, even though is a private nested class,
        the enclosing class has full access to all members of its nested classes,
        including private members. `SingletonHelper``BillPughSingleton`
    */
    private static class SingletonHelper {
        private static final BillPughSingleton INSTANCE = new BillPughSingleton();
    }

    /*
    The public `getInstance()` method acts as a controlled access point (or gateway)
    to the private `INSTANCE`. While external classes cannot directly access
    `SingletonHelper.INSTANCE`, they can access it through the public `getInstance()` method.
    */
    public static BillPughSingleton getInstance() {
        return SingletonHelper.INSTANCE;
    }

    /*
    This encapsulation ensures that the singleton pattern is properly maintained while
    still allowing the necessary access to the instance when needed.
    */
}
