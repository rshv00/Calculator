package com.company;

import org.junit.Before;
import org.junit.Test;
import sun.reflect.annotation.ExceptionProxy;

import static org.assertj.core.api.Assertions.assertThat;


/**
 * Created by User on 10.05.2016.
 */
public class CalculatorTest {
    Calculator calculator;

    @Before
    public void setUp() throws Exception {
        calculator = new Calculator();
    }

    @org.junit.Test
    public void sameSimpleInteger() throws Exception {
        assertThat(calculator.calculate("1")).isEqualTo("1.0");
    }

    @Test
    public void sameSimpleInteger2() throws Exception {
        assertThat(calculator.calculate("2")).isEqualTo("2.0");
    }

    @Test
    public void sameSimpleInteger5() throws Exception {
        assertThat(calculator.calculate("5")).isEqualTo("5.0");
    }

    @Test
    public void sameSimpleInteger7() throws Exception {
        assertThat(calculator.calculate("7")).isEqualTo("7.0");
    }

    @Test
    public void sameSimpleInteger4() throws Exception {
        assertThat(calculator.calculate("4")).isEqualTo("4.0");
    }

    @Test
    public void sameSimpleInteger0() throws Exception {
        assertThat(calculator.calculate("0")).isEqualTo("0.0");
    }

    @Test
    public void sameSimpleInteger3() throws Exception {
        assertThat(calculator.calculate("3")).isEqualTo("3.0");
    }

    @Test
    public void sameSimpleInteger6() throws Exception {
        assertThat(calculator.calculate("6")).isEqualTo("6.0");
    }

    @Test
    public void sameSimpleInteger8() throws Exception {
        assertThat(calculator.calculate("8")).isEqualTo("8.0");
    }

    @Test
    public void sameSimpleInteger9() throws Exception {
        assertThat(calculator.calculate("9")).isEqualTo("9.0");
    }

    @Test
    public void addTwoSimpleInteger() throws Exception {
        assertThat(calculator.calculate("2+3")).isEqualTo("5.0");
    }

    @Test
    public void addTwoSimpleInteger2() throws Exception {
        assertThat(calculator.calculate("4+5")).isEqualTo("9.0");
    }

    @Test
    public void addTwoSimpleInteger3() throws Exception {
        assertThat(calculator.calculate("9+5")).isEqualTo("14.0");
    }

    @Test
    public void minusTwoSimpleInteger() throws Exception {
        assertThat(calculator.calculate("9-5")).isEqualTo("4.0");
    }

    @Test
    public void multiplieTwoSimpleInteger() throws Exception {
        assertThat(calculator.calculate("9*5")).isEqualTo("45.0");
    }

    @Test
    public void divideTwoSimpleInteger() throws Exception {
        assertThat(calculator.calculate("4/2")).isEqualTo("2.0");
    }

    @Test
    public void divideTwoSimpleInteger2() throws Exception {
        assertThat(calculator.calculate("9/5")).isEqualTo("1.8");
    }

    @Test
    public void sameTwoDigitInteger1() throws Exception {
        assertThat(calculator.calculate("11")).isEqualTo("11.0");
    }

    @Test
    public void addTwoTwoDigitInteger() throws Exception {
        assertThat(calculator.calculate("19+5")).isEqualTo("24.0");
    }

    @Test
    public void addTwoTwoDigitInteger21() throws Exception {
        assertThat(calculator.calculate("5+19")).isEqualTo("24.0");
    }


    @Test
    public void addTwoTwoDigitInteger2() throws Exception {
        assertThat(calculator.calculate("19+15")).isEqualTo("34.0");
    }

    @Test
    public void minusTwoTwoDigitInteger() throws Exception {
        assertThat(calculator.calculate("19-15")).isEqualTo("4.0");
    }

    @Test
    public void minusTwoTwoDigitInteger2() throws Exception {
        assertThat(calculator.calculate("4-15")).isEqualTo("-11.0");
    }

    @Test
    public void minusTwoTwoDigitInteger221() throws Exception {
        assertThat(calculator.calculate("15-4")).isEqualTo("11.0");
    }

    @Test
    public void expression() throws Exception {
        assertThat(calculator.calculate("1+(2*(5+3)-4)+8")).isEqualTo("21.0");
    }
}