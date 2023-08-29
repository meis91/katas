package com.codecool.squareSum;

import java.util.Arrays;

public class SquareSum {
    public int getSquareSum(int[] input)
    {
        return Arrays.stream(input)
                .map(number -> number * number)
                .sum();
    }
}
