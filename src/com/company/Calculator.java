package com.company;

import com.company.tokens.Token;

import java.io.IOException;
import java.util.ArrayList;

/**
 * Created by User on 10.05.2016.
 */
public class Calculator {
    private ExpressionParser parser = new ExpressionParser();
    private ExpressionCalculator calculator = new ExpressionCalculator();

    public String calculate(String exp) throws IOException {
        ArrayList<Token> tokens = parser.parseExpression(exp);
        return calculator.calculate(tokens);
    }
}