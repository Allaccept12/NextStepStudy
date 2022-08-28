package com.example.calculator;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringCalculator {

    public int addString(String input) {
        //',' , ':' , '" "', 합산을 구해야함. 빈 문자열이라면 0
        if (input == null || input.isBlank()) {
            return 0;
        }
        String[] splitString = splitString(input);
        int result = 0;
        for (String s : splitString) {
            result += checkNegativeNumber(s);
        }
        return result;
    }

    public int checkNegativeNumber(String input) {
        int number = Integer.parseInt(input);
        if (number < 0) {
            throw new RuntimeException();
        }
        return number;

    }

    public String[] splitString(String input) {
        Matcher matcher = Pattern.compile("//(.)\n(.*)").matcher(input);
        if (matcher.find()) {
            String customSeparator = matcher.group(1);
            return matcher.group(2).split(customSeparator);
        }
        return input.split(",|:");

    }
}
