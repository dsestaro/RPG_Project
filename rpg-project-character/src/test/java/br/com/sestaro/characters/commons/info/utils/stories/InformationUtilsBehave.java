package br.com.sestaro.characters.commons.info.utils.stories;

import java.util.Arrays;
import java.util.List;

import org.jbehave.core.configuration.Configuration;
import org.jbehave.core.junit.JUnitStories;
import org.jbehave.core.steps.InjectableStepsFactory;
import org.jbehave.core.steps.InstanceStepsFactory;
import org.junit.runner.RunWith;

import br.com.sestaro.characters.commons.info.utils.steps.InfoStringAttributesValidationSteps;
import br.com.sestaro.characters.commons.jbehave.JBehaveConfigurationFactory;
import de.codecentric.jbehave.junit.monitoring.JUnitReportingRunner;

/**
 * Class to test the behave of class Information Utils.
 * 
 * @author davidson.sestaro
 */
@RunWith(JUnitReportingRunner.class)
public class InformationUtilsBehave extends JUnitStories {

    /**
     * Path to the stories.
     */
    @Override
    protected final List<String> storyPaths() {
	return Arrays.asList("characters/commons/info/utils/InfoStringAttributesValidation.story");
    }

    /**
     * Instantiation of steps class.
     */
    @Override
    public final InjectableStepsFactory stepsFactory() {
	return new InstanceStepsFactory(configuration(), new InfoStringAttributesValidationSteps());
    }

    /**
     * Method to get the configuration from the factory.
     */
    @Override
    public final Configuration configuration() {
	return JBehaveConfigurationFactory.getConfiguration();
    }
}
