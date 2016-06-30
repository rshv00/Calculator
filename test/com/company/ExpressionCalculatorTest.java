package com.company;

import com.company.tokens.DoubleValue;
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
        List<Token> tokens = Arrays.<Token>asList(new DoubleValue(1));
        assertThat(expressionCalculator.calculate(tokens)).isEqualTo("1.0");

    }
    @Test
    public void simpleInteger2() throws Exception {
        List<Token> tokens = Arrays.<Token>asList(new DoubleValue(2));
        assertThat(expressionCalculator.calculate(tokens)).isEqualTo("2.0");
    }
    @Test
    public void addTwoSimpleInteger() throws Exception {
        List<Token> tokens = Arrays.<Token>asList(new DoubleValue(2), new Operator("+"), new DoubleValue(3));
        assertThat(expressionCalculator.calculate(tokens)).isEqualTo("5.0");
    }
    @Test
    public void addTwoSimpleInteger2() throws Exception {
        List<Token> tokens = Arrays.<Token>asList(new DoubleValue(4), new Operator("+"), new DoubleValue(5));
        assertThat(expressionCalculator.calculate(tokens)).isEqualTo("9.0");
    }
    @Test
    public void addTwoSimpleInteger3() throws Exception {
        List<Token> tokens = Arrays.<Token>asList(new DoubleValue(9), new Operator("+"), new DoubleValue(5));
        assertThat(expressionCalculator.calculate(tokens)).isEqualTo("14.0");
    }
    @Test
    public void minusTwoSimpleInteger() throws Exception {
        List<Token> tokens = Arrays.<Token>asList(new DoubleValue(9), new Operator("-"), new DoubleValue(5));
        assertThat(expressionCalculator.calculate(tokens)).isEqualTo("4.0");
    }
    @Test
    public void multiplyTwoSimpleInteger() throws Exception {
        List<Token> tokens = Arrays.<Token>asList(new DoubleValue(9), new Operator("*"), new DoubleValue(5));
        assertThat(expressionCalculator.calculate(tokens)).isEqualTo("45.0");
    }
    @Test
    public void divideTwoSimpleInteger() throws Exception {
        List<Token> tokens = Arrays.<Token>asList(new DoubleValue(4), new Operator("/"), new DoubleValue(2));
        assertThat(expressionCalculator.calculate(tokens)).isEqualTo("2.0");
    }
    @Test
    public void divideTwoSimpleInteger2() throws Exception {
        List<Token> tokens = Arrays.<Token>asList(new DoubleValue(9), new Operator("/"), new DoubleValue(5));
        assertThat(expressionCalculator.calculate(tokens)).isEqualTo("1.8");
    }
    @Test
    public void addTwoDigitInteger3() throws Exception {
        List<Token> tokens = Arrays.<Token>asList(new DoubleValue(91), new Operator("+"), new DoubleValue(5));
        assertThat(expressionCalculator.calculate(tokens)).isEqualTo("96.0");
    }

}