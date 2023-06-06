package com.codecool.makeTheDeatfishSwim;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class DeadFishTest {

    DeadFish deadFish = new DeadFish();

    public static Stream<Arguments> parameter(){
        return Stream.of(
                Arguments.of(new int[] {8, 64}, "iiisdoso"),
                Arguments.of(new int[] {8, 64, 3600}, "iiisdosodddddiso")
        );
    }
    @ParameterizedTest
    @MethodSource("parameter")
    void parser(int[]expected, String input) {
        int[] actual = deadFish.parser(input);

        assertArrayEquals(expected, actual);
    }
}