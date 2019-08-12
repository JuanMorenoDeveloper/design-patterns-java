package com.proitc.builder;

import org.junit.jupiter.api.Test;

public class BuilderPatternUnitTest {

  @Test
  public void dunno() {
    System.out.println("***Builder Pattern Demo***\n");

    Director director = new Director();

    IBuilder carBuilder = new Car();
    IBuilder motorBuilder = new MotorCycle();

    // Making Car
    director.Construct(carBuilder);
    Product p1 = carBuilder.getVehicle();
    p1.show();

    //Making MotorCycle
    director.Construct(motorBuilder);
    Product p2 = motorBuilder.getVehicle();
    p2.show();
  }
}
