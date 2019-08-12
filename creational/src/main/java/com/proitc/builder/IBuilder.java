package com.proitc.builder;

import java.util.LinkedList;


// Builders common interface
interface IBuilder {

  void buildBody();

  void insertWheels();

  void addHeadlights();

  Product getVehicle();

}


