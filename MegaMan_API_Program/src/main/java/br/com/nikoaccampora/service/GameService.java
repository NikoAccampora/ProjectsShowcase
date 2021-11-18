package br.com.nikoaccampora.service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import br.com.nikoaccampora.model.Game;

@Service
public class GameService {
	    private List<Game> GameList = new ArrayList<Game>();
		
	    
	    
	    GameService(){
			Game MM1;
			GameList.add(
	    	MM1 = new Game("Mega Man",LocalDate.of(1987,12,17))
	    	);
			GameList.add(
	          new Game("Mega Man 2",LocalDate.of(1988,12,24))
	    	);
	    }
	    
	 public List<Game> findAll(){
		 return this.GameList;
	 }
	 
	 public Game findOne(String title) {
		 for(Game game : GameList) {
	    	   if(game.title.equalsIgnoreCase(title)) {
	    		   return game;
	    	   }
	       }
	    return null;
	 }
	 
	 public Map<String, String> insert(Game game){
		 Map<String, String> result = new HashMap<String, String>();
		  boolean isSuccess = GameList.add(game);
		  if(isSuccess) {
			  result.put("result", "Game added successfully!");
		  }else {
			  result.put("result", "ERROR!!! Could not be added!");
		  }
		  return result;	
	 }	 
	 
	 public Map<String,String> edit(Game game){
		  Map<String,String> result = new HashMap<String, String>();
		  
		  for(Game element : GameList) {
	   	   if(element.title.equalsIgnoreCase(game.title)) {
	   		   int index = GameList.indexOf(element);
	   		   GameList.set(index, game);
	   		   result.put("result", "Edit successful!");
	   		   return result;
	   	  }   
	   	}
		  result.put("result", "ERROR!!! Could not edit!");
		  return result;

	 }
	 
	 public Map<String,String> remove(String title){
		  Map<String,String> result = new HashMap<String, String>();
		  boolean isSuccess = GameList.removeIf(
				  (game)->game.title.equalsIgnoreCase(title)
		  );
		  if(isSuccess) {
			  result.put("result", "Game removed.");
		  } else {
			  result.put("result", "ERROR!!! Could not remove!");
		  }
		  return result;
	   }
}
