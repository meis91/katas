package com.codecool.alphabetSymmetry;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AlphabetSymmetry {
    public int[] checkAlphabeticPositions(String[] input){
        List<Integer> result = new ArrayList<>();
        List<String> lowerCaseList = inputToLowerCaseList(input);
        for (String s : lowerCaseList) {
            int count = getNumberOfAlphabeticPositions(s);
            if (count > 0) {
                result.add(count);
            }
        }
        System.out.println("result = " + result);
        int[] arr = listToIntArray(result);
        System.out.println("arr = " + arr);
        return arr;
    }

    private List<String> inputToLowerCaseList(String[] arr) {
        return Arrays.stream(arr)
                .map(String::toLowerCase)
                .toList();
    }

    private int getNumberOfAlphabeticPositions(String string){
        int count = 0;
        for (int i = 0; i < string.length(); i++){
            char letter = string.charAt(i);
            if(i == letter - 'a' + 1){
                count ++;
            }
        }
        return count;
    }

    private int[] listToIntArray(List<Integer> list) {
        int[] result = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            result[i] = list.get(i);
        }
        return result;
    }

}
