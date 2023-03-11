package com.main.profinch;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Getter;
import lombok.Setter;


@Setter
@Getter
@Entity
public class Person {
	
	@Id
	private int pid;
	private String name;

}
