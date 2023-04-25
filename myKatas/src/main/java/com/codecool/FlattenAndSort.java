package com.codecool;

import java.util.Arrays;

import java.util.stream.Stream;

public class FlattenAndSort {
    /*
    Challenge:

    Given a two-dimensional array of integers, return the flattened version of the array with all the integers in the sorted (ascending) order.

    Example:

    Given [[3, 2, 1], [4, 6, 5], [], [9, 7, 8]], your function should return [1, 2, 3, 4, 5, 6, 7, 8, 9].
    */

    public int[] flattenAndSort(int[][] nestedArray){
        return Stream.of(nestedArray)
                .flatMapToInt(Arrays::stream)
                .sorted()
                .toArray();
    }
}
