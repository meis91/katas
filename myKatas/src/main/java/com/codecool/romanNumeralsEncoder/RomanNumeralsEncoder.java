package com.codecool.romanNumeralsEncoder;

import java.util.Map;

public class RomanNumeralsEncoder {
    private final int[] ARAB_NUMBERS = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
    private final String[] ROMAN_NUMBERS = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};

    public String encode(int number){
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < ARAB_NUMBERS.length; i++) {
            while (number >= ARAB_NUMBERS[i]) {
                result.append(ROMAN_NUMBERS[i]);
                number -= ARAB_NUMBERS[i];
            }
        }
        return result.toString();
    }
}
