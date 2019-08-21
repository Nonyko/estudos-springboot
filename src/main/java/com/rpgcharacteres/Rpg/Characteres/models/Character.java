package com.rpgcharacteres.Rpg.Characteres.models;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.rpgcharacteres.Rpg.Characteres.models.CharacterSkill;

@Entity
@Table(name="TB_CHARACTER")
public class Character implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long id;
	
	private String name;
	private String backgroung;
	private String pictureDiretory;
	private String race;
	private String characterClass;
	private String level;
	
	@OneToMany
	private List<CharacterSkill> characterskills;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBackgroung() {
		return backgroung;
	}

	public void setBackgroung(String backgroung) {
		this.backgroung = backgroung;
	}

	public String getPictureDiretory() {
		return pictureDiretory;
	}

	public void setPictureDiretory(String pictureDiretory) {
		this.pictureDiretory = pictureDiretory;
	}

	public String getRace() {
		return race;
	}

	public void setRace(String race) {
		this.race = race;
	}

	public String getCharacterClass() {
		return characterClass;
	}

	public void setCharacterClass(String characterClass) {
		this.characterClass = characterClass;
	}

	public String getLevel() {
		return level;
	}

	public void setLevel(String level) {
		this.level = level;
	}

	public List<CharacterSkill> getCharacterskills() {
		return characterskills;
	}

	public void setCharacterskills(List<CharacterSkill> characterskills) {
		this.characterskills = characterskills;
	}


	
	
}





