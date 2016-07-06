package com.company;

import com.company.tokens.DoubleValue;
import com.company.tokens.Operator;
import com.company.tokens.Token;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import java.util.ArrayList;
import java.util.List;


/**
 * Created by User on 30.05.2016.
 */
public class ExpressionCalculator {

    ArrayList<Double> numbers = new ArrayList<>();
    ArrayList<String> operators = new ArrayList<>();

    String calculate(List<Token> tokens) {
        ScriptEngineManager scm = new ScriptEngineManager();
        ScriptEngine jsEngine = scm.getEngineByName("JavaScript");
        double v = ((DoubleValue) tokens.get(0)).getValue();
        if (tokens.size() == 1) {
            return Double.toString(v);
        }
        for (int i = 0; i < tokens.size(); i += 2) {
            numbers.add(((DoubleValue) tokens.get(i)).getValue());
        }
        for (int i = 1; i<tokens.size();i+=2){
            operators.add((((Operator) tokens.get(i)).getOperator()));
        }
        for (int i = 0;i<tokens.size();i+=3){
            Double e = numbers.get(i);
            String w1 = operators.get(i+1);
            Double e2 = numbers.get(i+2);
            char w = w1.charAt(0);

            Double res = (Double) jsEngine.eval(e+w+e2);
        }
        return Double.toString(res);

    }
}
