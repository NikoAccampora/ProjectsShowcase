package br.com.nikoaccampora.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import br.com.nikoaccampora.model.Weapon;
import br.com.nikoaccampora.model.Weapon.Element;

@Service
public class WeaponService {
	    private List<Weapon> WeaponList = new ArrayList<Weapon>();
		
	    
	    
	    WeaponService(){
	    	WeaponList.add(
	    	         new Weapon("Mega Buster","Mega Man",Element.Buster)		
	    	);
	    	WeaponList.add(
	   	         	 new Weapon("Rolling Cutter","Cut Man",Element.Metal)		
	    	);
	    }
	    
	 public List<Weapon> findAll(){
		 return this.WeaponList;
	 }
	 
	 public Weapon findOne(String name) {
		 for(Weapon weapon : WeaponList) {
	    	   if(weapon.name.equalsIgnoreCase(name)) {
	    		   return weapon;
	    	   }
	       }
	    return null;
	 }
	 
	 public Map<String, String> insert(Weapon weapon){
		 Map<String, String> result = new HashMap<String, String>();
		  boolean isSuccess = WeaponList.add(weapon);
		  if(isSuccess) {
			  result.put("result", "Weapon added successfully!");
		  }else {
			  result.put("result", "ERROR!!! Could not be added!");
		  }
		  return result;	
	 }	 
	 
	 public Map<String,String> edit(Weapon weapon){
		  Map<String,String> result = new HashMap<String, String>();
		  
		  for(Weapon object : WeaponList) {
	   	   if(object.name.equalsIgnoreCase(weapon.name)) {
	   		   int index = WeaponList.indexOf(object);
	   		   WeaponList.set(index, weapon);
	   		   result.put("result", "Edit successful!");
	   		   return result;
	   	  }   
	   	}
		  result.put("result", "ERROR!!! Could not edit!");
		  return result;

	 }
	 
	 public Map<String,String> remove(String name){
		  Map<String,String> result = new HashMap<String, String>();
		  boolean isSuccess = WeaponList.removeIf(
				  (weapon)->weapon.name.equalsIgnoreCase(name)
		  );
		  if(isSuccess) {
			  result.put("result", "Weapon removed.");
		  } else {
			  result.put("result", "ERROR!!! Could not remove!");
		  }
		  return result;
	   }
}
