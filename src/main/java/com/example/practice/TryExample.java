package com.example.practice;

public class TryExample {

    public static void main(String[] args) {
        System.out.println("Returned Value = " + test2());
    }

    // Finally block overrides the try block's return
    public static int test() {
        try {
            System.out.println("Inside Try");
            return 1;
        }
        finally {
            System.out.println("Inside Finally");
            return 2;
        }
    }

    
    public static int test2() {
        int x = 0;
        try {
            System.out.println("Inside Try");
            x = 1;
            return x;
        }
        finally {
            System.out.println("Inside Finally");
            x = 2;
        }
    }
}
