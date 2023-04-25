package com.codecool;


import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class UniqueDoublesTest {

    UniqueDoubles uniqueDoubles = new UniqueDoubles();

    public static Stream<Arguments> parameter (){
        return Stream.of(
                Arguments.of(1.0, new double[]{0, 1, 0}),
                Arguments.of(5.0, new double[]{0, -1, 0, -1, 5, -5}),
                Arguments.of(1.5, new double[]{0, 1.5, 0}),
                Arguments.of(1.0, new double[]{0, 1, 0, 10, 3}),
                Arguments.of(1.0001, new double[]{1.001, 1.0001, 1.001}),
                Arguments.of(0.5, new double[]{1, 1, 0.5, 1}),
                Arguments.of(0.0000000000001, new double[]{0.0000000000002, 0.0000000000001, 0.0000000000002})
        );
    }


    @ParameterizedTest
    @MethodSource("parameter")
    void findUniqueNumber(double expected, double[] input) {
        double actual = uniqueDoubles.findUniqueNumber(input);

        assertEquals(expected, actual);
    }
}