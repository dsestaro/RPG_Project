package br.com.sestaro.characters.commons.info.values;

import br.com.sestaro.characters.commons.info.enums.CharacterAlignNames;
import br.com.sestaro.characters.commons.info.enums.GenderNames;
import br.com.sestaro.characters.commons.info.utils.CharacterInformationUtils;

/**
 * Class that will group informations about the character.
 * 
 * @author davidson.sestaro
 *
 */
public class CharacterInformationsValues {

  private String name;
	private CharacterAlignNames alignment;
  private String deity;
	private String homeland;
	private GenderNames gender;
	private int age;
	private int height;
	private int weight;
	private String hairColor;
	private String eyesColor;
	
	/**
	 * Character Information default constructor.
	 * 
	 * @param nameParam                            - Character name
	 * @param alignmentParam                       - Character aligment
	 * @param deityParam                           - Deity name
	 * @param homelandParam                        - Homeland city
	 * @param genderParam                          - Gender type
	 * @param ageParam                             - Character age
	 * @param heightParam                          - Character height
	 * @param weightParam                          - Character weight
	 * @param hairColorParam                       - Character hair's color
	 * @param eyesColorParam                       - Character eye's color
	 */
	public CharacterInformationsValues(final String nameParam, final CharacterAlignNames alignmentParam, final String deityParam, 
	    final String homelandParam, final GenderNames genderParam, final int ageParam, final int heightParam, final int weightParam,
	    final String hairColorParam, final String eyesColorParam) {
		
	  this.setName(nameParam);
		this.setAlignment(alignmentParam);
		this.setDeity(deityParam);
		this.setHomeland(homelandParam);
		this.setGender(genderParam);
		this.setAge(ageParam);
		this.setHeight(heightParam);
		this.setWeight(weightParam);
		this.setHairColor(hairColorParam);
		this.setEyesColor(eyesColorParam);
	}

	/**
	 * @return                                     - Characters name
	 */
	public final String getName() {
		return name;
	}
	
	/**
	 * @param nameParam                            - Characters name
	 */
	public final void setName(final String nameParam) {
		CharacterInformationUtils.validateInformation(nameParam);
		this.name = nameParam;
	}
	
	/**
	 * @return                                     - Character aligment
	 */
	public final CharacterAlignNames getAlignment() {
		return alignment;
	}
	
	/**
	 * @param alignmentParam                       - Character aligment
	 */
	public final void setAlignment(final CharacterAlignNames alignmentParam) {
		this.alignment = alignmentParam;
	}
	
	/**
	 * @return                                     - Character's deity
	 */
	public final String getDeity() {
		return deity;
	}
	
	/**
	 * @param deityParam                           - Character's deity
	 */
	public final void setDeity(final String deityParam) {
		CharacterInformationUtils.validateInformation(deityParam);
		this.deity = deityParam;
	}
	
	/**
	 * @return                                     - Character's homeland
	 */
	public final String getHomeland() {
		return homeland;
	}
	
	/**
	 * @param homelandParam                        - Character's homeland
	 */
	public final void setHomeland(final String homelandParam) {
		CharacterInformationUtils.validateInformation(homelandParam);
		this.homeland = homelandParam;
	}
	
	/**
	 * @return                                     - Character gender
	 */
	public final GenderNames getGender() {
		return gender;
	}
	
	/**
	 * @param genderParam                          - Character gender
	 */
	public final void setGender(final GenderNames genderParam) {
		this.gender = genderParam;
	}
	
	/**
	 * @return                                     - Character age
	 */
	public final int getAge() {
		return age;
	}
	
	/**
	 * @param ageParam                             - Character age
	 */
	public final void setAge(final int ageParam) {
		this.age = ageParam;
	}
	
	/**
	 * @return                                     - Character height
	 */
	public final int getHeight() {
		return height;
	}
	
	/**
	 * @param heightParam                          - Character height
	 */
	public final void setHeight(final int heightParam) {
		this.height = heightParam;
	}
	
	/**
	 * @return                                     - Character weight
	 */
	public final int getWeight() {
		return weight;
	}
	
	/**
	 * @param weightParam                          - Character weight
	 */
	public final void setWeight(final int weightParam) {
		this.weight = weightParam;
	}
	
	/**
	 * @return                                     - Character hair color
	 */
	public final String getHairColor() {
		return hairColor;
	}
	
	/**
	 * @param hairColorParam                       - Character hair color
	 */
	public final void setHairColor(final String hairColorParam) {
		CharacterInformationUtils.validateInformation(hairColorParam);
		this.hairColor = hairColorParam;
	}
	
	/**
	 * @return                                     - Character eye color
	 */
	public final String getEyesColor() {
		return eyesColor;
	}
	
	/**
	 * @param eyesColorParam                       - Character eye color                          
	 */
	public final void setEyesColor(final String eyesColorParam) {
		CharacterInformationUtils.validateInformation(eyesColorParam);
		this.eyesColor = eyesColorParam;
	}
}
