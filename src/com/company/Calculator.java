package com.company;

import com.company.tokens.Token;

import java.io.IOException;

/**
 * Created by User on 10.05.2016.
 */
public class Calculator {
    private ExpressionParser parser = new ExpressionParser();
    private ExpressionCalculator calculator1 = new ExpressionCalculator();

    public String calculate(String exp) throws IOException {
        return calculator1.calculate(parser.parseExpression(exp));
    }
}