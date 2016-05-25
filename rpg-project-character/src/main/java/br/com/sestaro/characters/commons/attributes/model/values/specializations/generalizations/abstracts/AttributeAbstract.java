package br.com.sestaro.characters.commons.attributes.model.values.specializations.generalizations.abstracts;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.MappedSuperclass;

import org.hibernate.annotations.Any;
import org.hibernate.annotations.AnyMetaDef;
import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CascadeType;
import org.hibernate.annotations.MetaValue;

import br.com.sestaro.characters.commons.attributes.model.utils.AttributesUtils;
import br.com.sestaro.characters.commons.attributes.model.values.specializations.charisma.subdivision.Appearance;
import br.com.sestaro.characters.commons.attributes.model.values.specializations.charisma.subdivision.Charm;
import br.com.sestaro.characters.commons.attributes.model.values.specializations.constitution.subdivision.Resistance;
import br.com.sestaro.characters.commons.attributes.model.values.specializations.constitution.subdivision.Toughness;
import br.com.sestaro.characters.commons.attributes.model.values.specializations.dexterity.subdivision.Coordination;
import br.com.sestaro.characters.commons.attributes.model.values.specializations.dexterity.subdivision.Speed;
import br.com.sestaro.characters.commons.attributes.model.values.specializations.generalizations.interfaces.ISpecialization;
import br.com.sestaro.characters.commons.attributes.model.values.specializations.intelligence.subdivision.Knowledge;
import br.com.sestaro.characters.commons.attributes.model.values.specializations.strength.subdivision.Endurance;
import br.com.sestaro.characters.commons.attributes.model.values.specializations.strength.subdivision.PhysicalStrength;
import br.com.sestaro.characters.commons.attributes.model.values.specializations.wisdom.subdivision.Instinct;
import br.com.sestaro.characters.commons.attributes.model.values.specializations.wisdom.subdivision.Intuition;

/**
 * Class to define common attributes methods.
 *  
 * @author davidson.sestaro
 */
@MappedSuperclass
public abstract class AttributeAbstract {
  
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;
  
  @Any(metaColumn = @Column(name = "specialization1_type"))
  @AnyMetaDef(idType = "long", metaType = "string", metaValues = {
  @MetaValue(targetEntity = Appearance.class, value = "APPE"),
  @MetaValue(targetEntity = Charm.class, value = "CHAR"),
  @MetaValue(targetEntity = Resistance.class, value = "RESI"),
  @MetaValue(targetEntity = Toughness.class, value = "TOUG"),
  @MetaValue(targetEntity = Coordination.class, value = "COOR"),
  @MetaValue(targetEntity = Speed.class, value = "SPEE"),
  @MetaValue(targetEntity = Knowledge.class, value = "KNOW"),
  @MetaValue(targetEntity = Endurance.class, value = "ENDU"),
  @MetaValue(targetEntity = PhysicalStrength.class, value = "PHST"),
  @MetaValue(targetEntity = Instinct.class, value = "INST"),
  @MetaValue(targetEntity = Intuition.class, value = "INTU") })
  @JoinColumn(name = "SPEC1_ID")
  @Cascade(CascadeType.ALL)
  private ISpecialization specialization1;
  
  @Any(metaColumn = @Column(name = "specialization2_type"))
  @AnyMetaDef(idType = "long", metaType = "string", metaValues = {
  @MetaValue(targetEntity = Appearance.class, value = "APPE"),
  @MetaValue(targetEntity = Charm.class, value = "CHAR"),
  @MetaValue(targetEntity = Resistance.class, value = "RESI"),
  @MetaValue(targetEntity = Toughness.class, value = "TOUG"),
  @MetaValue(targetEntity = Coordination.class, value = "COOR"),
  @MetaValue(targetEntity = Speed.class, value = "SPEE"),
  @MetaValue(targetEntity = Knowledge.class, value = "KNOW"),
  @MetaValue(targetEntity = Endurance.class, value = "ENDU"),
  @MetaValue(targetEntity = PhysicalStrength.class, value = "PHST"),
  @MetaValue(targetEntity = Instinct.class, value = "INST"),
  @MetaValue(targetEntity = Intuition.class, value = "INTU") })
  @JoinColumn(name = "SPEC2_ID")
  @Cascade(CascadeType.ALL)
  private ISpecialization specialization2;
  
  /**
   * @param value1                                - First specialization value
   * @param value2                                - Second specialization value 
   */
  public AttributeAbstract(final ISpecialization value1, final ISpecialization value2) {
    AttributesUtils.initialValidations(value1, value2);
    
    this.specialization1 = value1;
    this.specialization2 = value2;
  }

  /**
   * Get the first specialization of a given attribute.
   * 
   * @return                                     - Specialization instance.
   */
  protected final ISpecialization getSpecialization1() {
    return specialization1;
  }

  /**
   * Get the second specialization of a given attribute.
   * 
   * @return                                     - Specialization instance.
   */
  protected final ISpecialization getSpecialization2() {
    return specialization2;
  }
  
  /**
   * Get the attribute value based on the mean of the two specializations.
   * 
   * @return                                     - Attribute value.
   */
  protected final int getAttributeValue() {
    return (this.getSpecialization1().getValue() + this.getSpecialization2().getValue()) / 2;
  }
  
  /**
   * Add the given value to the given specializations.
   * 
   * @param value1                                 - Specialization
   * @param value2                                - Value
   */
  protected final void addValueSpecialization(final ISpecialization value1, final int value2) {
    value1.setValue(value1.getValue() + value2);
  }
}