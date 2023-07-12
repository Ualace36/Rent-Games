package com.ensinodigital.projetogames.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ensinodigital.projetogames.DTO.GameListDTO;
import com.ensinodigital.projetogames.DTO.GameMinDTO;
import com.ensinodigital.projetogames.services.GameListService;
import com.ensinodigital.projetogames.services.GameServices;

@RestController
@RequestMapping(value = "/lists")
public class GameListController {
    @Autowired
	private GameListService gameListService;
    
    @Autowired
   	private GameServices gameService;
	
    @GetMapping
	public List<GameListDTO> findaAll(){
		List<GameListDTO> result = gameListService.findALL();
		return result;
		
	}
	 
    @GetMapping(value = "/{listId}/games")
   	public List<GameMinDTO> findListId(@PathVariable Long listId){
   		List<GameMinDTO> result = gameService.findByList(listId);
   		return result;
   		
   	}

    @GetMapping(value = "/{id}")
	public GameListDTO findById(@PathVariable Long id){
GameListDTO result = gameListService.findById(id);
		return result;
		
	}    
    
}
