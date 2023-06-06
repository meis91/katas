package com.codecool.makeTheDeatfishSwim;

import java.util.ArrayList;
import java.util.List;

public class DeadFish {
    public int[] parser(String commands){
        List<Integer> result = new ArrayList<>();
        int value = 0;

        for(char letter : commands.toCharArray()){
            switch (letter){
                case 'i':
                    value ++;
                    break;
                case 'd':
                    value --;
                    break;
                case 's':
                    value *= value;
                    break;
                case 'o':
                    result.add(value);
                default:
                    break;
            }
        }
        return result.stream().mapToInt(Integer::intValue).toArray();
    }
}
