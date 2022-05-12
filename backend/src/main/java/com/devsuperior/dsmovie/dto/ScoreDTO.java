/**
 * 
 */
package com.devsuperior.dsmovie.dto;

/**
 * Classe para armazenar os atributos e métodos do objeto ScoreDTO
 * @author Kalleo Leandro dos Santos Leal
 * @since 12/05/2022
 * @version 1.0
 */

public class ScoreDTO 
{
	private Long movieId;
	private String email;
	private Double score;
	
	public ScoreDTO() 
	{
		
	}

	public Long getMovieId()
	{
		return movieId;
	}

	public void setMovieId(Long movieId)
	{
		this.movieId = movieId;
	}

	public String getEmail() 
	{
		return email;
	}

	public void setEmail(String email) 
	{
		this.email = email;
	}

	public Double getScore()
	{
		return score;
	}

	public void setScore(Double score)
	{
		this.score = score;
	}	
	
}
