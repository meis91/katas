package com.codecool.flattenAndSort;

import java.util.Arrays;

import java.util.stream.Stream;

public class FlattenAndSort {
        public int[] flattenAndSort(int[][] nestedArray){
        return Stream.of(nestedArray)
                .flatMapToInt(Arrays::stream)
                .sorted()
                .toArray();
    }
}
