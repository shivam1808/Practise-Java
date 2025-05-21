package com.example.practice.immutable;

import java.util.ArrayList;
import java.util.List;

public final class ImmutableModel {

    private final int id;
    private final String name;

    /*
        This will result in making the class not completely immutable
    */
    private final List<String> stringList;

    public ImmutableModel(int id, String name, List<String> stringList) {
        this.id = id;
        this.name = name;
        // this.stringList = stringList;
        // To make it immutable, we need to do a deep copy
        this.stringList = new ArrayList<>(stringList);

    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public List<String> getStringList() {
        // Create a deep copy or create another reference of the list
        return List.copyOf(stringList);
    }

    @Override
    public String toString() {
        return "ImmutableModel{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", stringList=" + stringList +
                '}';
    }
}
