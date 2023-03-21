package br.upe.ppsw.jabberpoint.model;

import java.io.IOException;

import br.upe.ppsw.jabberpoint.view.DemoPresentation;

// É uma classe que só serve para obrigar as outras a fazerem isso.
// pode ser controller o model. fica a duvida
// pode ser transformada em interface.

public abstract class Accessor {

  public static final String DEMO_NAME = "Apresentação de Demonstração";
  public static final String DEFAULT_EXTENSION = ".xml";

  public static Accessor getDemoAccessor() {
    return new DemoPresentation();
  }

  public Accessor() {}

  abstract public void loadFile(Presentation presentation, String fileName) throws IOException;

  abstract public void saveFile(Presentation presentation, String fileName) throws IOException;

}
