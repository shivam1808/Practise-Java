package com.example.practice.immutable;

import java.util.ArrayList;
import java.util.List;

public class ImmutableExample {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("A");

        ImmutableModel immutableModel = new ImmutableModel(1, "New", list);

        System.out.println("Immutable Model - " + immutableModel);

        // loop hole
        list = immutableModel.getStringList();

        list.add("B");

        System.out.println("Updated Immutable Model - " + immutableModel);
    }
}
