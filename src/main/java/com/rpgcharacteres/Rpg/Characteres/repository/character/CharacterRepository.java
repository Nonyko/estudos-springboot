package com.rpgcharacteres.Rpg.Characteres.repository.character;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import com.rpgcharacteres.Rpg.Characteres.models.Character;
import com.rpgcharacteres.Rpg.Characteres.models.CharacterSkill;
public interface CharacterRepository extends JpaRepository<Character, Long>, CharacterRepositoryCustom {
	Character findById(long id);

}



