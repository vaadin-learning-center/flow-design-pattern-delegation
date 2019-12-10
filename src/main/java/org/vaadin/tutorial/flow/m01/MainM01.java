package org.vaadin.tutorial.flow.m01;

import com.vaadin.flow.component.orderedlayout.FlexComponent;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import org.rapidpm.dependencies.core.logger.HasLogger;

public class MainM01 implements HasLogger {

  private MainM01() {
  }

  public static void main(String[] args) {
    var inputComponent = new InputComponent();
    inputComponent.setText("Hello Text M01");
    inputComponent.click();

    //layout specific things
    inputComponent.setDefaultVerticalComponentAlignment(FlexComponent.Alignment.CENTER);
    final HorizontalLayout layout = new InputComponent();
  }
}
