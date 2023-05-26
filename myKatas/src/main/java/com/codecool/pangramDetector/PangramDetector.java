package com.codecool.pangramDetector;

import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class PangramDetector {
    public boolean isPangram(String sentence){
        sentence = sentence.toLowerCase();

        Stream<Character> sentenceChars = sentence.chars()
                                                .mapToObj(ch -> (char) ch);

        Set<Character> letters = sentenceChars.filter(Character::isLetter)
                .collect(Collectors.toSet());


        return letters.size() == 26;
    }
}
