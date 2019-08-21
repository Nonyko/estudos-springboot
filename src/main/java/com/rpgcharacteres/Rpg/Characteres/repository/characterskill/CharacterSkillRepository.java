
package com.rpgcharacteres.Rpg.Characteres.repository.characterskill;
import org.springframework.data.jpa.repository.JpaRepository;

import com.rpgcharacteres.Rpg.Characteres.models.CharacterSkill;
public interface CharacterSkillRepository extends JpaRepository<CharacterSkill, Long> {
	CharacterSkill findById(long id);
}
