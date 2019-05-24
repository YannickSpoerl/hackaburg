package com.hackathon.ibot;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;

import lombok.Getter;
import lombok.Setter;

@Entity
public class Conversation {

	@Getter @Setter @GeneratedValue
	private int id;

	@Getter @Setter 
	private List<Insurance> insurances;	

	
	//constructor to start new Conversation with new id generated by chatbot
	public Conversation(int newId) {
		this.id = newId;
		this.insurances = null;
	}
	
	public void addInsurance(Insurance insurance) {
		this.insurances.add(insurance);
	}

}
