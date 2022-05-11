package com.devsuperior.dsmovie.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devsuperior.dsmovie.entities.Movie;

/**
 * Classe para armazenar os atributos e métodos do objeto MovieRepository
 * @author Kalleo Leandro dos Santos Leal
 * @since 11/05/2022
 * @version 1.0
 */

public interface MovieRepository extends JpaRepository<Movie, Long>
{
	
}
