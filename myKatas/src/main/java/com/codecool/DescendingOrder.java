package com.codecool;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;


import static java.util.stream.Collectors.toList;

public class DescendingOrder {
    public int sortDesc(final int num) {
        String numbersStr  = String.valueOf(num);
        String numS = numbersStr.chars().boxed().sorted(Collections.reverseOrder()).map(Number::toString).collect(Collectors.joining());
        System.out.println("numS = " + numS);
        List <String> strList = List.of(numbersStr.split(""));
       /* String strSorted = strList.stream()
                .sorted(Collections.reverseOrder())
                .collect(Collectors.joining());*/
        return Integer.parseInt(numS);
    }
}
