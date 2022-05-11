package com.devsuperior.dsmovie.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Classe para armazenar os atributos e métodos do objeto User
 * @author Kalleo Leandro dos Santos Leal 
 * @since 11/05/2022
 * @version 1.0
 */

@Entity
@Table(name = "tb_user")
public class User
{
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String email;
	
	public User() 
	{
		
	}

	public User(Long id, String email)
	{		
		this.id = id;
		this.email = email;
	}

	public Long getId() 
	{
		return id;
	}

	public void setId(Long id) 
	{
		this.id = id;
	}

	public String getEmail() 
	{
		return email;
	}

	public void setEmail(String email) 
	{
		this.email = email;
	}
	
	
	

}
