package com.codecool;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.DoubleStream;
import java.util.stream.Stream;



public class UniqueDoubles {

    /**
     * here is an array with some numbers. All numbers are equal except for one. Try to find it!

     * Kata.findUniq(new double[]{ 1, 1, 1, 2, 1, 1 }); // => 2
     * Kata.findUniq(new double[]{ 0, 0, 0.55, 0, 0 }); // => 0.55
     * It’s guaranteed that array contains at least 3 numbers.

     * The tests contain some very huge arrays, so think about performance.
     **/
    public Double findUniqueNumber(double[] numbers){
        List<Double> numbersAsList = DoubleStream.of(numbers)
                .boxed()
                .toList();

        return numbersAsList.stream()
                .filter(number -> Collections.frequency(numbersAsList, number) == 1)
                .findFirst()
                .get();
    }
}
