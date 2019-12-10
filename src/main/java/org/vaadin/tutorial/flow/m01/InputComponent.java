package org.vaadin.tutorial.flow.m01;

import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.textfield.TextField;
import org.rapidpm.dependencies.core.logger.HasLogger;

public class InputComponent
    extends HorizontalLayout //Layout is abstract
    implements HasLogger {

  private Button    button    = new Button();
  private TextField textField = new TextField();

  public InputComponent() {
    add(textField);
    add(button);
  }

  public void click() {
    button.click();
  }

  public void setText(String text) {
    textField.setValue(text);
  }

  public String getText() {
    return textField.getValue();
  }


}
