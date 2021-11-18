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

import br.com.nikoaccampora.model.Weapon;
import br.com.nikoaccampora.service.WeaponService;

@RestController
@RequestMapping("/weapon")
public class WeaponController    {
    
	@Autowired
	private WeaponService weaponService;
	
	@GetMapping
	public List<Weapon> findAll(){
		return weaponService.findAll();
	}
    
    @GetMapping("/{name}")
    public Weapon findOne(@PathVariable String name) {
       return weaponService.findOne(name);
    }
  
  @PostMapping
  public Map<String, String> insert(@RequestBody Weapon weapon){
	 return weaponService.insert(weapon);
    }
  
  @PutMapping
  public Map<String,String> edit(@RequestBody Weapon weapon){
	  return weaponService.edit(weapon);
  }
  
  @DeleteMapping("/{name}")
  public Map<String,String> remove(@PathVariable String name){
	  return weaponService.remove(name);
   }
}
