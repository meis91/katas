package com.codecool.goodVsEvil;

import java.util.stream.Stream;

public class GoodVsEvil {

    private final int[] GOOD_WARRIORS_POINTS = {1, 2, 3, 3, 4, 10};
    private final int[] EVIL_WARRIORS_POINTS = {1, 2, 2, 2, 3, 5, 10};
    public String battle(String goodAmounts, String evilAmounts){
        int[] goodWarriors = Stream.of(goodAmounts.split(" ")).mapToInt(Integer::parseInt).toArray();
        int[] evilWarriors = Stream.of(evilAmounts.split(" ")).mapToInt(Integer::parseInt).toArray();
        int goodArmyValue = getArmyValue(goodWarriors, GOOD_WARRIORS_POINTS);
        System.out.println("goodArmyValue = " + goodArmyValue);
        int evilArmyValue = getArmyValue(evilWarriors, EVIL_WARRIORS_POINTS);
        System.out.println("evilArmyValue = " + evilArmyValue);
        if(goodArmyValue > evilArmyValue){
            return "Battle Result: Good triumphs over Evil";
        } else if (goodArmyValue < evilArmyValue){
            return "Battle Result: Evil eradicates all trace of Good";
        } else {
            return "Battle Result: No victor on this battle field";
        }
    }

    private int getArmyValue(int[] warriors, int[] points){
        int result = 0;
        for (int i = 0; i < warriors.length; i++){
            int warriorTypePoints = warriors[i] * points[i];
            result += warriorTypePoints;
        }
        return result;
    }
}
