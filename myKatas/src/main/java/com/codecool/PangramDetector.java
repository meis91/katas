package com.codecool;

import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class PangramDetector {
    /**
     * A pangram is a sentence that contains every single letter of the alphabet at least once.
     * For example, the sentence "The quick brown fox jumps over the lazy dog" is a pangram, because it uses the letters A-Z at least once (case is irrelevant).
     * Instructions:
     * Given a string, detect whether or not it is a pangram. Return True if it is, False if not. Ignore numbers and punctuation.
     */

    public boolean isPangram(String sentence){
        sentence = sentence.toLowerCase();

        Stream<Character> sentenceChars = sentence.chars()
                                                .mapToObj(ch -> (char) ch);

        Set<Character> letters = sentenceChars.filter(Character::isLetter)
                .collect(Collectors.toSet());


        return letters.size() == 26;
    }
}
