package com.codecool.romanNumeralsEncoder;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class RomanNumeralsEncoderTest {
    RomanNumeralsEncoder romanNumeralsEncoder = new RomanNumeralsEncoder();
    @ParameterizedTest
    @CsvSource({
            "'I', 1",
            "'II', 2",
            "'IV', 4",
            "'V', 5",
            "'VI', 6",
            "'IX', 9",
            "'X', 10",
            "'XI', 11",
            "'XIV', 14",
            "'XIX', 19",
            "'XX', 20",
            "'MCMXC', 1990",
            "'MMVIII', 2008",
            "'MDCLXVI', 1666"
    })
    void encoder(String expected, int number) {
        String actual = romanNumeralsEncoder.encode(number);

        assertEquals(expected, actual);
    }
}