package com.company;

import com.company.tokens.DoubleValue;
import com.company.tokens.Operator;
import com.company.tokens.Token;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

/**
 * Created by User on 30.05.2016.
 */
public class ExpressionParser {
    ArrayList<Token> parseExpression(String exp) throws IOException, CalculatorException {
        if (exp.isEmpty()) {
            throw new CalculatorException("Empty expression.");
        }

        for (int i = 1;i<=exp.length();i++){
            if (!"1234567890-+/*()".contains(exp.substring(i-1,i))){
                throw new CalculatorException("Unsupported symbol.");
            }
        }
        ArrayList<Token> tokens = new ArrayList<>();

        StreamTokenizer tokenizer = new StreamTokenizer(new StringReader(exp));
        tokenizer.ordinaryChar('-');
        tokenizer.ordinaryChar('/');
        while (tokenizer.nextToken() != StreamTokenizer.TT_EOF) {
            if (tokenizer.ttype == StreamTokenizer.TT_WORD) {
                tokens.add(new Operator(tokenizer.sval));
            } else if (tokenizer.ttype == StreamTokenizer.TT_NUMBER) {
                tokens.add(new DoubleValue(tokenizer.nval));
            } else if (tokenizer.ttype == StreamTokenizer.TT_EOL) {
                System.out.println();
            } else
                tokens.add(new Operator(String.valueOf((char) tokenizer.ttype)));
        }
        if (tokens.size() == 0) {
            throw new CalculatorException("Empty expression.");
        }
        return tokens;

    }
}