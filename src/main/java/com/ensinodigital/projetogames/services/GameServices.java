package com.ensinodigital.projetogames.services;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ensinodigital.projetogames.DTO.GameMinDTO;
import com.ensinodigital.projetogames.entities.Game;
import com.ensinodigital.projetogames.repositeries.GameRepository;

@Service
public class GameServices {
	
    @Autowired
    private GameRepository gameRepository;
    
	public List<GameMinDTO> findALL(){
		List<Game> result = gameRepository.findAll();
		return result.stream().map(x -> 
		new GameMinDTO(x)).toList();
	}
}