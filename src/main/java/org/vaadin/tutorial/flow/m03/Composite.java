package org.vaadin.tutorial.flow.m03;


import com.vaadin.flow.component.Component;
import com.vaadin.flow.component.HasComponents;
import com.vaadin.flow.shared.Registration;

public class Composite<T extends Component & HasComponents>
    extends Component {

  private final T component;

  public Composite(T component) {this.component = component;}

  public T getComponent() {
    return (T) component;
  }

  public Registration addComponent(Component c) {
    component.add(c);
    return (Registration) () -> component.remove(c);
  }
}
