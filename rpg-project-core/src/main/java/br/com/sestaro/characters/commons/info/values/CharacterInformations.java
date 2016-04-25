package br.com.sestaro.characters.commons.info.values;

import br.com.sestaro.characters.commons.info.enums.CharacterAlignNames;
import br.com.sestaro.characters.commons.info.enums.GenderNames;
import br.com.sestaro.characters.commons.info.utils.CharacterInformationUtils;

public class CharacterInformations {
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
	
	public CharacterInformations(String name, CharacterAlignNames alignment, String deity, String homeland,
			GenderNames gender, int age, int height, int weight, String hairColor, String eyesColor) {
		this.setName(name);;
		this.setAlignment(alignment);
		this.setDeity(deity);
		this.setHomeland(homeland);
		this.setGender(gender);
		this.setAge(age);
		this.setHeight(height);
		this.setWeight(weight);
		this.setHairColor(hairColor);
		this.eyesColor = eyesColor;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		CharacterInformationUtils.validateInformation(name);
		this.name = name;
	}
	public CharacterAlignNames getAlignment() {
		return alignment;
	}
	public void setAlignment(CharacterAlignNames alignment) {
		this.alignment = alignment;
	}
	public String getDeity() {
		return deity;
	}
	public void setDeity(String deity) {
		CharacterInformationUtils.validateInformation(deity);
		this.deity = deity;
	}
	public String getHomeland() {
		return homeland;
	}
	public void setHomeland(String homeland) {
		CharacterInformationUtils.validateInformation(homeland);
		this.homeland = homeland;
	}
	public GenderNames getGender() {
		return gender;
	}
	public void setGender(GenderNames gender) {
		this.gender = gender;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
	public String getHairColor() {
		return hairColor;
	}
	public void setHairColor(String hairColor) {
		CharacterInformationUtils.validateInformation(hairColor);
		this.hairColor = hairColor;
	}
	public String getEyesColor() {
		return eyesColor;
	}
	public void setEyesColor(String eyesColor) {
		CharacterInformationUtils.validateInformation(eyesColor);
		this.eyesColor = eyesColor;
	}
}
