//BlueDart.java

package com.vit.beans;

public class BlueDart implements Courier {
	
	public BlueDart() {
		 System.out.println("BlueDart :: 0-param constructor");	
	}
	
	@Override
	public String deliver() {
		return "BlueDart is your delivery partner";
	}
}
