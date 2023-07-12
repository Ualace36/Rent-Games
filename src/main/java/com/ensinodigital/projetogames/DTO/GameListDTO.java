package com.ensinodigital.projetogames.DTO;

import org.springframework.beans.BeanUtils;

import com.ensinodigital.projetogames.entities.Game;
import com.ensinodigital.projetogames.entities.GameList;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

public class GameListDTO {
	
	private Long id;
	private String name;
	
	public GameListDTO() {
		
	}

	public GameListDTO(GameList entity) {
	
		id = entity.getId();
		name = entity.getName();
	}

	public Long getId() {
		return id;
	}

	public String getName() {
		return name;
	}	
	
	
	
}
