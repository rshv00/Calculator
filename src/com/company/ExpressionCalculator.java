package com.company;

import com.company.tokens.DoubleValue;
import com.company.tokens.Operator;
import com.company.tokens.Token;

import java.util.List;


/**
 * Created by User on 30.05.2016.
 */
public class ExpressionCalculator {

    String calculate(List<Token> tokens) {
        if (tokens.size() == 1) {
            return Double.toString(((DoubleValue) tokens.get(0)).getValue());
        }
        if (tokens.size() == 3 && ((Operator) tokens.get(1)).getOperator().equals("+")) {

            return Double.toString(((DoubleValue) tokens.get(0)).getValue() + ((DoubleValue) tokens.get(2)).getValue());
        }
        if (tokens.size() == 3 && ((Operator) tokens.get(1)).getOperator().equals("-")) {

            return Double.toString(((DoubleValue) tokens.get(0)).getValue() - ((DoubleValue) tokens.get(2)).getValue());
        }
        if (tokens.size() == 3 && ((Operator) tokens.get(1)).getOperator().equals("*")) {

            return Double.toString(((DoubleValue) tokens.get(0)).getValue() * ((DoubleValue) tokens.get(2)).getValue());
        }
        if (tokens.size() == 3 && ((Operator) tokens.get(1)).getOperator().equals("/")) {

            return Double.toString(((DoubleValue) tokens.get(0)).getValue() / ((DoubleValue) tokens.get(2)).getValue());
        }


        return null;
    }


}