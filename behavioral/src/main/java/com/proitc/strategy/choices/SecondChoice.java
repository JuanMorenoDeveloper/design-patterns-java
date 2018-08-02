package com.proitc.strategy.choices;

import java.util.logging.Logger;

public class SecondChoice implements Choice {

  private static final Logger log = Logger.getLogger(SecondChoice.class.getName());

  @Override
  public String myChoice(final String s1, final String s2) {
    log.info("You wanted to concatenate the numbers.");
    final StringBuffer result = new StringBuffer();
    result.append(s1)
      .append(s2);
    log.info(String.format(" The result of the addition is: %s", result.toString()));
    log.info("***End of the strategy***");
    return result.toString();
  }

}
