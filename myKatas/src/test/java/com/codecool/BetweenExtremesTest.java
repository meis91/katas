package com.codecool;

import com.codecool.betweenExtremes.BetweenExtremes;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class BetweenExtremesTest {

   BetweenExtremes betweenExtremes = new BetweenExtremes();
    public static Stream<Arguments> parameter (){
        return Stream.of(
                Arguments.of(0, new int[]{0, 0}),
                Arguments.of(0, new int[]{1, 1}),
                Arguments.of(0, new int[]{5, 5, 5}),
                Arguments.of(10, new int[]{-5, 5}),
                Arguments.of(1000000000, new int[]{1000000000, 0}),
                Arguments.of(42, new int[]{21, 34, 54, 43, 26, 50, 26, 12}),
                Arguments.of(99, new int[]{-1, -41, -77, -100}),
                Arguments.of(2147483647, new int[]{0, 2147483647})
                );
    }


    @ParameterizedTest
    @MethodSource("parameter")
    void getDifferenceBetweenMinAndMax(int expected, int[] input) {
        int actual = betweenExtremes.getDifferenceBetweenMinAndMax(input);
        assertEquals(expected, actual);
    }

}