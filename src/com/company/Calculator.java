package com.company;

/**
 * Created by User on 10.05.2016.
 */
public class Calculator {
    public String calculate(String exp) {
        if (exp.length() == 1 && Character.isDigit(exp.charAt(0))) {
            return exp;
        }
        if (exp.length() == 2 && Character.isDigit(exp.charAt(0)) && Character.isDigit(exp.charAt(1))) {
            return exp;
        }

        if (exp.length() == 3 && Character.isDigit(exp.charAt(0)) && Character.isDigit(exp.charAt(2)) && exp.charAt(1) == '+') {

            String s0 = String.valueOf(exp.charAt(0));
            String s2 = String.valueOf(exp.charAt(2));
            Integer i0 = Integer.valueOf(s0);
            Integer i2 = Integer.valueOf(s2);
            String res = String.valueOf(i0 + i2);
            return res;
        }
        if (exp.length() == 3 && Character.isDigit(exp.charAt(0)) && Character.isDigit(exp.charAt(2)) && exp.charAt(1) == '-') {
            String s0 = String.valueOf(exp.charAt(0));
            String s2 = String.valueOf(exp.charAt(2));
            Integer i0 = Integer.valueOf(s0);
            Integer i2 = Integer.valueOf(s2);
            String res = String.valueOf(i0 - i2);
            return res;
        }
        if (exp.length() == 3 && Character.isDigit(exp.charAt(0)) && Character.isDigit(exp.charAt(2)) && exp.charAt(1) == '*') {
            String s0 = String.valueOf(exp.charAt(0));
            String s2 = String.valueOf(exp.charAt(2));
            Integer i0 = Integer.valueOf(s0);
            Integer i2 = Integer.valueOf(s2);
            String res = String.valueOf(i0 * i2);
            return res;
        }
        if (exp.length() == 3 && Character.isDigit(exp.charAt(0)) && Character.isDigit(exp.charAt(2)) && exp.charAt(1) == '/') {
            String s0 = String.valueOf(exp.charAt(0));
            String s2 = String.valueOf(exp.charAt(2));
            Integer i0 = Integer.valueOf(s0);
            Integer i2 = Integer.valueOf(s2);
            String res = String.valueOf(i0 / i2);
            return res;
        }

        if (exp.length() == 4
                && Character.isDigit(exp.charAt(0))
                && Character.isDigit(exp.charAt(1))
                && exp.charAt(2) == '+'
                && Character.isDigit(exp.charAt(3))) {
            String s0 = String.valueOf(exp.charAt(0));
            String s1 = String.valueOf(exp.charAt(1));
            String add = s0 + s1;
            String s3 = String.valueOf(exp.charAt(3));
            Integer i0 = Integer.valueOf(add);
            Integer i3 = Integer.valueOf(s3);
            String res = String.valueOf(i0 + i3);
            return res;
        }

        if (exp.length() == 4 && Character.isDigit(exp.charAt(0)) && Character.isDigit(exp.charAt(1)) && exp.charAt(2) == '-' && Character.isDigit(exp.charAt(3))) {
            String s0 = String.valueOf(exp.charAt(0));
            String s1 = String.valueOf(exp.charAt(1));
            String add = s0 + s1;
            String s3 = String.valueOf(exp.charAt(3));
            Integer i0 = Integer.valueOf(add);
            Integer i3 = Integer.valueOf(s3);
            String res = String.valueOf(i0 - i3);
            return res;
        }
        if (exp.length() == 4 && Character.isDigit(exp.charAt(0)) && Character.isDigit(exp.charAt(1)) && exp.charAt(2) == '+' && Character.isDigit(exp.charAt(3))) {
            String s0 = String.valueOf(exp.charAt(0));
            String s1 = String.valueOf(exp.charAt(1));
            String add = s0 + s1;
            String s3 = String.valueOf(exp.charAt(3));
            Integer i0 = Integer.valueOf(add);
            Integer i3 = Integer.valueOf(s3);
            String res = String.valueOf(i0 + i3);
            return res;
        }

        if (exp.length() == 5 && Character.isDigit(exp.charAt(0)) && Character.isDigit(exp.charAt(1)) && exp.charAt(2) == '-' && Character.isDigit(exp.charAt(3)) && Character.isDigit(exp.charAt(4))) {
            String s0 = String.valueOf(exp.charAt(0));
            String s1 = String.valueOf(exp.charAt(1));
            String add = s0 + s1;
            String s3 = String.valueOf(exp.charAt(3));
            String s4 = String.valueOf(exp.charAt(4));
            String add2 = s3 + s4;
            Integer i0 = Integer.valueOf(add);
            Integer i1 = Integer.valueOf(add2);
            String res = String.valueOf(i0 - i1);
            return res;
        }
        if (exp.length() == 5 && Character.isDigit(exp.charAt(0)) && Character.isDigit(exp.charAt(1)) && exp.charAt(2) == '+' && Character.isDigit(exp.charAt(3)) && Character.isDigit(exp.charAt(4))) {
            String s0 = String.valueOf(exp.charAt(0));
            String s1 = String.valueOf(exp.charAt(1));
            String add = s0 + s1;
            String s3 = String.valueOf(exp.charAt(3));
            String s4 = String.valueOf(exp.charAt(4));
            String add2 = s3 + s4;
            Integer i0 = Integer.valueOf(add);
            Integer i1 = Integer.valueOf(add2);
            String res = String.valueOf(i0 + i1);
            return res;
        }
        if (exp.length() == 4 && Character.isDigit(exp.charAt(0)) && exp.charAt(1) == '-' && Character.isDigit(exp.charAt(2)) && Character.isDigit(exp.charAt(3))) {
            String s0 = String.valueOf(exp.charAt(0));
            String s2 = String.valueOf(exp.charAt(2));
            String s3 = String.valueOf(exp.charAt(3));
            String add = s2 + s3;
            Integer i0 = Integer.valueOf(s0);
            Integer i1 = Integer.valueOf(add);
            String res = String.valueOf(i0 - i1);
            return res;
        }
        if (exp.length() == 4 && Character.isDigit(exp.charAt(0)) && exp.charAt(1) == '+' && Character.isDigit(exp.charAt(2)) && Character.isDigit(exp.charAt(3))) {
            String s0 = String.valueOf(exp.charAt(0));
            String s2 = String.valueOf(exp.charAt(2));
            String s3 = String.valueOf(exp.charAt(3));
            String add = s2 + s3;
            Integer i0 = Integer.valueOf(s0);
            Integer i1 = Integer.valueOf(add);
            String res = String.valueOf(i0 + i1);
            return res;
        }


        return "0";
    }
}

