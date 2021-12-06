package com.vit.test;

import com.vit.beans.Courier;
import com.vit.beans.DHL;
import com.vit.beans.Flipkart;

public class StrategyDPTest {

	public static void main(String[] args) {
		
		Flipkart fpk = new Flipkart();
		Courier courier = new DHL();
		
		fpk.setCourier(courier);
		
		String result = fpk.shopping(new String[] {"shirt","pant"}, new double[] {500,600});
		
		System.out.println(result);
	}

}
