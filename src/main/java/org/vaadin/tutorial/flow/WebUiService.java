package org.vaadin.tutorial.flow;

import org.apache.commons.cli.ParseException;
import org.rapidpm.vaadin.nano.CoreUIServiceJava;

public class WebUiService {

  private WebUiService() {
  }

  public static void main(String[] args) throws ParseException {
    System.setProperty(CoreUIServiceJava.CORE_UI_BASE_PKG, "org.vaadin");
    final CoreUIServiceJava uiServiceJava = new CoreUIServiceJava().executeCLI(args);
    uiServiceJava.startup();



  }


}
