package br.com.nikoaccampora.controller;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.nikoaccampora.model.Game;
import br.com.nikoaccampora.service.GameService;

@RestController
@RequestMapping("/game")
public class GameController    {
    
	@Autowired
	private GameService gameService;
	
	@GetMapping
	public List<Game> findAll(){
		return gameService.findAll();
	}
    
    @GetMapping("/{title}")
    public Game findOne(@PathVariable String title) {
       return gameService.findOne(title);
    }
  
  @PostMapping
  public Map<String, String> insert(@RequestBody Game game){
	 return gameService.insert(game);
    }
  
  @PutMapping
  public Map<String,String> edit(@RequestBody Game game){
	  return gameService.edit(game);
  }
  
  @DeleteMapping("/{title}")
  public Map<String,String> remove(@PathVariable String title){
	  return gameService.remove(title);
   }
}