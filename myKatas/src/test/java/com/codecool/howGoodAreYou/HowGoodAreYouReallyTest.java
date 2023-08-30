package com.codecool.howGoodAreYou;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class HowGoodAreYouReallyTest {
    HowGoodAreYouReally howGoodAreYouReally = new HowGoodAreYouReally();
    public static Stream<Arguments> parameter(){
        return Stream.of(
                Arguments.of(true, new int[] {2, 3}, 5),
                Arguments.of(true, new int[] {100, 40, 34, 57, 29, 72, 57, 88}, 75),
                Arguments.of(true, new int[] {12, 23, 34, 45, 56, 67, 78, 89, 90}, 69),
                Arguments.of(false, new int[] {100, 90}, 11)
        );
    }
    @MethodSource("parameter")
    @ParameterizedTest
    void areYouBetterThanAverage(boolean expected, int[] classPoints, int yourPoints) {
        boolean actual = howGoodAreYouReally.areYouBetterThanAverage(classPoints, yourPoints);

        assertEquals(expected, actual);
    }
}