package br.com.nikoaccampora.model;

public class Character {
	
	public String name;
	public Type type;
	public Game gameDebut;
	
public Character(String name, Type type, Game gameDebut) {
		
		this.name = name;
		this.type = type;
		this.gameDebut = gameDebut;	
	}
public enum Type {Human, Robot}

}
