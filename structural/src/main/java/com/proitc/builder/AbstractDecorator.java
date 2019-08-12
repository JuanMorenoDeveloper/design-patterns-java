package com.proitc.builder;

abstract class AbstractDecorator extends Component {

  protected Component component;

  public void setTheComponent(final Component component) {
    this.component = component;
  }

  @Override
  public void doJob(int number) {
    if (component != null) {
      component.doJob(number);
    }
  }
}
