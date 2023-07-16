package com.ensinodigital.projetogames.DTO;

import com.ensinodigital.projetogames.entities.Game;
import com.ensinodigital.projetogames.projections.GameMinProjection;

public class GameMinDTO {
	
	private Long id;
	private String title;
	private Integer year;
	private String platforms;
	private String imgUrl;
	private String shortDescription;
	
	public GameMinDTO() {
		
	}

	public GameMinDTO(Game entity) {
		super();
		id = entity.getId();
		title = entity.getTitle();
		year = entity.getYear();
	platforms = entity.getPlatforms();
		imgUrl = entity.getImgUrl();
		shortDescription = entity.getShortDescription();
	}

	public GameMinDTO(GameMinProjection projection) {
		super();
		id = projection.getId();
		title = projection.getTitle();
		year = projection.getGameYear();
		imgUrl = projection.getImgUrl();
		shortDescription = projection.getShortDescription();
	}
	
	public Long getId() {
		return id;
	}

	public String getTitle() {
		return title;
	}

	public Integer getYear() {
		return year;
	}

	public String getPlatforms() {
		return platforms;
	}

	public String getImgUrl() {
		return imgUrl;
	}

	public String getShortDescription() {
		return shortDescription;
	}
	
	
}
