package com.company;

/**
 * Created by User on 10.05.2016.
 */
public class Calculator {
    public String calculate(String expression) {
        char c0 = expression.charAt(0);
        char c4 = expression.charAt(4);
        if (expression.length() == 1 && Character.isDigit(c0)) {
            return expression;
        }
        char c1 = expression.charAt(1);
        if (expression.length() == 2 && Character.isDigit(c0) && Character.isDigit(c1)) {
            return expression;
        }
        char c2 = expression.charAt(2);
        if (expression.length() == 3 && Character.isDigit(c0) && Character.isDigit(c2) && c1 == '+') {

            String s0 = String.valueOf(c0);
            String s2 = String.valueOf(c2);
            Integer i0 = Integer.valueOf(s0);
            Integer i2 = Integer.valueOf(s2);
            String res = String.valueOf(i0 + i2);
            return res;
        }
        if (expression.length() == 3 && Character.isDigit(c0) && Character.isDigit(c2) && c1 == '-') {
            String s0 = String.valueOf(c0);
            String s2 = String.valueOf(c2);
            Integer i0 = Integer.valueOf(s0);
            Integer i2 = Integer.valueOf(s2);
            String res = String.valueOf(i0 - i2);
            return res;
        }
        if (expression.length() == 3 && Character.isDigit(c0) && Character.isDigit(c2) && c1 == '*') {
            String s0 = String.valueOf(c0);
            String s2 = String.valueOf(c2);
            Integer i0 = Integer.valueOf(s0);
            Integer i2 = Integer.valueOf(s2);
            String res = String.valueOf(i0 * i2);
            return res;
        }
        if (expression.length() == 3 && Character.isDigit(c0) && Character.isDigit(c2) && c1 == '/') {
            String s0 = String.valueOf(c0);
            String s2 = String.valueOf(c2);
            Integer i0 = Integer.valueOf(s0);
            Integer i2 = Integer.valueOf(s2);
            String res = String.valueOf(i0 / i2);
            return res;
        }
        char c3 = expression.charAt(3);
        if (expression.length() == 4
                && Character.isDigit(c0)
                && Character.isDigit(c1)
                && expression.charAt(2) == '+'
                && Character.isDigit(c3)) {
            String s0 = String.valueOf(c0);
            String s1 = String.valueOf(c1);
            String add = s0 + s1;
            String s3 = String.valueOf(c3);
            Integer i0 = Integer.valueOf(add);
            Integer i3 = Integer.valueOf(s3);
            String res = String.valueOf(i0 + i3);
            return res;
        }

        if (expression.length() == 4 && Character.isDigit(c0) && Character.isDigit(c1) && expression.charAt(2) == '-' && Character.isDigit(c3)) {
            String s0 = String.valueOf(c0);
            String s1 = String.valueOf(c1);
            String add = s0 + s1;
            String s3 = String.valueOf(c3);
            Integer i0 = Integer.valueOf(add);
            Integer i3 = Integer.valueOf(s3);
            String res = String.valueOf(i0 - i3);
            return res;
        }
        if (expression.length() == 4 && Character.isDigit(c0) && Character.isDigit(c1) && expression.charAt(2) == '+' && Character.isDigit(c3)) {
            String s0 = String.valueOf(c0);
            String s1 = String.valueOf(c1);
            String add = s0 + s1;
            String s3 = String.valueOf(c3);
            Integer i0 = Integer.valueOf(add);
            Integer i3 = Integer.valueOf(s3);
            String res = String.valueOf(i0 + i3);
            return res;
        }

        if (expression.length() == 5 && Character.isDigit(c0) && Character.isDigit(c1) && expression.charAt(2) == '-' && Character.isDigit(c3) && Character.isDigit(c4)) {
            String s0 = String.valueOf(c0);
            String s1 = String.valueOf(c1);
            String add = s0 + s1;
            String s3 = String.valueOf(c3);
            String s4 = String.valueOf(c4);
            String add2 = s3 + s4;
            Integer i0 = Integer.valueOf(add);
            Integer i1 = Integer.valueOf(add2);
            String res = String.valueOf(i0 - i1);
            return res;
        }
        if (expression.length() == 5 && Character.isDigit(c0) && Character.isDigit(c1) && expression.charAt(2) == '+' && Character.isDigit(c3) && Character.isDigit(c4)) {
            String s0 = String.valueOf(c0);
            String s1 = String.valueOf(c1);
            String add = s0 + s1;
            String s3 = String.valueOf(c3);
            String s4 = String.valueOf(c4);
            String add2 = s3 + s4;
            Integer i0 = Integer.valueOf(add);
            Integer i1 = Integer.valueOf(add2);
            String res = String.valueOf(i0 + i1);
            return res;
        }

        return "0";
    }
}

