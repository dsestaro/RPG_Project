package br.com.sestaro.characters.commons.attributes.values.specializations.intelligence;

import br.com.sestaro.characters.commons.attributes.values.specializations.generalizations.generalizations.AttributeAbstract;
import br.com.sestaro.characters.commons.attributes.values.specializations.intelligence.subdivision.Knowledge;
import br.com.sestaro.characters.commons.attributes.values.specializations.intelligence.subdivision.Logic;

/**
 * Attribute intelligence class.
 *  
 * @author davidson.sestaro
 */
public class Intelligence extends AttributeAbstract {
  private Knowledge knowledge;
  private Logic logic;
  private static final String NAME = "INT";
  
  /**
   * @param value1                                - Knowledge value
   * @param value2                                - Logic value 
   */
  public Intelligence(final int value1, final int value2) {
    super(new Knowledge(value1), new Logic(value2));
    
    this.knowledge = new Knowledge(value1);
    this.logic = new Logic(value2);
  }
  
  /**
   * Calculate the intelligence based on the mean of the 2 specializations.
   * 
   * @return                                      - Returns the intelligence value
   */
  public final int getIntelligence() {
    return (knowledge.getValue() + logic.getValue()) / 2;
  }

  /**
   * Add the param value to the existing knowledge.
   * 
   * @param value                                 - Increment value
   */
  public final void addKnowledge(final int value) {
    this.knowledge.setValue(knowledge.getValue() + value);
  }
  
  /**
   * Add the param value to the existing logic.
   * 
   * @param value                                 - Increment value
   */
  public final void addLogic(final int value) {
    this.logic.setValue(logic.getValue() + value);
  }

  /**
   * @return                                     - Knowledge value
   */
  public final int getKnowledge() {
    return knowledge.getValue();
  }

  /**
   * @return                                     - Logic value
   */
  public final int getLogic() {
    return logic.getValue();
  }
  
  /**
   * @return                                      - Return the specialization name
   */
  public static final String getName() {
    return NAME;
  }
}
