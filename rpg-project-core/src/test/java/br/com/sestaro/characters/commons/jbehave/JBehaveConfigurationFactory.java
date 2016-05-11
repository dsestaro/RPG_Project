package br.com.sestaro.characters.commons.jbehave;

import org.jbehave.core.configuration.Configuration;
import org.jbehave.core.configuration.MostUsefulConfiguration;

public class JBehaveConfigurationFactory {
  
  public static final Configuration getConfiguration() {
    return new MostUsefulConfiguration();
  }
}
