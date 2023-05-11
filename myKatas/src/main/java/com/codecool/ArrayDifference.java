package com.codecool;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class ArrayDifference {
/*
    Your goal in this kata is to implement a difference function, which subtracts one list from another and returns the result.

    It should remove all values from list a, which are present in list b keeping their order.

            Kata.arrayDiff(new int[] {1, 2}, new int[] {1}) => new int[] {2}
    If a value is present in b, all of its occurrences must be removed from the other:

            Kata.arrayDiff(new int[] {1, 2, 2, 2, 3}, new int[] {2}) => new int[] {1, 3}
*/

    public int[] subtractArray(int[] minuends, int[] subtrahends){
        if(subtrahends.length == 0){
            return minuends;
        } else {
            List<Integer> result = new ArrayList<>();
            List<Integer> minuendsList = IntStream.of(minuends)
                    .boxed()
                    .toList();
            for (Integer subtrahend : subtrahends) {
                result = minuendsList.stream()
                        .filter(number -> number.intValue() != subtrahend.intValue())
                        .toList();
            }
            return result.stream().mapToInt(Integer::intValue).toArray();
        }
    }

}
