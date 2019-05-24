package com.hackathon.ibot.homeinsurance;

import com.hackathon.ibot.Insurance;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
public class HomeInsurance extends Insurance {
	@Getter @Setter
	private HouseType houseType;
	@Getter @Setter
	private int age;
	@Getter @Setter
	private int size;
	@Getter @Setter
	private InsuredAmount insuredAmount;
	
	public boolean hasNullField() {
		if(houseType == null || age == 0 || size == 0 || insuredAmount == null) return true;
		return false;
	}
}
