package com.codecool;

public class SumStringAsInteger {

    private static final int MAX_DIGITS_LONG = 19;

    public String sumStrings(String a, String b) {
        long longA = checkIfEmptyString(a) ? 0L : convertStringToLong(a);
        long longB = checkIfEmptyString(a) ? 0L : convertStringToLong(b);
        return convertLongToString(sum(longA, longB));
    }

    private long convertStringToLong(String input) {
        try {
            long inputAsLong = Long.parseLong(input);
            return inputAsLong;
        } catch (NumberFormatException e) {
            System.out.println("Invalid long: " + input);
            return 0;
        }
    }

    private long sum(long a, long b){
        return a + b;
    }

    private String convertLongToString(long input){
        return Long.toString(input);
    }

    private boolean checkIfEmptyString(String input){
        if(input.length() == 0){
            return true;
        } else {
            return false;
        }
    }

    private boolean checkIfLongerThenLong(String input){
        if(input.length() > MAX_DIGITS_LONG){
            return true;
        } else {
            return false;
        }
    }


}
