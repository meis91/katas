package com.codecool;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class PangramDetectorTest {
    PangramDetector pangramDetector = new PangramDetector();

    public static Stream<Arguments> parameter(){
        return Stream.of(
                Arguments.of(true, "The quick brown fox jumps over the lazy dog."),
                Arguments.of(false, "You shall not pass!"),
                Arguments.of(false, "!"),
                Arguments.of(false, "abdc defg hijk lmno pqrs tuvw xy"),
                Arguments.of(true, "abdc defg hijk lmno pqrs tuvw xyz"),
                Arguments.of(true, "abdc defg hijk lmno pqrs tuvw xyzz"),
                Arguments.of(true, "abdc defg hijk lmno pqrs tuvw xyzz1")
        );
    }

    @ParameterizedTest
    @MethodSource("parameter")
    void isPangram(boolean expected, String input) {
        boolean actual = pangramDetector.isPangram(input);

        assertEquals(expected, actual);
    }
}