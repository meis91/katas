package com.codecool.alphabetSymmetry;


import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;


class AlphabetSymmetryTest {
    AlphabetSymmetry alphabetSymmetry = new AlphabetSymmetry();

    public static Stream<Arguments> parameter(){
        return Stream.of(
                Arguments.of(new int[]{4,3,1}, new String[]{"abode","ABc","xyzD"}),
                Arguments.of(new int[]{4,3,0}, new String[]{"abide","ABc","xyz"}),
                Arguments.of(new int[]{6,5,7}, new String[]{"IAMDEFANDJKL","thedefgh","xyzDEFghijabc"}),
                Arguments.of(new int[]{1,3,1,3}, new String[]{"encode","abc","xyzD","ABmD"})
        );
    }
    @ParameterizedTest
    @MethodSource("parameter")
    void checkAlphabeticPositions(int[] expected, String[] input) {
        int[] actual = alphabetSymmetry.checkAlphabeticPositions(input);

        assertEquals(expected, actual);
    }
}