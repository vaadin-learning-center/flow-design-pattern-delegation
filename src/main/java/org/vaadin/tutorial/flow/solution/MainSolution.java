package org.vaadin.tutorial.flow.solution;


public class MainSolution {

  private MainSolution() {
  }

  public static void main(String[] args) {
    var inputComponent = new InputComponent();
    inputComponent.setText("Hello Text M03");
    inputComponent.click();
  }
}
