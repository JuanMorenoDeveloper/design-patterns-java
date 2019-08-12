package com.proitc.builder;

import static org.assertj.core.api.Assertions.assertThatThrownBy;
import static org.mockito.Mockito.spy;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

import org.junit.jupiter.api.Test;

public class DecoratorUnitTest {

  @Test
  public void givenZeroNumber_whenDoJobValidatorZero_thenThrowRuntimeException() {
    final Component component = new ConcreteComponent();
    final AbstractDecorator validatorZero = new ConcreteDecoratorValidatorZero();
    validatorZero.setTheComponent(component);

    assertThatThrownBy(() -> validatorZero.doJob(0)).isInstanceOf(RuntimeException.class)
      .hasMessage("Number can't be zero");
  }

  @Test
  public void givenPositiveNumber_whenDoJobValidatorPositive_thenThrowRuntimeException() {
    final Component component = new ConcreteComponent();
    final AbstractDecorator validatorPositive = new ConcreteDecoratorValidatorPositive();
    validatorPositive.setTheComponent(component);

    assertThatThrownBy(() -> validatorPositive.doJob(1)).isInstanceOf(RuntimeException.class)
      .hasMessage("Number can't be positive");
  }

  @Test
  public void givenNegativeNumber_whenDoJobValidatorPositive_thenCallDoJob() {
    final Component component = new ConcreteComponent();
    final Component spyComponent = spy(component);
    final AbstractDecorator validatorPositive = new ConcreteDecoratorValidatorPositive();
    validatorPositive.setTheComponent(spyComponent);
    final int number = -1;
    validatorPositive.doJob(number);

    verify(spyComponent, times(1)).doJob(number);
  }
}
