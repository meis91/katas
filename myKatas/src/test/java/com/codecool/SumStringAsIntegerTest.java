package com.codecool;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class SumStringAsIntegerTest {

    SumStringAsInteger sumStringAsInteger = new SumStringAsInteger();


    public static Stream<Arguments> parameter (){
        return Stream.of(
                Arguments.of("1", "1", "2"),
                Arguments.of("0", "0", "0"),
                Arguments.of("", "", "0"),
                Arguments.of("0", "1", "1"),
                Arguments.of("", "1", "1"),
                Arguments.of("1", "2", "3"),
                Arguments.of("2147483647", "2147483647", "4294967294"),
                Arguments.of("72887506160685063745", "10", "72887506160685063755"),
                Arguments.of("2887506160685063745", "10", "2887506160685063755")
                /*Arguments.of(51, 5),
                Arguments.of(5, 5),
                Arguments.of(35, 8),
                Arguments.of(53, 8),
                Arguments.of(555, 15),
                Arguments.of(155, 10),
                Arguments.of(15533, 16),
                Arguments.of(123456789, 23)*/

        );
    }
    @ParameterizedTest
    @MethodSource("parameter")
    void sumStrings(String inputA, String inputB, String expected) {
        String actual = sumStringAsInteger.sumStrings(inputA, inputB);
        assertEquals(expected, actual);
    }

}