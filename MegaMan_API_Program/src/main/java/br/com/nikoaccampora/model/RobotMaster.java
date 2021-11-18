package br.com.nikoaccampora.model;

public class RobotMaster {
	
	public Character character;
	public String serialNumber;
	public Character creator;
	public Weapon weapon;
	public Weapon weakness;
	
public RobotMaster(Character character, String serialNumber, Character creator, Weapon weapon, Weapon weakness) {
		
	    this.character = character;
	    this.serialNumber = serialNumber;
		this.creator = creator;
		this.weapon = weapon;
		this.weakness = weakness;
	}

}
