package com.devsuperior.dsmovie.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.devsuperior.dsmovie.dto.MovieDTO;
import com.devsuperior.dsmovie.services.MovieService;

/**
 * Classe para armazenar os atributos e métodos do objeto MovieController
 * @author Kalleo Leandro dos Santos Leal
 * @since 11/05/2022
 * @version 1.0
 */

@RestController
@RequestMapping(value="/movies")
public class MovieController 
{
	@Autowired
	private MovieService service;
	
	@GetMapping
	public Page<MovieDTO> findAll(Pageable pageable)
	{
		return service.findAll(pageable);
	}
	
	@GetMapping(value="/{id}")
	public MovieDTO findById(@PathVariable Long id)
	{
		return service.findById(id);
	}
}
