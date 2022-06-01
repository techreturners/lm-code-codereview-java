package com.techreturners.exercise003;

public class Calculator {

    public int calculate(int a, int b, String operator) {
        int result = Integer.MIN_VALUE;

        if ("add".equals(operator)) {
            System.out.println(result = a + b);
        } else if ("multiply".equals(operator)) {
            System.out.println(result = a * b);
        } else if ("divide".equals(operator)) {
            System.out.println(result = a / b);
        } else if ("subtract".equals(operator)) {
            System.out.println(result = a - b);
        }
        return result;
    }
}
