package com.codecool.consonantValue;

public class ConsonantValue {

    public int getConsonantValue(String input){
        int result = 0;

        String[] consonantsOnly = input.split("[aeiou]+");

        for (String consonants : consonantsOnly) {
            String[] subArray = consonants.split("");
            int valueSubArray = 0;
            for(String consonant : subArray){
                valueSubArray += getConsonantValueFromLetter(consonant);
            }
            if(valueSubArray > result){
                result = valueSubArray;
            }
        }
        return result;
    }

    private int getConsonantValueFromLetter(String letter){
        return letter.charAt(0) - 'a' + 1;
    }
}
