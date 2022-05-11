package com.devsuperior.dsmovie.entities;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Classe para armazenar os atributos e métodos do objeto Score
 * @author Kalleo Leandro dos Santos Leal 
 * @since 11/05/2022
 * @version 1.0
 */

@Entity
@Table(name = "tb_score")
public class Score 
{
	@EmbeddedId()	
	private ScorePk id = new ScorePk();
	
	private Double value;
	
	public Score()
	{
		
	}
	
	public void setMovie(Movie movie)
	{
		id.setMovie(movie);
	}
	
	public void setUser(User user)
	{
		id.setUser(user);
	}

	public ScorePk getId() 
	{
		return id;
	}

	public void setId(ScorePk id)
	{
		this.id = id;
	}

	public Double getValue()
	{
		return value;
	}

	public void setValue(Double value) 
	{
		this.value = value;
	}
	
	
}
