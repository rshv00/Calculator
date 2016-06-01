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
}