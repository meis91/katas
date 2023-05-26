package com.codecool.multiplesOfThreeOrFive;

import java.util.stream.Stream;

public class MultiplesOfThreeOrFive {

    public int sumMultiplesOfThreeAndFive(int number) {
       if(number < 0){
           return 0;
       } else {
           return  Stream.of(String.valueOf(number).split(""))
                   .map(Integer::parseInt)
                   .filter( i -> i % 3 == 0 || i % 5 == 0 )
                   .reduce(0, Integer::sum);
       }
    }
}
