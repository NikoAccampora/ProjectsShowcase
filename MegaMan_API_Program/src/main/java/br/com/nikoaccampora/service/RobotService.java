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
import br.com.nikoaccampora.model.Game;
import br.com.nikoaccampora.model.RobotMaster;
import br.com.nikoaccampora.model.Weapon;
import br.com.nikoaccampora.service.WeaponService;
import br.com.nikoaccampora.model.Character.Type;
import br.com.nikoaccampora.model.Weapon.Element;

@Service
public class RobotService {
	    private List<RobotMaster> RobotList = new ArrayList<RobotMaster>();
		
	    
	    
	    RobotService(){
	    	RobotList.add(
	    	         new RobotMaster(new Character("Mega Man",Type.Robot,new Game("Mega Man",LocalDate.of(1987,12,17))),
	    	        		 "DLN. 001",
	    	        		 new Character("Dr. Light",Type.Human,new Game("Mega Man",LocalDate.of(1987,12,17))),
	    	        		 new Weapon("Mega Buster","Mega Man",Element.Buster),
	    	        		 null)				
	    	);
	    	RobotList.add(
	   	         	 new RobotMaster(new Character("Roll",Type.Robot,new Game("Mega Man",LocalDate.of(1987,12,17))),
	    	        		 "DLN. 002",
	    	        		 new Character("Dr. Light",Type.Human,new Game("Mega Man",LocalDate.of(1987,12,17))),
	    	        		 null,
	    	        		 null)		
	    	);
	    }
	    
	 public List<RobotMaster> findAll(){
		 return this.RobotList;
	 }
	 
	 public RobotMaster findOne(String name) {
		 for(RobotMaster robotMaster : RobotList) {
	    	   if(robotMaster.character.name.equalsIgnoreCase(name)) {
	    		   return robotMaster;
	    	   }
	       }
	    return null;
	 }
	 
	 public Map<String, String> insert(RobotMaster robotMaster){
		 Map<String, String> result = new HashMap<String, String>();
		  boolean isSuccess = RobotList.add(robotMaster);
		  if(isSuccess) {
			  result.put("result", "Robot added successfully!");
		  }else {
			  result.put("result", "ERROR!!! Could not be added!");
		  }
		  return result;	
	 }	 
	 
	 public Map<String,String> edit(RobotMaster robotMaster){
		  Map<String,String> result = new HashMap<String, String>();
		  
		  for(RobotMaster element : RobotList) {
	   	   if(element.character.name.equalsIgnoreCase(robotMaster.character.name)) {
	   		   int index = RobotList.indexOf(element);
	   		   RobotList.set(index, robotMaster);
	   		   result.put("result", "Edit successful!");
	   		   return result;
	   	  }   
	   	}
		  result.put("result", "ERROR!!! Could not edit!");
		  return result;

	 }
	 
	 public Map<String,String> remove(String name){
		  Map<String,String> result = new HashMap<String, String>();
		  boolean isSuccess = RobotList.removeIf(
				  (robotMaster)->robotMaster.character.name.equalsIgnoreCase(name)
		  );
		  if(isSuccess) {
			  result.put("result", "Robot Master removed.");
		  } else {
			  result.put("result", "ERROR!!! Could not remove!");
		  }
		  return result;
	   }
}
