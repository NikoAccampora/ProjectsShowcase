package br.com.nikoaccampora.model;

public class Weapon {
	
	public String name;
	public String user;
	public Element element;
	
	public Weapon(String name, String user, Element element) {
		this.name = name;
		this.user = user;
		this.element = element;
	}
	
	public enum Element {Buster,Fire,Ice,Water,Electric,Earth,Energy,Metal,Explosive,Temporal,Other}
}
