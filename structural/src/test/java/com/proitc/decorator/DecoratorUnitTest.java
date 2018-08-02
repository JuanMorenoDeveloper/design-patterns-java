package com.proitc.decorator;

import static org.assertj.core.api.Assertions.assertThatThrownBy;

import org.junit.jupiter.api.Test;

public class DecoratorUnitTest {

  @Test
  public void givenZeroNumber_whenDoJobValidatorZero_thenThrowRuntimeException() {
    Component component = new ConcreteComponent();
    AbstractDecorator validatorZero = new ConcreteDecoratorValidatorZero();
    validatorZero.setTheComponent(component);

    assertThatThrownBy(() -> validatorZero.doJob(0)).isInstanceOf(RuntimeException.class)
      .hasMessage("Number can't be zero");
  }

  @Test
  public void givenPositiveNumber_whenDoJobValidatorPositive_thenThrowRuntimeException() {
    Component component = new ConcreteComponent();
    AbstractDecorator validatorPositive = new ConcreteDecoratorValidatorPositive();
    validatorPositive.setTheComponent(component);

    assertThatThrownBy(() -> validatorPositive.doJob(1)).isInstanceOf(RuntimeException.class)
      .hasMessage("Number can't be positive");
  }
}
