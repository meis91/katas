package com.codecool.dotCalculator;

import java.util.List;

public class DotCalculator {

    private final int FIRST_NUMBER_IDX = 0;
    private final int SECOND_NUMBER_IDX = 2;
    private final int OPERATOR_IDX = 1;

    public String calculateDots(String dots){
        List<String> dotFormula = List.of(dots.split(" "));
        System.out.println(dotFormula);
        int firstNumber = convertDotToInt(dotFormula.get(FIRST_NUMBER_IDX));
        int secondNumber = convertDotToInt(dotFormula.get(SECOND_NUMBER_IDX));
        String operator = dotFormula.get(OPERATOR_IDX);
        return switch (operator) {
            case "+" -> add(dotFormula.get(FIRST_NUMBER_IDX), dotFormula.get(SECOND_NUMBER_IDX));
            case "-" -> subtract(firstNumber, secondNumber);
            case "*" -> multiply(firstNumber, secondNumber);
            case "//" -> divide(firstNumber, secondNumber);
            default -> "";
        };
    }

    private String divide(int firstNumber, int secondNumber) {
        return createDots(firstNumber / secondNumber);
    }

    private String multiply(int firstNumber, int secondNumber) {
        return createDots(firstNumber * secondNumber);
    }

    private String add(String firstNumber, String secondNumber){
        return firstNumber + secondNumber;
    }

    private String subtract(int firstNumber, int secondNumber){
        return createDots(firstNumber - secondNumber);
    }

    private int convertDotToInt(String dots){
        return dots.length();
    }

    private String createDots(int number){
        return ".".repeat(Math.max(0, number));
    }
}
