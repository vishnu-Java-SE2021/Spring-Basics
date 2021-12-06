package com.vit.beans;

public class DHL implements Courier {

	public DHL() {
	 System.out.println("DHL :: 0-param constructor");	
	}
	
	@Override
	public String deliver() {
		return "DHL is your delivery partner";
	}

}
