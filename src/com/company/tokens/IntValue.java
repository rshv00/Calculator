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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof IntValue)) return false;

        IntValue intValue = (IntValue) o;

        return value == intValue.value;

    }

    @Override
    public int hashCode() {
        return value;
    }
}

