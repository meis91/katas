package com.codecool.squareSum;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SquareSumTest {

    SquareSum squareSum = new SquareSum();

    public static Stream<Arguments> parameter(){
        return Stream.of(
                Arguments.of(9, new int[] {1,2,2}),
                Arguments.of(5, new int[] {1,2}),
                Arguments.of(50, new int[] {5,-3,4}),
                Arguments.of(0, new int[] {})
        );
    }
    @MethodSource("parameter")
    @ParameterizedTest
    void squareSum(int expected, int[] input) {
        int actual = squareSum.getSquareSum(input);

        assertEquals(expected, actual);
    }
}