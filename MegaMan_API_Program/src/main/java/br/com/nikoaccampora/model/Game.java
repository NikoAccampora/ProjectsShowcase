package br.com.nikoaccampora.model;

import java.time.LocalDate;

import com.fasterxml.jackson.annotation.JsonFormat;

public class Game {
	
	public String title;
	@JsonFormat(pattern = "yyyy-MM-dd")
	public LocalDate releaseDate;
	
    public Game(String title, LocalDate releaseDate) {
		
		this.title = title;
		this.releaseDate = releaseDate;
	}

}
