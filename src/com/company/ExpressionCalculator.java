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
        if (tokens.size() == 5 && ((Operator) tokens.get(1)).getOperator().equals("+")
                && ((Operator) tokens.get(3)).getOperator().equals("+")) {

            return Double.toString(((DoubleValue) tokens.get(0)).getValue()
                    + ((DoubleValue) tokens.get(2)).getValue()
                    + ((DoubleValue) tokens.get(4)).getValue());
        }
        if (tokens.size() == 7 && ((Operator) tokens.get(1)).getOperator().equals("+")
                && ((Operator) tokens.get(3)).getOperator().equals("+")
                && ((Operator) tokens.get(5)).getOperator().equals("+")) {

            return Double.toString(((DoubleValue) tokens.get(0)).getValue()
                    + ((DoubleValue) tokens.get(2)).getValue()
                    + ((DoubleValue) tokens.get(4)).getValue()
                    + ((DoubleValue) tokens.get(6)).getValue());
        }
        if (tokens.size() == 9 && ((Operator) tokens.get(1)).getOperator().equals("+")
                && ((Operator) tokens.get(3)).getOperator().equals("+")
                && ((Operator) tokens.get(5)).getOperator().equals("+")
                && ((Operator) tokens.get(7)).getOperator().equals("+")) {

            return Double.toString(((DoubleValue) tokens.get(0)).getValue()
                    + ((DoubleValue) tokens.get(2)).getValue()
                    + ((DoubleValue) tokens.get(4)).getValue()
                    + ((DoubleValue) tokens.get(6)).getValue()
                    + ((DoubleValue) tokens.get(8)).getValue());
        }
        for (int i =0;i<tokens.size();i++){

        }
        return null;
    }


}