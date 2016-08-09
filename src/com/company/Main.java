package com.company;

import javax.script.ScriptException;
import javax.swing.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.InvocationTargetException;

public class Main {

    public static void main(String[] args) throws CalculatorException, IOException {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new  WindowMode();
            }
        });
    }
}
