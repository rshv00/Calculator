package com.company;

import com.company.tokens.DoubleValue;
import com.company.tokens.Operator;
import com.company.tokens.Token;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;


/**
 * Created by User on 30.05.2016.
 */
public class ExpressionCalculator {

    String calculate(List<Token> tokens) {
        ArrayList<Token> list = new ArrayList<>(tokens);

        while (list.size() > 1) {

            for (int i = 0; i < list.size(); i += 2) {
                Token token = list.get(i);
                if (token instanceof Operator && ((Operator) token).getOperator().equals("(")) {
                    testAddingToExpressionInBracketsToArrayList(list, i);
                }

            }

            boolean foundHighPriorityOperator = false;
            for (int i = 1; i < list.size(); i += 2) {
                String operator = ((Operator) list.get(i)).getOperator();
                if (operator.equals("*") || operator.equals("/")) {
                    double v1 = ((DoubleValue) list.get(i - 1)).getValue();
                    double v2 = ((DoubleValue) list.get(i + 1)).getValue();
                    double val;
                    if (operator.equals("*")) {
                        val = v1 * v2;
                    } else {
                        val = v1 / v2;
                    }
                    list.remove(i - 1);
                    list.remove(i);
                    list.remove(i - 1);
                    list.add(i - 1, new DoubleValue(val));
                    foundHighPriorityOperator = true;
                    break;
                }
            }
            if (foundHighPriorityOperator) {
                continue;
            }
            for (int i = 1; i < list.size(); i += 2) {
                String operator = ((Operator) list.get(i)).getOperator();
                if (operator.equals("+") || operator.equals("-")) {
                    double v1 = ((DoubleValue) list.get(i - 1)).getValue();
                    double v2 = ((DoubleValue) list.get(i + 1)).getValue();
                    double val;
                    if (operator.equals("+")) {
                        val = v1 + v2;
                    } else {
                        val = v1 - v2;
                    }
                    list.remove(i - 1);
                    list.remove(i);
                    list.remove(i - 1);
                    list.add(i - 1, new DoubleValue(val));
                    break;
                }
            }
        }

        String res = String.valueOf(((DoubleValue) list.get(0)).getValue());

        return res;
    }

    private void testAddingToExpressionInBracketsToArrayList(ArrayList<Token> list, int positionOfOpenBracket) {
        ArrayList<Token> inBrackets = new ArrayList<>();
        int openBracketsCounter = 0;
        for (int i = positionOfOpenBracket + 1; i < list.size(); i++) {
            Token token = list.get(i);
            if (token instanceof Operator) {
                String operator = ((Operator) token).getOperator();
                if (operator.equals(")")) {
                    if (openBracketsCounter == 0) {
                        break;
                    } else {
                        openBracketsCounter--;
                    }
                } else if (operator.equals("(")) {
                    openBracketsCounter++;
                }
            }
            inBrackets.add(list.get(i));
        }
        System.out.println(inBrackets);
        System.out.println(calculate(inBrackets));

    }
}