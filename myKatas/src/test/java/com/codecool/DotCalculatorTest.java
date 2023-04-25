package com.codecool;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class DotCalculatorTest {

    DotCalculator  dotCalculator = new DotCalculator();
    public static Stream<Arguments> parameter(){
        return Stream.of(
                Arguments.of("....................",  "..... + ..............."),
                Arguments.of("..", ". + ."),
                Arguments.of(".", ".. - ."),
                Arguments.of("", ". - ."),
                Arguments.of("....", ".. * .."),
                Arguments.of("..", ".... // .."),
                Arguments.of("", ". // ..")
        );
    }
    @ParameterizedTest
    @MethodSource("parameter")
    void calculateDots(String expected, String input) {
        String actual = dotCalculator.calculateDots(input);
        assertEquals(expected, actual);
    }
}