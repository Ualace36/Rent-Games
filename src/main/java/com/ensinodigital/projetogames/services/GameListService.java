package com.ensinodigital.projetogames.services;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ensinodigital.projetogames.DTO.GameDTO;
import com.ensinodigital.projetogames.DTO.GameListDTO;
import com.ensinodigital.projetogames.DTO.GameMinDTO;
import com.ensinodigital.projetogames.entities.Game;
import com.ensinodigital.projetogames.entities.GameList;
import com.ensinodigital.projetogames.repositeries.GameListRepository;



@Service
public class GameListService {
	
    @Autowired
    private GameListRepository gameListRepository;
    
    @Transactional(readOnly = true) 
	public  GameListDTO findById(Long id) {
    	GameList result = gameListRepository.findById(id).get();
		//TODO fazer um tratamento de exceção para id nulls 
    	GameListDTO dto = new GameListDTO(result);
		return dto;
    	
    }
    @Transactional(readOnly = true) 
	public List<GameListDTO> findALL(){
		List<GameList> result = gameListRepository.findAll();
		return result.stream().map(x -> 
		new GameListDTO(x)).toList();
	}
	
	
}