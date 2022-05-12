package com.devsuperior.dsmovie.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devsuperior.dsmovie.entities.Score;
import com.devsuperior.dsmovie.entities.ScorePk;



/**
 * Classe para armazenar os atributos e métodos do objeto ScoreRepository
 * @author Kalleo Leandro dos Santos Leal
 * @since 12/05/2022
 * @version 1.0
 */

public interface ScoreRepository extends JpaRepository<Score, ScorePk>
{
	
}
