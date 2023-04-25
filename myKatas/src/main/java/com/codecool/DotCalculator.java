package com.codecool;

import java.util.List;

public class DotCalculator {
    /**
    INSTRUCTION:
    You have to write a calculator that receives strings for input.
    The dots will represent the number in the equation. There will be dots on one side, an operator, and dots again after the operator.
    The dots and the operator will be separated by one space.

    Here are the following valid operators :

    + Addition
    - Subtraction
    * Multiplication
    // Integer Division
    Your Work (Task)
    You'll have to return a string that contains dots, as many the equation returns.
    If the result is 0, return the empty string. When it comes to subtraction,
    the first number will always be greater than or equal to the second number.
     */

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
