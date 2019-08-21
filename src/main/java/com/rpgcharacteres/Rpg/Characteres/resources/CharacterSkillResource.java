package com.rpgcharacteres.Rpg.Characteres.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rpgcharacteres.Rpg.Characteres.models.Character;
import com.rpgcharacteres.Rpg.Characteres.models.CharacterSkill;
import com.rpgcharacteres.Rpg.Characteres.models.Skill;
import com.rpgcharacteres.Rpg.Characteres.repository.character.CharacterRepository;
import com.rpgcharacteres.Rpg.Characteres.repository.characterskill.CharacterSkillRepository;
import com.rpgcharacteres.Rpg.Characteres.repository.skill.SkillRepository;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping(value="/api")
@Api(value="API REST Personagens RPG - CharacterSkill")
@CrossOrigin(origins = "*")
public class CharacterSkillResource {

	@Autowired
	CharacterSkillRepository characterSkillRepository;
	@Autowired
	CharacterRepository characterRepository;
	@Autowired
	SkillRepository skillRepository;
	
	@GetMapping("/characterskill/{id}")
	@ApiOperation(value="Retorna uma skill de personagens única por id")
	public CharacterSkill listCharacterSkillUnico(@PathVariable(value="id") long id){
		return characterSkillRepository.findById(id);
	}
	@PostMapping("/characterskill/character/{idCharacter}")
	@ApiOperation(value="Atrela uma skill a um character")
	public CharacterSkill saveCharacterSkill(@PathVariable(value="idCharacter") long idCharacter, @RequestBody CharacterSkill characterSkill) {
		CharacterSkill characterSkillSaved = characterSkillRepository.save(characterSkill);
		
		Character character = characterRepository.findById(idCharacter);
		character.getCharacterskills().add(characterSkillSaved);
		characterRepository.save(character);
		
		return characterSkillSaved;
	}
	@PutMapping("/characterskill")
	@ApiOperation(value="Atualiza uma characterskill existente a partir de seu json enviado")
	public CharacterSkill updateCharacterSkill(@RequestBody CharacterSkill characterSkill){
		return characterSkillRepository.save(characterSkill);
	}
	@DeleteMapping("/characterskill/{id}")
	@ApiOperation(value="Deleta uma characterskill existente a partir de seu id")
	public void deleteSkill(@PathVariable(value="id") long id){
		CharacterSkill characterskill = characterSkillRepository.findById(id);
		characterSkillRepository.delete(characterskill);
	}
}
