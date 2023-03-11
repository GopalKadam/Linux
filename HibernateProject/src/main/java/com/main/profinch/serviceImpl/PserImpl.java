package com.main.profinch.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.main.profinch.Person;
import com.main.profinch.repo.PersonRepo;
import com.main.profinch.service.Pser;

@Service
public class PserImpl implements Pser {
	
	@Autowired
	PersonRepo pr;

	@Override
	public void savePerson(Person p) {
		
		pr.save(p);
	}

}
