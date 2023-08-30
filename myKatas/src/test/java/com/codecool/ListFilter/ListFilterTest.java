package com.codecool.ListFilter;

import com.codecool.listFilter.ListFilter;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class ListFilterTest {

    ListFilter listFilter = new ListFilter();
    public static Stream<Arguments> parameter(){
        return Stream.of(
                Arguments.of(List.of(1,2), List.of(1, 2, "a", "b")),
                Arguments.of(List.of(1,2,0,15), List.of(1, 2, "a", "b", 0, 15)),
                Arguments.of(List.of(1, 2, 231), List.of(1, 2, "a", "b", "aasf", "1", "123", 231))
                );
    }
    @MethodSource("parameter")
    @ParameterizedTest
    void filterNumbers(List<Object> expected, List<Object> input) {
        List<Object> actual = listFilter.filterNumbers(input);

        assertEquals(expected, actual);
    }
}