package com.company;

import com.company.tokens.IntValue;
import com.company.tokens.Operator;
import com.company.tokens.Token;

import java.util.List;


/**
 * Created by User on 30.05.2016.
 */
public class ExpressionCalculator {

    String calculate(List<Token> tokens) {
        if (tokens.size() == 1) {
            return Integer.toString(((IntValue) tokens.get(0)).getValue());
        }
        if (tokens.size() == 3 && ((Operator) tokens.get(1)).getOperator().equals("+")) {

            return Integer.toString(((IntValue) tokens.get(0)).getValue() + ((IntValue) tokens.get(2)).getValue());
        }
        if (tokens.size() == 3 && ((Operator) tokens.get(1)).getOperator().equals("-")) {

            return Integer.toString(((IntValue) tokens.get(0)).getValue() - ((IntValue) tokens.get(2)).getValue());
        }
        if (tokens.size() == 3 && ((Operator) tokens.get(1)).getOperator().equals("*")) {

            return Integer.toString(((IntValue) tokens.get(0)).getValue() * ((IntValue) tokens.get(2)).getValue());
        }
        if (tokens.size() == 3 && ((Operator) tokens.get(1)).getOperator().equals("/")) {

            return Integer.toString(((IntValue) tokens.get(0)).getValue() / ((IntValue) tokens.get(2)).getValue());
        }


        return null;
    }


}