package com.codecool.betweenExtremes;

import java.util.stream.IntStream;

public class BetweenExtremes {

    public int getDifferenceBetweenMinAndMax(int[] numbers){
        int min = getMin(numbers);
        int max = getMax(numbers);
        return max - min;
    }

    private int getMax(int[] numbers) {
        return IntStream.of(numbers)
                .max()
                .getAsInt();
    }

    private int getMin(int[] numbers) {
        return IntStream.of(numbers)
                .min()
                .getAsInt();
    }
}
