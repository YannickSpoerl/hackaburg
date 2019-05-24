package com.hackathon.ibot;

import java.util.LinkedList;
import java.util.List;

import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@AllArgsConstructor
public class Conversation {

	@Getter @Setter @GeneratedValue @Id
	private int id;

	@Getter @Setter @OneToMany
	private List<Insurance> insurances;	
	
	//constructor to start new Conversation with new id generated by chatbot
	public Conversation() {
		this.insurances = new LinkedList<Insurance>();
	}
	
	public void addInsurance(Insurance insurance) {
		this.insurances.add(insurance);
	}
}
