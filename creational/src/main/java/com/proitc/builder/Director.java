package com.proitc.builder;

// "Director"
class Director {

  IBuilder myBuilder;

  // A series of steps -for the production
  public void Construct(IBuilder builder) {
    myBuilder = builder;
    myBuilder.buildBody();
    myBuilder.insertWheels();
    myBuilder.addHeadlights();
  }
}
