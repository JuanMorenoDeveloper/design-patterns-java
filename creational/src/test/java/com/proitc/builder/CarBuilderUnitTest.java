package com.proitc.builder;

import org.assertj.core.api.SoftAssertions;
import org.junit.jupiter.api.Test;

public class CarBuilderUnitTest {

  @Test
  public void whenBuild_thenGetCarWithProperties() {
    CarBuilder builder = new CarBuilder();
    String body = "Car Body";
    boolean hasHeadLights = true;
    int numberWheels = 4;

    Car car = builder.setBody(body).setHasHeadLigths(hasHeadLights).setWheels(numberWheels)
        .createCar();

    SoftAssertions.assertSoftly(softly -> {
      softly.assertThat(car.getBody()).isEqualTo(body);
      softly.assertThat(car.getWheels()).isEqualTo(numberWheels);
      softly.assertThat(car.isHasHeadLigths()).isEqualTo(hasHeadLights);
    });
  }
}
