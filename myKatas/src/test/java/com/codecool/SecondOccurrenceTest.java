package com.codecool;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class SecondOccurrenceTest {

    SecondOccurrence secondOccurrence = new SecondOccurrence();
    public static Stream<Arguments> parameter (){
        return Stream.of(
                Arguments.of(3, "Hello world!!!", 'l'),
                Arguments.of(7, "Hello world!!!", 'o'),
                Arguments.of(7, "Hello worldo!!!", 'o'),
                Arguments.of(-1, "Hello world!!!", 'A'),
                Arguments.of(-1, "", 'q'),
                Arguments.of(-1, "Hello", '!'),
                Arguments.of(6, "Hello!!", '!')
        );
    }

    @ParameterizedTest
    @MethodSource("parameter")
    void findSecondOccurrenceOfChar(int expected, String inputSentence, char inputChar) {
        int actual = secondOccurrence.findSecondOccurrenceOfChar(inputSentence, inputChar);

        assertEquals(expected, actual);
    }
}