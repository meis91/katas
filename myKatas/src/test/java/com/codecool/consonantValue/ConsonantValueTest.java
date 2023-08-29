package com.codecool.consonantValue;


import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class ConsonantValueTest {

    ConsonantValue consonantValue = new ConsonantValue();
    public static Stream<Arguments> parameter(){
        return Stream.of(
                Arguments.of("zodiac", 26),
                Arguments.of("chruschtschov", 80),
                Arguments.of("khrushchev", 38),
                Arguments.of("strength", 57),
                Arguments.of("catchphrase", 73),
                Arguments.of("twelfthstreet", 103),
                Arguments.of("mischtschenkoana", 80)
        );
    }

    @ParameterizedTest
    @MethodSource("parameter")
    void getConsonantValue(String input, int expected) {
        int actual = consonantValue.getConsonantValue(input);

        assertEquals(expected, actual);
    }
}