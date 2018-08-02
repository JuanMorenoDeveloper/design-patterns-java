package com.proitc.strategy.choices;

import java.util.logging.Logger;

public class FirstChoice implements Choice {

  private static final Logger log = Logger.getLogger(FirstChoice.class.getName());

  @Override
  public String myChoice(final String s1, final String s2) {
    log.info("You wanted to add the numbers.");
    int int1, int2, sum;
    int1 = Integer.parseInt(s1);
    int2 = Integer.parseInt(s2);
    sum = int1 + int2;
    log.info(" The result of the addition is:" + sum);
    log.info("***End of the strategy***");
    return String.valueOf(sum);
  }
}
