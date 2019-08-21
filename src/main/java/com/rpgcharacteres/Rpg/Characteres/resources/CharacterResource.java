package com.rpgcharacteres.Rpg.Characteres.resources;

import java.util.List;

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
import com.rpgcharacteres.Rpg.Characteres.repository.character.CharacterRepository;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import javassist.NotFoundException;


@RestController
@RequestMapping(value="/api")
@Api(value="API REST Personagens RPG - Characteres")
@CrossOrigin(origins = "*")
public class CharacterResource {

	@Autowired
	CharacterRepository characterRepository;
	
	@GetMapping("/character")
	@ApiOperation(value="Retorna uma lista de character")
	public List<Character> listCharacteres(){
		return characterRepository.findAll();
	}
	
	@GetMapping("/character/{id}")
	@ApiOperation(value="Retorna um personagens único por id")
	public Character listCharacterUnico(@PathVariable(value="id") long id){
		return characterRepository.findById(id);
	}
	
	@PostMapping("/character")
	@ApiOperation(value="Cria um novo character")
	public Character saveCharacter(@RequestBody Character character) {
		return characterRepository.save(character);
	}
	
	@PutMapping("/character")
	@ApiOperation(value="Atualiza um character existente a partir de seu json enviado")
	public Character updateCharacter(@RequestBody Character character) {
		return characterRepository.save(character);
	}
	
	@DeleteMapping("/character/{id}")
	@ApiOperation(value="Deleta um character existente a partir de seu id")
	public void deleteCharacter(@PathVariable(value="id") long id) {
		Character character = characterRepository.findById(id);
		characterRepository.delete(character);
	}
	
	
}
