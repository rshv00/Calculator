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

}