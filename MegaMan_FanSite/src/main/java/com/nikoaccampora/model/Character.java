package com.nikoaccampora.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="characters")
public class Character {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
    @Column(length = 40,nullable=false, unique=true)
    private String name;
    @Column(length = 50,nullable=false)
    private String debut;
	
    
    public Character(int id, String name, String debut) {
		this.id = id;
		this.name = name;
		this.debut = debut;
	}
    
    public Character() {
	
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getDebut() {
		return debut;
	}


	public void setDebut(String debut) {
		this.debut = debut;
	}
    
    

}
