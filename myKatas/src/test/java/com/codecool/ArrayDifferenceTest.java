package com.codecool;

import com.codecool.arrayDifference.ArrayDifference;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class ArrayDifferenceTest {
    ArrayDifference arrayDifference = new ArrayDifference();


    public static Stream<Arguments> parameter(){
        return Stream.of(
                Arguments.of(new int[] {2}, new int [] {1,2}, new int[] {1}),
                Arguments.of(new int[] {2,2 }, new int [] {1,2,2}, new int[] {1}),
                Arguments.of(new int[] {1}, new int [] {1,2,2}, new int[] {2}),
                Arguments.of(new int[] {1, 2, 2}, new int [] {1,2,2}, new int[] {}),
                Arguments.of(new int[] {2}, new int [] {1,2}, new int[] {1}),
                Arguments.of(new int[] {}, new int [] {}, new int[] {1,2})
        );
    }
    @MethodSource("parameter")
    @ParameterizedTest
    void subtractArray(int[] expected, int[] inputA, int[] inputB) {
        int[] actual = arrayDifference.subtractArray(inputA, inputB);

        assertArrayEquals(expected, actual);
    }
}