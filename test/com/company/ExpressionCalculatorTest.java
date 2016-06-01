package com.company;

import com.company.tokens.IntValue;
import com.company.tokens.Operator;
import com.company.tokens.Token;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Created by User on 30.05.2016.
 */
public class ExpressionCalculatorTest {
   ExpressionCalculator expressionCalculator;

    @Before
    public void setUp() throws Exception {
        expressionCalculator = new ExpressionCalculator();
    }

    @Test
    public void simpleInteger() throws Exception {
        List<Token> tokens = Arrays.<Token>asList(new IntValue(1));
        assertThat(expressionCalculator.calculate(tokens)).isEqualTo("1");

    }
    @Test
    public void simpleInteger2() throws Exception {
        List<Token> tokens = Arrays.<Token>asList(new IntValue(2));
        assertThat(expressionCalculator.calculate(tokens)).isEqualTo("2");
    }
    @Test
    public void addTwoSimpleInteger() throws Exception {
        List<Token> tokens = Arrays.<Token>asList(new IntValue(2), new Operator("+"), new IntValue(2));
        assertThat(expressionCalculator.calculate(tokens)).isEqualTo("5");
    }

}