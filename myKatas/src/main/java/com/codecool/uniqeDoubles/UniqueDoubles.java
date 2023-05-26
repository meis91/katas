package com.codecool.uniqeDoubles;

import java.util.Collections;
import java.util.List;
import java.util.stream.DoubleStream;

public class UniqueDoubles {
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
