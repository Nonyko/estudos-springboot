package com.rpgcharacteres.Rpg.Characteres.repository.skill;
import org.springframework.data.jpa.repository.JpaRepository;

import com.rpgcharacteres.Rpg.Characteres.models.Skill;
public interface SkillRepository extends JpaRepository<Skill, Long>, SkillRepositoryCustom {
	Skill findById(long id);
}
