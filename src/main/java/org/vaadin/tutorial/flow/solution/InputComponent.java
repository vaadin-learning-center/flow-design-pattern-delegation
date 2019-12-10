package org.vaadin.tutorial.flow.solution;

import com.vaadin.flow.component.Composite;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.textfield.TextField;
import org.rapidpm.dependencies.core.logger.HasLogger;


public final class InputComponent
    extends Composite<HorizontalLayout>
    implements HasLogger {

  private Button    button    = new Button();
  private TextField textField = new TextField();

  public InputComponent() {
    button.setText("clicke Me");
    textField.setPlaceholder("fill me");

    button.addClickListener(e -> logger().info("TextField was filled with .. " + textField.getValue()));

    getContent().add(textField);
    getContent().add(button);
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
