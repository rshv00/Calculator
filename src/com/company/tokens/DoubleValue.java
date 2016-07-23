package com.company.tokens;

/**
 * Created by User on 30.05.2016.
 */

   public class DoubleValue extends Token {
        private double value;

    public DoubleValue(double value) {
        this.value = value;
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        DoubleValue that = (DoubleValue) o;

        return Double.compare(that.value, value) == 0;

    }

    @Override
    public int hashCode() {
        long temp = Double.doubleToLongBits(value);
        return (int) (temp ^ (temp >>> 32));
    }

    @Override
    public String toString() {
        return "DoubleValue{" +
                "value=" + value +
                '}';
    }
}

