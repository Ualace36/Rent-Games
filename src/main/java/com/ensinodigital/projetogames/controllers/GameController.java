package com.ensinodigital.projetogames.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ensinodigital.projetogames.DTO.GameMinDTO;
import com.ensinodigital.projetogames.entities.Game;
import com.ensinodigital.projetogames.services.GameServices;

@RestController
@RequestMapping(value = "/games")
public class GameController {
    @Autowired
	private GameServices gameService;
	
    @GetMapping
	public List<GameMinDTO> findaAll(){
		List<GameMinDTO> result = gameService.findALL();
		return result;
		
	}
	
}
