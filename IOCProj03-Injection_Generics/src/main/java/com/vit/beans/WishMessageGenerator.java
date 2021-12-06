package com.vit.beans;

import java.util.Date;

public class WishMessageGenerator {

	//HAS-A property
	private Date date;
	
	//setter method
	public WishMessageGenerator(Date date) {
		this.date=date;
	}
	
	//b.logic to generate method
	public String generateMessage(String user) {
		int hour=date.getHours();
		
		if(hour<12)
			return "Good Morning :: "+user;
		else if(hour<16)
			return "Good Afternoon :: "+user;
		else if(hour<20)
			return "Good Evening :: "+user;
		else
			return "Good Night :: "+user;
	}
}//class
