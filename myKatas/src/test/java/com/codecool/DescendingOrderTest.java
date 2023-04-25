package com.codecool;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class DescendingOrderTest {

    DescendingOrder descendingOrder = new DescendingOrder();
    public static Stream<Arguments> parameter (){
        return Stream.of(
                Arguments.of(0, 0),
                Arguments.of(1, 1),
                Arguments.of(42145, 54421 ),
                Arguments.of(145263, 654321),
                Arguments.of(123456789, 987654321)
        );
    }


    @ParameterizedTest
    @MethodSource("parameter")
    void sortDesc(int input, int expected) {
        int result = descendingOrder.sortDesc(input);
        assertEquals(expected, result);
    }
}