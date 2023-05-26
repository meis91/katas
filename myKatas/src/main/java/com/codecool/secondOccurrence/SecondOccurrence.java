package com.codecool.secondOccurrence;

public class SecondOccurrence {
    public int findSecondOccurrenceOfChar(String sentence, char charToFind){
        int firstIndex = sentence.indexOf(charToFind);
        int secondIndex = sentence.indexOf(charToFind, firstIndex + 1);

        return secondIndex;
    }
}
