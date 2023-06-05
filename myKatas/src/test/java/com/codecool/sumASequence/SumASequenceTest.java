package com.codecool.sumASequence;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class SumASequenceTest {

    SumASequence sumASequence = new SumASequence();
    public static Stream<Arguments> parameter (){
        return Stream.of(
                Arguments.of(2, 2, 2, 2),
                Arguments.of(12, 2, 6, 2 ),
                Arguments.of(15, 1, 5, 1),
                Arguments.of(5, 1, 5, 3),
                Arguments.of(45, 0, 15, 3),
                Arguments.of(0, 16, 15, 3),
                Arguments.of(0, 0, 0, 0),
                Arguments.of(1, 1, 5, 0)
        );
    }
    @MethodSource("parameter")
    @ParameterizedTest
    void sequenceSum(int expected, int begin, int end, int step ) {
        int actual = sumASequence.sumSequence(begin, end, step);

        assertEquals(expected, actual);
    }
}