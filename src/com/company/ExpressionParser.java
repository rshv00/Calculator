package com.company;

import com.company.tokens.IntValue;
import com.company.tokens.Token;

import java.util.ArrayList;

/**
 * Created by User on 30.05.2016.
 */
public class ExpressionParser {
    ArrayList<Token> parseExpression(String exp) {
        int v = Integer.valueOf(exp);

        ArrayList<Token> tokens = new ArrayList<>();
        tokens.add(new IntValue(v));
        return tokens;
    }
}