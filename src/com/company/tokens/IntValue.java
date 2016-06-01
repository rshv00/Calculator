package com.company.tokens;

/**
 * Created by User on 30.05.2016.
 */

   public class IntValue extends Token {
        private int value;

    public IntValue(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
}

