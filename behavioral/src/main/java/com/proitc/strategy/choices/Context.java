package com.proitc.strategy.choices;

public class Context {

  private Choice myChoice;

  // Set a Strategy or algorithm in the Context
  public void setChoice(final Choice ic) {
    myChoice = ic;
  }

  public String showChoice(final String s1, final String s2) {
    return myChoice.myChoice(s1, s2);
  }
}
