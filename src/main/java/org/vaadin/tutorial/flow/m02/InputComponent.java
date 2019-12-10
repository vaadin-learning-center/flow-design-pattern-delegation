package org.vaadin.tutorial.flow.m02;

import com.vaadin.flow.component.Component;
import com.vaadin.flow.component.HasComponents;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.textfield.TextField;
import org.rapidpm.dependencies.core.logger.HasLogger;

public class InputComponent
    extends Component
    implements HasComponents, HasLogger {

  private Button    button    = new Button();
  private TextField textField = new TextField();

  public InputComponent() {
    var layout = new HorizontalLayout();
    layout.add(textField);
    layout.add(button);
    add(layout);
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

  // to deep into the framework for EndUser
  public void doFrameworkSpecificThings() {
    logger().info("doFrameworkSpecificThings - " + this.getClass().getSimpleName());
  }
}
