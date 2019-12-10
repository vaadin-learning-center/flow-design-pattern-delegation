package org.vaadin.tutorial.flow.m03;

import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.textfield.TextField;
import org.rapidpm.dependencies.core.logger.HasLogger;

public class InputComponent
    extends Composite<HorizontalLayout>
    implements HasLogger {

  private Button    button    = new Button();
  private TextField textField = new TextField();

  public InputComponent() {
    super(new HorizontalLayout());
    getComponent().add(textField);
    getComponent().add(button);
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
