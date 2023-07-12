package com.ensinodigital.projetogames.services;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ensinodigital.projetogames.DTO.GameDTO;
import com.ensinodigital.projetogames.DTO.GameMinDTO;
import com.ensinodigital.projetogames.entities.Game;
import com.ensinodigital.projetogames.projections.GameMinProjection;
import com.ensinodigital.projetogames.repositeries.GameRepository;



@Service
public class GameServices {
	
    @Autowired
    private GameRepository gameRepository;
    
    @Transactional(readOnly = true) 
	public  GameDTO findById(Long id) {
    	Game result = gameRepository.findById(id).get();
		//TODO fazer um tratamento de exceção para id nulls 
    	GameDTO dto = new GameDTO(result);
		return dto;
    	
    }
    @Transactional(readOnly = true) 
	public List<GameMinDTO> findALL(){
		List<Game> result = gameRepository.findAll();
		return result.stream().map(x -> 
		new GameMinDTO(x)).toList();
	}
    
    @Transactional(readOnly = true) 
   	public List<GameMinDTO> findByList(Long listId){
   		List<GameMinProjection> result = gameRepository.searchByList(listId);
   		return result.stream().map(x -> 
   		new GameMinDTO(x)).toList();
   	}
	
	
}