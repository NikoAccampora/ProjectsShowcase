package com.nikoaccampora.repository;

import org.springframework.data.repository.CrudRepository;

import com.nikoaccampora.model.Character;

public interface CharacterRepository extends CrudRepository<Character, Integer> {

}
