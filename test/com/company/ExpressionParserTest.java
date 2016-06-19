package com.company;

import com.company.tokens.IntValue;
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
    public void parseSimpleInteger() throws Exception {
        assertThat(expressionParser.parseExpression("1")).hasSize(1).contains(new IntValue(1));
    }
    @Test
    public void parseSimpleInteger2() throws Exception {
        assertThat(expressionParser.parseExpression("2")).hasSize(1).contains(new IntValue(2));
    }
    @Test
    public void parseSimpleInteger3() throws Exception {
        assertThat(expressionParser.parseExpression("457")).hasSize(1).contains(new IntValue(457));
    }
    @Test
    public void parseAddTwoSimpleIntegers() throws Exception {
        assertThat(expressionParser.parseExpression("4+5")).hasSize(3).containsExactly(new IntValue(4), new Operator("+"), new IntValue(5));
    }
}