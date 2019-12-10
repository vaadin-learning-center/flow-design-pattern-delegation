package org.vaadin.tutorial.flow.m03;


public class MainM03 {


  private MainM03() {
  }

  public static void main(String[] args) {
    var inputComponent = new InputComponent();
    inputComponent.setText("Hello Text M03");
    inputComponent.click();
  }
}
