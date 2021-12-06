//DTDC.java

package com.vit.beans;

public class DTDC implements Courier {
	
	public DTDC() {
		 System.out.println("DTDC :: 0-param constructor");	
	}
	
	@Override
	public String deliver() {
		return "DTDC courier is your delivery partner";
	}

}
