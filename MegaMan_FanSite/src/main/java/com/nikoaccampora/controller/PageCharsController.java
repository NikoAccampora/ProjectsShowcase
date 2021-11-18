package com.nikoaccampora.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/characters")
public class PageCharsController {
	@GetMapping
	public String games() {
		return "characters";
	}

}

