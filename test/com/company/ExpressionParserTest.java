package com.company;

import com.company.tokens.DoubleValue;
import com.company.tokens.Operator;
import org.junit.Before;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Created by roman on 19.06.16.
 */
public class ExpressionParserTest {
    ExpressionParser expressionParser;

    @Before
    public void setUp() throws Exception {
        expressionParser = new ExpressionParser();
    }

    @Test
    public void parseAddTwoSimpleIntegers() throws Exception {
        assertThat(expressionParser.parseExpression("4+5")).hasSize(3).containsExactly(new DoubleValue(4), new Operator("+"), new DoubleValue(5));
    }

    @Test
    public void parseSimpleInteger() throws Exception {
        assertThat(expressionParser.parseExpression("1")).hasSize(1).contains(new DoubleValue(1));
    }

    @Test
    public void parseSimpleInteger2() throws Exception {
        assertThat(expressionParser.parseExpression("2")).hasSize(1).contains(new DoubleValue(2));
    }

    @Test
    public void parseSimpleInteger3() throws Exception {
        assertThat(expressionParser.parseExpression("457")).hasSize(1).contains(new DoubleValue(457));
    }

    @Test
    public void parseAddTwoSimpleIntegers2() throws Exception {
        assertThat(expressionParser.parseExpression("2+3")).hasSize(3).containsExactly(new DoubleValue(2), new Operator("+"), new DoubleValue(3));
    }

    @Test
    public void parseAddTwoSimpleIntegers3() throws Exception {
        assertThat(expressionParser.parseExpression("9+5")).hasSize(3).containsExactly(new DoubleValue(9), new Operator("+"), new DoubleValue(5));
    }

    @Test
    public void parseMinusTwoSimpleIntegers() throws Exception {
        assertThat(expressionParser.parseExpression("9-5")).hasSize(3).containsExactly(new DoubleValue(9), new Operator("-"), new DoubleValue(5));
    }

    @Test
    public void parseMultipleTwoSimpleIntegers() throws Exception {
        assertThat(expressionParser.parseExpression("9*5")).hasSize(3).containsExactly(new DoubleValue(9), new Operator("*"), new DoubleValue(5));
    }

    @Test
    public void divideMultipleTwoSimpleIntegers() throws Exception {
        assertThat(expressionParser.parseExpression("4/2")).hasSize(3).containsExactly(new DoubleValue(4), new Operator("/"), new DoubleValue(2));
    }

    @Test
    public void divideMultipleTwoSimpleIntegers2() throws Exception {
        assertThat(expressionParser.parseExpression("9/5")).hasSize(3).containsExactly(new DoubleValue(9), new Operator("/"), new DoubleValue(5));
    }

    @Test
    public void parseAddTwoDigitIntegers() throws Exception {
        assertThat(expressionParser.parseExpression("12+3")).hasSize(3).containsExactly(new DoubleValue(12), new Operator("+"), new DoubleValue(3));
    }

    @Test
    public void parseAddThreeSimpleIntegers2() throws Exception {
        assertThat(expressionParser.parseExpression("2+3+4")).hasSize(5).containsExactly(new DoubleValue(2), new Operator("+"),
                new DoubleValue(3), new Operator("+"), new DoubleValue(4));
    }

    @Test
    public void parseComplexExpressionIntegers() throws Exception {
        assertThat(expressionParser.parseExpression("2+3+4-123")).hasSize(7).containsExactly(new DoubleValue(2), new Operator("+"),
                new DoubleValue(3), new Operator("+"), new DoubleValue(4), new Operator("-"), new DoubleValue(123));
    }

    @Test
    public void parseComplexExpressionIntegers2() throws Exception {
        assertThat(expressionParser.parseExpression("2+3+4-123/6*7")).hasSize(11).containsExactly(new DoubleValue(2), new Operator("+"),
                new DoubleValue(3), new Operator("+"), new DoubleValue(4), new Operator("-"), new DoubleValue(123), new Operator("/"), new DoubleValue(6),
                new Operator("*"), new DoubleValue(7));

    }

}