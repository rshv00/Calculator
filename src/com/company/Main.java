package com.company;

import javax.script.ScriptException;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException, ScriptException, IndexOutOfBoundsException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String expression = reader.readLine();
        Calculator calculator = new Calculator();
        String result = calculator.calculate(expression);
        System.out.println(result);
     }
}
