package com.company;

import com.company.tokens.Token;

import java.util.ArrayList;
import java.util.List;


/**
 * Created by User on 30.05.2016.
 */
public class ExpressionCalculator {

    String calculate(List<Token> tokens) {
        ArrayList<String> list = new ArrayList<>();
        for (int i = 0; i < tokens.size(); i++) {
            list.add(String.valueOf(tokens.get(i)));
        }
        if (list.size() > 1) {
            for (int i = 1; i < list.size(); i += 2) {
                String operator = list.get(i);
                if (operator.equals('*')) {
                    String token1 = list.get(i - 1);
                    String token2 = list.get(i + 1);
                    String s = String.valueOf(token1);
                    String s1 = String.valueOf(token2);
                    String a = String.valueOf(Double.valueOf(s) / Double.valueOf(s1));
                    list.remove(i - 1);
                    list.remove(i);
                    list.remove(i + 1);
                    list.add(a);
                }
                if (operator.equals('/')) {
                    String token1 = list.get(i - 1);
                    String token2 = list.get(i + 1);
                    String s = String.valueOf(token1);
                    String s1 = String.valueOf(token2);
                    String a = String.valueOf(Double.valueOf(s) / Double.valueOf(s1));
                    list.remove(i - 1);
                    list.remove(i);
                    list.remove(i + 1);
                    list.add(a);
                }
            }
            for (int i = 1; i < list.size(); i += 2) {
                String operator = list.get(i);
                if (operator.equals('+')) {
                    String token1 = list.get(i - 1);
                    String token2 = list.get(i + 1);
                    String s = String.valueOf(token1);
                    String s1 = String.valueOf(token2);
                    String a = String.valueOf(Double.valueOf(s) + Double.valueOf(s1));
                    list.remove(i - 1);
                    list.remove(i);
                    list.remove(i + 1);
                    list.add(a);
                }
                if (operator.equals('-')) {
                    String token1 = list.get(i - 1);
                    String token2 = list.get(i + 1);
                    String s = String.valueOf(token1);
                    String s1 = String.valueOf(token2);
                    String a = String.valueOf(Double.valueOf(s) - Double.valueOf(s1));
                    list.remove(i - 1);
                    list.remove(i);
                    list.remove(i + 1);
                    list.add(a);
                }
            }

        }
        return list.get(0);
    }


}