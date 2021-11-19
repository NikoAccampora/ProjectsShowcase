package com.nikoaccampora.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nikoaccampora.model.Character;
import com.nikoaccampora.repository.CharacterRepository;

@Service
public class CharacterService {
	@Autowired
	private CharacterRepository characterRepository;
	
	public Character insertOrUpdate(Character character) {
		return characterRepository.save(character);
	}
	
	public List<Character> findAll() {
		List<Character> characters = new ArrayList<>();
		characterRepository.findAll().forEach(characters::add);
		return characters;
	}
	
	public Optional<Character> findOne(int id) {
		return characterRepository.findById(id);
	}
	
	public void remove(int id) {
		characterRepository.deleteById(id);
	}
}
