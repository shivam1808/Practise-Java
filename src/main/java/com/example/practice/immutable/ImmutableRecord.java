package com.example.practice.immutable;

import java.util.List;

public record ImmutableRecord(int id, String name, List<String> strings) {

    public ImmutableRecord {
        strings = List.copyOf(strings);
    }
}
