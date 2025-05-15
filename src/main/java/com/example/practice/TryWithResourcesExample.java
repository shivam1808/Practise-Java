package com.example.practice;

import java.io.FileReader;
import java.io.IOException;

public class TryWithResourcesExample {

    public static void main(String[] args) throws IOException {
        try (FileReader reader = new FileReader("test.txt")) {
            System.out.println("Inside try with Resource");
        }
    }

}
