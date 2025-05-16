package com.example.practice;

public class SwitchWithNullExample {

    public static void main(String[] args) {
        String s = null;
        switch (s) {
            case null -> {
                System.out.println("Null Value");
                break;
            }
            case "XX" -> {
                System.out.println("XX");
                break;
            }
            default -> System.out.println("Default");
        }
    }

}