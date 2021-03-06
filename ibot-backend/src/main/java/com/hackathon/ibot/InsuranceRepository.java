package com.hackathon.ibot;

import org.springframework.data.repository.CrudRepository;

public interface InsuranceRepository extends CrudRepository<Insurance, Integer> {
	public Insurance findInsuranceByConversationAndType(Conversation conversation, InsuranceType type);
	
}
