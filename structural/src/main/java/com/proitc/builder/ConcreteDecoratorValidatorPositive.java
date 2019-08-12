package com.proitc.builder;

class ConcreteDecoratorValidatorPositive extends AbstractDecorator {

  @Override
  public void doJob(int number) {
    if (number > 0) {
      throw new RuntimeException("Number can't be positive");
    }
    super.doJob(number);
  }
}
