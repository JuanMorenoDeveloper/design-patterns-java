package com.proitc.builder;

import java.util.logging.Logger;

class ConcreteComponent extends Component {

  private static final Logger log = Logger.getLogger(ConcreteComponent.class.getName());

  @Override
  public void doJob(int number) {
    log.info(" I am from Concrete Component-I am closed for modification.");
  }
}
