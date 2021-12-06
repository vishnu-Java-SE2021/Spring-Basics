//CourierFactory.java

package com.vit.factory;

import com.vit.beans.BlueDart;
import com.vit.beans.Courier;
import com.vit.beans.DHL;
import com.vit.beans.DTDC;

public class CourierFactory {
	
	public static Courier createCourier(String type) {
		if(type.equalsIgnoreCase("dhl"))
			return new DHL();
		else if(type.equalsIgnoreCase("dtdc"))
			return new DTDC();
		else if(type.equalsIgnoreCase("bDart"))
			return new BlueDart();
		else
			throw new IllegalArgumentException("Invalid input");
	}
}//class
