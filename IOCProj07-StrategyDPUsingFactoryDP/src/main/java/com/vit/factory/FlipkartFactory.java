package com.vit.factory;

import com.vit.beans.BlueDart;
import com.vit.beans.DHL;
import com.vit.beans.DTDC;
import com.vit.beans.Flipkart;

public class FlipkartFactory {
	
	public static Flipkart createFlipkart(String cname) {
		Flipkart fpk = new Flipkart();
		if(cname.equalsIgnoreCase("bDart"))
			fpk.setCourier(new BlueDart());
		else if(cname.equalsIgnoreCase("dtdc"))
			fpk.setCourier(new DTDC());
		else if(cname.equalsIgnoreCase("dhl"))
			fpk.setCourier(new DHL());
		else
			throw new IllegalArgumentException("Invalid input");
		
		return fpk;
	}
}
