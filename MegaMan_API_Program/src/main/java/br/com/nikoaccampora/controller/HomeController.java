package br.com.nikoaccampora.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class HomeController {
    @GetMapping
    public String index() {
    	return "Welcome to my MegaAPI. Here's what you can find:\n\n - Characters\n - Games\n - Robot Masters\n - Weapons";
    }
}