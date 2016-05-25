package br.com.sestaro.characters.commons.attributes.facade;

import java.util.ArrayList;
import java.util.List;

import br.com.sestaro.characters.commons.attributes.values.specializations.charisma.Charisma;
import br.com.sestaro.characters.commons.attributes.values.specializations.constitution.Constitution;
import br.com.sestaro.characters.commons.attributes.values.specializations.dexterity.Dexterity;
import br.com.sestaro.characters.commons.attributes.values.specializations.intelligence.Intelligence;
import br.com.sestaro.characters.commons.attributes.values.specializations.strength.Strength;
import br.com.sestaro.characters.commons.attributes.values.specializations.wisdom.Wisdom;

/**
 * Class to encapsulate external requests to attributes values.
 * 
 * @author davidson.sestaro
 */
public final class AttributesFacade {

  /**
   * Default constructor to prevent class instantiation.
   */
  private AttributesFacade() {
    
  }
  
  /**
   * Get the list of attribute names.
   * 
   * @return                              - List with all attributes names
   */
  public static List<String> getAttributesNames() {
    List<String> attributeNames = new ArrayList<String>();

    attributeNames.add(Strength.getName());
    attributeNames.add(Dexterity.getName());
    attributeNames.add(Constitution.getName());
    attributeNames.add(Intelligence.getName());
    attributeNames.add(Wisdom.getName());
    attributeNames.add(Charisma.getName());
    
    return attributeNames;
  }
}
