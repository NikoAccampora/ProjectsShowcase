package com.nikoaccampora.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/weapons")
public class PageWeaponsController {
	@GetMapping
	public String games() {
		return "weapons";
	}

}
