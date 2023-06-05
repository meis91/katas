package com.codecool.sumASequence;

public class SumASequence {

    public  int sumSequence(int start, int end, int step){
        if(step == 0){
            return start;
        }
        int result = 0;
        for (int i = start; i <= end; i += step) result += i;
        return result;
    }
}
