package com.ensinodigital.projetogames.repositeries;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ensinodigital.projetogames.entities.Game;

public interface GameRepository extends JpaRepository<Game, Long>{

}
