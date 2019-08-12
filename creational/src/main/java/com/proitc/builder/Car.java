package com.proitc.builder;

class Car {

  private final String body;
  private final int wheels;
  private final boolean hasHeadLigths;

  Car(String body, int wheels, boolean hasHeadLigths) {
    this.body = body;
    this.wheels = wheels;
    this.hasHeadLigths = hasHeadLigths;
  }

  public String getBody() {
    return body;
  }

  public int getWheels() {
    return wheels;
  }

  public boolean isHasHeadLigths() {
    return hasHeadLigths;
  }
}
