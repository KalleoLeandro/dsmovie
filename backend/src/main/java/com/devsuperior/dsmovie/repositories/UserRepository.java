package com.devsuperior.dsmovie.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devsuperior.dsmovie.entities.User;



/**
 * Classe para armazenar os atributos e métodos do objeto UserRepository
 * @author Kalleo Leandro dos Santos Leal
 * @since 12/05/2022
 * @version 1.0
 */

public interface UserRepository extends JpaRepository<User, Long>
{
	User findByEmail(String email);
}
