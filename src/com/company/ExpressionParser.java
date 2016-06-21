package com.company;

import com.company.tokens.Token;

import java.util.ArrayList;
import java.util.StringTokenizer;

/**
 * Created by User on 30.05.2016.
 */
public class ExpressionParser {
    ArrayList<Token> parseExpression(String exp) {
        String tokens2 = String.valueOf(exp);

        StringTokenizer st = new StringTokenizer(tokens2);
            while(st.hasMoreTokens())
            {
                Integer i0= Integer.parseInt(st.nextToken());

            }


            return null;
        }
    }