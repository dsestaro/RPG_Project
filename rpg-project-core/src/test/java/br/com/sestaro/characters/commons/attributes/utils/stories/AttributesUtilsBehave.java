package br.com.sestaro.characters.commons.attributes.utils.stories;

import java.util.Arrays;
import java.util.List;

import org.jbehave.core.configuration.Configuration;
import org.jbehave.core.junit.JUnitStories;
import org.jbehave.core.steps.InjectableStepsFactory;
import org.jbehave.core.steps.InstanceStepsFactory;
import org.junit.runner.RunWith;

import br.com.sestaro.characters.commons.attributes.utils.steps.AttributesUtilsSteps;
import br.com.sestaro.characters.commons.jbehave.JBehaveConfigurationFactory;
import de.codecentric.jbehave.junit.monitoring.JUnitReportingRunner;

@RunWith(JUnitReportingRunner.class)
public class AttributesUtilsBehave extends JUnitStories {

  public AttributesUtilsBehave() {
    super();
  }
  
  @Override
  protected List<String> storyPaths() {
    return Arrays.asList("characters/commons/attributes/utils/AttributeModifier.story");
  }

  @Override
  public InjectableStepsFactory stepsFactory() {
    return new InstanceStepsFactory(configuration(), new AttributesUtilsSteps());
  }
  
  @Override
  public Configuration configuration() {
    return JBehaveConfigurationFactory.getConfiguration();
  }
}
