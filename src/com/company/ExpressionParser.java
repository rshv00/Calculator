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
    ArrayList<Token> parseExpression(String exp) throws IOException {
        ArrayList<Token> tokens = new ArrayList<>();
        StreamTokenizer tokenizer = new StreamTokenizer(new StringReader(exp));
        tokenizer.ordinaryChar('/');
        tokenizer.commentChar('#');
        while (tokenizer.nextToken() != StreamTokenizer.TT_EOF) {
            if (tokenizer.ttype == StreamTokenizer.TT_WORD) {
                tokens.add(new Operator(tokenizer.sval));
            } else if (tokenizer.ttype==StreamTokenizer.TT_NUMBER){
                tokens.add(new DoubleValue(tokenizer.nval));
            }
            else if (tokenizer.ttype == StreamTokenizer.TT_EOL) {
                System.out.println();
            } else
                tokens.add(new Operator(String.valueOf((char) tokenizer.ttype)));
        }
        return tokens;
    }
}