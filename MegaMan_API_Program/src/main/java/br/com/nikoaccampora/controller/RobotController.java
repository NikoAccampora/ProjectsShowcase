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

import br.com.nikoaccampora.model.RobotMaster;
import br.com.nikoaccampora.service.RobotService;

@RestController
@RequestMapping("/robotMaster")
public class RobotController    {
    
	@Autowired
	private RobotService robotService;
	
	@GetMapping
	public List<RobotMaster> findAll(){
		return robotService.findAll();
	}
    
    @GetMapping("/{name}")
    public RobotMaster findOne(@PathVariable String name) {
       return robotService.findOne(name);
    }
  
  @PostMapping
  public Map<String, String> insert(@RequestBody RobotMaster robotMaster){
	 return robotService.insert(robotMaster);
    }
  
  @PutMapping
  public Map<String,String> edit(@RequestBody RobotMaster robotMaster){
	  return robotService.edit(robotMaster);
  }
  
  @DeleteMapping("/{name}")
  public Map<String,String> remove(@PathVariable String name){
	  return robotService.remove(name);
   }
}
