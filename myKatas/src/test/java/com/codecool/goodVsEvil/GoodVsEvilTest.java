package com.codecool.goodVsEvil;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class GoodVsEvilTest {

    GoodVsEvil goodVsEvil = new GoodVsEvil();

    public static Stream<Arguments> parameter(){
        return Stream.of(
                Arguments.of("Battle Result: Evil eradicates all trace of Good",
                        "1 1 1 1 1 1", "1 1 1 1 1 1 1"),
                Arguments.of("Battle Result: Good triumphs over Evil",
                        "0 0 0 0 0 10", "0 1 1 1 1 0 0"),
                Arguments.of("Battle Result: No victor on this battle field",
                        "1 0 0 0 0 0", "1 0 0 0 0 0 0")
        );
    }
    @MethodSource("parameter")
    @ParameterizedTest
    void battle(String expected, String inputGood, String inputEvil) {
        String actual = goodVsEvil.battle(inputGood, inputEvil);
        assertEquals(expected, actual);
    }
}