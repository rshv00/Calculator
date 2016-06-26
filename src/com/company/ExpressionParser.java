package com.company;

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
        StreamTokenizer tokenizer = new StreamTokenizer(new StringReader(exp));
        tokenizer.ordinaryChar('-');
        List<String> tokBuf = new ArrayList<>();
        while (tokenizer.nextToken() != StreamTokenizer.TT_EOF) {
            switch (tokenizer.ttype) {
                case StreamTokenizer.TT_NUMBER:
                    tokBuf.add(String.valueOf(tokenizer.nval));
                    break;
                case StreamTokenizer.TT_WORD:
                    tokBuf.add(tokenizer.sval);
                    break;
                default:
                    tokBuf.add(String.valueOf((char) tokenizer.ttype));
            }
        }
        int a = Integer.parseInt((tokBuf.get(0)));
        String b0 = tokBuf.get(1);
        char b = b0.charAt(0);
        int c = Integer.parseInt((tokBuf.get(2)));
        String res = String.valueOf(a)
        return
            }
}