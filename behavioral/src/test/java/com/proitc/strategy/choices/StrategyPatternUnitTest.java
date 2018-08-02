package com.proitc.strategy.choices;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

public class StrategyPatternUnitTest {

  @Test
  public void givenFirstChoice_whenApplyStrategy_thenAddNumbers() {
    final Context context = new Context();
    context.setChoice(new FirstChoice());

    assertThat(context.showChoice("10", "20")).isEqualTo("30");
  }

  @Test
  public void givenSecondChoice_whenApplyStrategy_thenConcatStrings() {
    final Context context = new Context();
    context.setChoice(new SecondChoice());

    assertThat(context.showChoice("10", "20")).isEqualTo("1020");
  }
}
