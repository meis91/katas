package com.codecool;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class MultiplesOfThreeOrFiveTest {

    MultiplesOfThreeOrFive multiplesOfThreeOrFive = new MultiplesOfThreeOrFive();

    public static Stream<Arguments> parameter (){
        return Stream.of(
                Arguments.of(-1, 0),
                Arguments.of(0, 0),
                Arguments.of(1, 0),
                Arguments.of(3, 3),
                Arguments.of(31, 3),
                Arguments.of(51, 5),
                Arguments.of(5, 5),
                Arguments.of(35, 8),
                Arguments.of(53, 8),
                Arguments.of(555, 15),
                Arguments.of(155, 10),
                Arguments.of(15533, 16),
                Arguments.of(123456789, 23)

        );
    }
    @ParameterizedTest
    @MethodSource("parameter")
    void sumMultiplesOfThreeAndFive(int input, int expected) {
        int actuall = multiplesOfThreeOrFive.sumMultiplesOfThreeAndFive(input);
        assertEquals(expected, actuall);
    }
}