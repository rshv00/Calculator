package com.company;

import com.company.tokens.Token;

import javax.script.ScriptException;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;

/**
 * Created by User on 10.05.2016.
 */
public class Calculator {
    private ExpressionParser parser = new ExpressionParser();
    private ExpressionCalculator calculator = new ExpressionCalculator();

    public String calculate(String exp) throws IOException, ScriptException, InvocationTargetException {
        ArrayList<Token> tokens = parser.parseExpression(exp);
        return calculator.calculate(tokens);
    }
}