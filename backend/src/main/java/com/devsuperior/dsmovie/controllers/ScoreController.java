package com.devsuperior.dsmovie.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.devsuperior.dsmovie.dto.MovieDTO;
import com.devsuperior.dsmovie.dto.ScoreDTO;
import com.devsuperior.dsmovie.services.ScoreService;

/**
 * Classe para armazenar os atributos e métodos do objeto ScoreController
 * @author Kalleo Leandro dos Santos Leal
 * @since 12/05/2022
 * @version 1.0
 */

@RestController
@RequestMapping(value="/scores")
public class ScoreController 
{
	
	@Autowired
	private ScoreService service;
	
	
	@PutMapping
	public MovieDTO saveScore(@RequestBody ScoreDTO dto) 
	{
		MovieDTO movieDto = service.SaveScore(dto);
		
		
		return movieDto;
		
	}
}
