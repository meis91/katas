package com.codecool.howGoodAreYou;

import java.util.Arrays;
import java.util.OptionalDouble;

public class HowGoodAreYouReally {
    public boolean areYouBetterThanAverage(int[] classPoints, int yourPoints){
        return calculateAverage(classPoints) < yourPoints;
    }

    private int calculateAverage(int[] classPoints){
        double average = Arrays.stream(classPoints)
                .average()
                .orElseThrow(IllegalStateException::new);
        return (int) average;
    }
}
