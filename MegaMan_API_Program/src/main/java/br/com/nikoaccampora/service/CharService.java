package br.com.nikoaccampora.service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import br.com.nikoaccampora.model.Character;
import br.com.nikoaccampora.model.Character.Type;
import br.com.nikoaccampora.model.Game;
import br.com.nikoaccampora.service.GameService;

@Service
public class CharService {
	    private List<Character> CharacterList = new ArrayList<Character>();
		
	    
	    
	    CharService(){
	    	CharacterList.add(
	    	         new Character("Mega Man",Type.Robot,new Game("Mega Man",LocalDate.of(1987,12,17)))		
	    	);
	    	CharacterList.add(
	   	         	 new Character("Dr. Light",Type.Human,new Game("Mega Man",LocalDate.of(1987,12,17)))			
	    	);
	    	CharacterList.add(
	   	         	 new Character("Roll",Type.Robot,new Game("Mega Man",LocalDate.of(1987,12,17)))			
	    	);
	    }
	    
	 public List<Character> findAll(){
		 return this.CharacterList;
	 }
	 
	 public Character findOne(String name) {
		 for(Character character : CharacterList) {
	    	   if(character.name.equalsIgnoreCase(name)) {
	    		   return character;
	    	   }
	       }
	    return null;
	 }
	 
	 public Map<String, String> insert(Character character){
		 Map<String, String> result = new HashMap<String, String>();
		  boolean isSuccess = CharacterList.add(character);
		  if(isSuccess) {
			  result.put("result", "Character added successfully!");
		  }else {
			  result.put("result", "ERROR!!! Could not be added!");
		  }
		  return result;	
	 }	 
	 
	 public Map<String,String> edit(Character character){
		  Map<String,String> result = new HashMap<String, String>();
		  
		  for(Character element : CharacterList) {
	   	   if(element.name.equalsIgnoreCase(character.name)) {
	   		   int index = CharacterList.indexOf(element);
	   		   CharacterList.set(index, character);
	   		   result.put("result", "Edit successful!");
	   		   return result;
	   	  }   
	   	}
		  result.put("result", "ERROR!!! Could not edit!");
		  return result;

	 }
	 
	 public Map<String,String> remove(String name){
		  Map<String,String> result = new HashMap<String, String>();
		  boolean isSuccess = CharacterList.removeIf(
				  (character)->character.name.equalsIgnoreCase(name)
		  );
		  if(isSuccess) {
			  result.put("result", "Character removed.");
		  } else {
			  result.put("result", "ERROR!!! Could not remove!");
		  }
		  return result;
	   }
}
