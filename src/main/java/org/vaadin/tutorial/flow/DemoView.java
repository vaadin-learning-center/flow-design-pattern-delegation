package org.vaadin.tutorial.flow;

import com.vaadin.flow.component.Composite;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.router.Route;
import org.rapidpm.dependencies.core.logger.HasLogger;
import org.vaadin.tutorial.flow.solution.InputComponent;

@Route("")
public class DemoView
    extends Composite<Div>
    implements HasLogger {

  public DemoView() {
    InputComponent inputComponent = new InputComponent();
    getContent().add(inputComponent);
  }
}
