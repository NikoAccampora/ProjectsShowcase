package com.nikoaccampora.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nikoaccampora.model.Character;
import com.nikoaccampora.service.CharacterService;

@RestController
@RequestMapping("/API/characters")
public class CharacterController {
	@Autowired
	private CharacterService characterService;
	
	@PostMapping
	public Character insert(@RequestBody Character character) {
		try {
		return characterService.insertOrUpdate(character);
		}catch(Exception error) {
			return null;
		}
	}
	
	@PutMapping
	public Character update(@RequestBody Character character) {
		return characterService.insertOrUpdate(character);
	}
	
	@GetMapping
	public List<Character> findAll(){
		return characterService.findAll();
	}
	
	@GetMapping("/{id}")
	public Optional<Character> findOne(@PathVariable int id){
		return characterService.findOne(id);
	}
	
	@DeleteMapping("/{id}")
	  public void remove(@PathVariable int id){
		  characterService.remove(id);
	   }
}


