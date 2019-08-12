package com.proitc.builder;

public class CarBuilder {

  private String body;
  private int wheels;
  private boolean hasHeadLigths;

  public CarBuilder setBody(String body) {
    this.body = body;
    return this;
  }

  public CarBuilder setWheels(int wheels) {
    this.wheels = wheels;
    return this;
  }

  public CarBuilder setHasHeadLigths(boolean hasHeadLigths) {
    this.hasHeadLigths = hasHeadLigths;
    return this;
  }

  public Car createCar() {
    return new Car(body, wheels, hasHeadLigths);
  }
}
