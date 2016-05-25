package br.com.sestaro.characters.commons.attributes.model.values;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CascadeType;

import br.com.sestaro.characters.commons.attributes.model.values.specializations.charisma.Charisma;
import br.com.sestaro.characters.commons.attributes.model.values.specializations.constitution.Constitution;
import br.com.sestaro.characters.commons.attributes.model.values.specializations.dexterity.Dexterity;
import br.com.sestaro.characters.commons.attributes.model.values.specializations.intelligence.Intelligence;
import br.com.sestaro.characters.commons.attributes.model.values.specializations.strength.Strength;
import br.com.sestaro.characters.commons.attributes.model.values.specializations.wisdom.Wisdom;

/**
 * Class that group all the attributes and give the methods to access their values.
 * 
 * @author davidson.sestaro
 */
@Entity
public class AttributesValues {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;
  
  @OneToOne(targetEntity = Strength.class)
  @Cascade(CascadeType.ALL)
	private Strength strength;
  
  @OneToOne(targetEntity = Dexterity.class)
  @Cascade(CascadeType.ALL)
	private Dexterity dexterity;
  
  @OneToOne(targetEntity = Constitution.class)
  @Cascade(CascadeType.ALL)
	private Constitution constitution;
  
  @OneToOne(targetEntity = Intelligence.class)
  @Cascade(CascadeType.ALL)
	private Intelligence intelligence;
  
  @OneToOne(targetEntity = Wisdom.class)
  @Cascade(CascadeType.ALL)
	private Wisdom wisdom;
  
  @OneToOne(targetEntity = Charisma.class)
  @Cascade(CascadeType.ALL)
	private Charisma charisma;
	
	/**
	 * @param value1                                         - Strength
	 * @param value2                                         - Dexterity
	 * @param value3                                         - Constitution
	 * @param value4                                         - Intelligence
	 * @param value5                                         - Wisdom
	 * @param value6                                         - Charisma
	 */
	public AttributesValues(final Strength value1, final Dexterity value2, final Constitution value3, 
	    final Intelligence value4, final Wisdom value5, final Charisma value6) {
		this.strength = value1;
		this.dexterity = value2;
		this.constitution = value3;
		this.intelligence = value4;
		this.wisdom = value5;
		this.charisma = value6;
	}
	
	/**
	 * @return                                               - Return the strength
	 */
	public final Strength getStrength() {
		return strength;
	}
	
	/**
   * @return                                               - Return the dexterity
   */
	public final Dexterity getDexterity() {
		return dexterity;
	}
	
	/**
   * @return                                               - Return the constitution
   */
	public final Constitution getConstitution() {
		return constitution;
	}
	
	/**
   * @return                                               - Return the intelligence
   */
	public final Intelligence getIntelligence() {
		return intelligence;
	}
	
	/**
   * @return                                               - Return the wisdom
   */
	public final Wisdom getWisdom() {
		return wisdom;
	}
	
	/**
   * @return                                               - Return the charisma
   */
	public final Charisma getCharisma() {
		return charisma;
	}
}
