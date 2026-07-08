package com.example;

public class SentenceShouldEndWithAPeriod implements Expression {

  private final FirstLetterShouldBeUppercase firstLetterShouldBeUppercase = new FirstLetterShouldBeUppercase();

  @Override
  public String interpret(String context) {
    if (context.endsWith("."))
      return context;

    return this.firstLetterShouldBeUppercase.interpret(context.concat("."));
  }

}
