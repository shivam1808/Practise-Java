package com.example.practice.immutable;

import java.util.ArrayList;
import java.util.List;

public class ImmutableExampleWithRecord {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("A");

        ImmutableRecord immutableRecord = new ImmutableRecord(1, "New", list);

        System.out.println("Immutable Record - " + immutableRecord);

        list =immutableRecord.strings();

        /*
            it will throw UnsupportedOperationException as we are trying to modify a collection
            which is created using an unmodifiable list.
         */
        list.add("B");

        System.out.println("Updated Immutable Record - " + immutableRecord);
    }
}
