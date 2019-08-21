package com.rpgcharacteres.Rpg.Characteres.repository.character;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import com.rpgcharacteres.Rpg.Characteres.models.CharacterSkill;


public class CharacterRepositoryImpl implements CharacterRepositoryCustom  {
	 @PersistenceContext
	 EntityManager entityManager;
	     //@Override
	    /*public List<Produto> getProdutoNomeLike(String nomeproduto) {
	        Query query = entityManager.createNativeQuery("SELECT * FROM TB_PRODUTO as TBP " +
	                "WHERE TBP.nome LIKE ?", Produto.class);
	        query.setParameter(1, nomeproduto + "%");
	        return query.getResultList();
	    }*/
	
}
