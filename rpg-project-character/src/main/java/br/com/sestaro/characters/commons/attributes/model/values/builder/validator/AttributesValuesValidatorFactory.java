package br.com.sestaro.characters.commons.attributes.model.values.builder.validator;

import org.apache.commons.validator.Field;
import org.apache.commons.validator.Form;
import org.apache.commons.validator.FormSet;
import org.apache.commons.validator.Validator;
import org.apache.commons.validator.ValidatorAction;
import org.apache.commons.validator.ValidatorResources;

import br.com.sestaro.characters.commons.attributes.model.values.builder.AttributesValuesBuilder;

/**
 * Class to build new instances of the apache validator.
 * 
 * @author davidson.sestaro
 */
public final class AttributesValuesValidatorFactory {
  
  private static final String REQUIRED = "required";
  
  /**
   * Default constructor to prevent class instantiation.
   */
  private AttributesValuesValidatorFactory() {
    
  }
  
  /**
   * Class to creation a instance of the Apache Validator.
   * 
   * @param builder                                   - Instance of the class calling the builder
   * 
   * @return                                          - Apache validator
   */
  public static Validator buildValidator(final AttributesValuesBuilder builder) {
    Field strength = new Field();
    strength.setDepends(REQUIRED);
    strength.setProperty("strength");
    
    Field dexterity = new Field();
    dexterity.setDepends(REQUIRED);
    dexterity.setProperty("dexterity");
    
    Field constitution = new Field();
    constitution.setDepends(REQUIRED);
    constitution.setProperty("constitution");
    
    Field intelligence = new Field();
    intelligence.setDepends(REQUIRED);
    intelligence.setProperty("intelligence");
    
    Field wisdom = new Field();
    wisdom.setDepends(REQUIRED);
    wisdom.setProperty("wisdom");
    
    Field charisma = new Field();
    charisma.setDepends(REQUIRED);
    charisma.setProperty("charisma");
    
    Form form = new Form();
    form.addField(strength);
    form.addField(dexterity);
    form.addField(constitution);
    form.addField(intelligence);
    form.addField(wisdom);
    form.addField(charisma);
    form.setName("attributes");
    
    FormSet formSet = new FormSet();
    formSet.addForm(form);
    
    ValidatorAction action = new ValidatorAction();
    action.setName(REQUIRED);
    action.setClassname("br.com.sestaro.characters.commons.attributes.values.builder.validator.AttributesValuesValidator");
    action.setMethod("validateRequired");
    action.setMethodParams("java.lang.Object, org.apache.commons.validator.Field");
    
    ValidatorResources resources = new ValidatorResources();
    resources.addFormSet(formSet);
    resources.addValidatorAction(action);
    
    Validator validator = new Validator(resources, "attributes");
    validator.setParameter(Validator.BEAN_PARAM, builder);
    
    return validator;
  }
}
