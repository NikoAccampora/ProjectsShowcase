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

import br.com.nikoaccampora.model.Character;
import br.com.nikoaccampora.service.CharService;

@RestController
@RequestMapping("/character")
public class CharController    {
    
	@Autowired
	private CharService charService;
	
	@GetMapping
	public List<Character> findAll(){
		return charService.findAll();
	}
    
    @GetMapping("/{name}")
    public Character findOne(@PathVariable String name) {
       return charService.findOne(name);
    }
  
  @PostMapping
  public Map<String, String> insert(@RequestBody Character character){
	 return charService.insert(character);
    }
  
  @PutMapping
  public Map<String,String> edit(@RequestBody Character character){
	  return charService.edit(character);
  }
  
  @DeleteMapping("/{name}")
  public Map<String,String> remove(@PathVariable String name){
	  return charService.remove(name);
   }
}
