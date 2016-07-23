package com.company.tokens;

/**
 * Created by User on 30.05.2016.
 */

public class Operator extends Token {
   private String operator;

   public Operator(String operator) {
      this.operator = operator;
   }

   public String getOperator() {
      return operator;
   }

   public void setOperator(String operator) {
      this.operator = operator;
   }

   @Override
   public boolean equals(Object o) {
      if (this == o) return true;
      if (!(o instanceof Operator)) return false;

      Operator operator1 = (Operator) o;

      return operator != null ? operator.equals(operator1.operator) : operator1.operator == null;

   }

   @Override
   public int hashCode() {
      return operator != null ? operator.hashCode() : 0;
   }

   @Override
   public String toString() {
      return "Operator{" +
              "operator='" + operator + '\'' +
              '}';
   }
}