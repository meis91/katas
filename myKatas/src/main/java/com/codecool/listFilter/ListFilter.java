package com.codecool.listFilter;

import java.util.List;

public class ListFilter {
    public List<Object> filterNumbers(List<Object> input) {
        return input.stream()
                .filter(o -> o instanceof Number)
                .toList();
    }

}
