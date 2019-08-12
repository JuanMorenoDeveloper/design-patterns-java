package com.proitc.builder;

class ConcreteDecoratorValidatorZero extends AbstractDecorator {

  @Override
  public void doJob(int number) {
    if (number == 0) {
      throw new RuntimeException("Number can't be zero");
    }
    super.doJob(number);
  }
}
