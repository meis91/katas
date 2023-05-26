package com.codecool;


import com.codecool.flattenAndSort.FlattenAndSort;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class FlattenAndSortTest {

    FlattenAndSort flattenAndSort = new FlattenAndSort();
    public static Stream<Arguments> parameter (){
        return Stream.of(
                Arguments.of(new int[]{}, new int[][]{}),
                Arguments.of(new int[]{1}, new int[][]{{}, {1}}),
                Arguments.of(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9}, new int[][]{{3, 2, 1}, {7, 9, 8}, {6, 4, 5}}),
                Arguments.of(new int[]{1, 2, 3, 4, 5, 6, 100}, new int[][]{{1, 3, 5} ,{100}, {2, 4, 6}}),
                Arguments.of(new int[]{111, 222, 333, 444, 555, 666, 777, 888, 999}, new int[][] {{111, 999}, {222}, {333}, {444}, {888}, {777}, {666}, {555}})
        );
    }


    @ParameterizedTest
    @MethodSource("parameter")
    void flattenAndSort(int[] expected, int[][] input) {
        int[] actual = flattenAndSort.flattenAndSort(input);
        assertArrayEquals(expected, actual);
    }
}