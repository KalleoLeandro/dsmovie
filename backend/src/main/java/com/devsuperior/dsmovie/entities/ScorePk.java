/**
 * 
 */
package com.devsuperior.dsmovie.entities;

import java.io.Serializable;

import javax.persistence.Embeddable;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

/**
 * Classe para armazenar os atributos e métodos do objeto ScorePk
 * @author Kalleo Leandro dos Santos Leal 
 * @since 11/05/2022
 * @version 1.0
 */

@Embeddable
public class ScorePk implements Serializable
{
	private static final long serialVersionUID = 1L;

	@ManyToOne
	@JoinColumn(name = "movie_id")
	private Movie movie;
	
	@ManyToOne
	@JoinColumn(name = "user_id")	
	private User user;
	
	public ScorePk()
	{
		
	}

	public Movie getMovie() 
	{
		return movie;
	}

	public void setMovie(Movie movie)
	{
		this.movie = movie;
	}

	public User getUser() 
	{
		return user;
	}

	public void setUser(User user) 
	{
		this.user = user;
	}	
	
}
