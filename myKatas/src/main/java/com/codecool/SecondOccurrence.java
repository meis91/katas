package com.codecool;

import java.util.Arrays;
import java.util.stream.Stream;

public class SecondOccurrence {
    /*
    Find the index of the second occurrence of a letter in a string
    n this kata, you need to write a function that takes a string and a letter as input and then returns the index of the second occurrence of that letter in the string. If there is no such letter in the string, then the function should return -1. If the letter occurs only once in the string, then -1 should also be returned.

    Examples:
    second_symbol('Hello world!!!','l') --> 3
    second_symbol('Hello world!!!', 'A') --> -1

     */

    public int findSecondOccurrenceOfChar(String sentence, char charToFind){
        int firstIndex = sentence.indexOf(charToFind);
        int secondIndex = sentence.indexOf(charToFind, firstIndex + 1);

        return secondIndex;
    }
}
