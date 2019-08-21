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
import com.rpgcharacteres.Rpg.Characteres.models.Skill;
import com.rpgcharacteres.Rpg.Characteres.repository.skill.SkillRepository;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping(value="/api")
@Api(value="API REST Personagens RPG - Skills")
@CrossOrigin(origins = "*")
public class SkillResource {
	
	@Autowired
	SkillRepository skillRepository;
	
	@GetMapping("/skill")
	@ApiOperation(value="Retorna uma lista de skills")
	public List<Skill> listSkills(){
		return skillRepository.findAll();
	}
	
	@GetMapping("/skill/{id}")
	@ApiOperation(value="Retorna uma skill única por id")
	public Skill listSkill(@PathVariable(value="id") long id){
		return skillRepository.findById(id);
	}
	
	@PostMapping("/skill")
	@ApiOperation(value="Cria uma nova skill")
	public Skill saveSkill(@RequestBody Skill skill){
		return skillRepository.save(skill);
	}
	
	@PutMapping("/skill")
	@ApiOperation(value="Atualiza uma skill existente a partir de seu json enviado")
	public Skill updateSkill(@RequestBody Skill skill){
		return skillRepository.save(skill);
	}
	
	@DeleteMapping("/skill/{id}")
	@ApiOperation(value="Deleta uma skill existente a partir de seu id")
	public void deleteSkill(@PathVariable(value="id") long id){
		Skill skill = skillRepository.findById(id);
		skillRepository.delete(skill);
	}
}
