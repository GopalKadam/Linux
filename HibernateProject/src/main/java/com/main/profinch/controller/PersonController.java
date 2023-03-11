package com.main.profinch.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.main.profinch.Person;
import com.main.profinch.service.Pser;

@RestController
public class PersonController {
	
	@Autowired
    Pser Pr;
	
	@GetMapping("/")
	public String GetDataJ() {
		return "Welcome to Linux os";
	}
	
	@PostMapping("/save")
	public String PersonSave(@RequestBody Person p)
	{
		Pr.savePerson(p);
		return "save data";
	}

}
