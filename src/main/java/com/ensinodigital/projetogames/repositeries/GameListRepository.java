package com.ensinodigital.projetogames.repositeries;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ensinodigital.projetogames.entities.GameList;

public interface GameListRepository extends JpaRepository<GameList, Long>{

}
