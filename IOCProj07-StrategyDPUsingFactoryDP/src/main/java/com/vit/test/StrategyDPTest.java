package com.vit.test;

import com.vit.beans.Courier;
import com.vit.beans.DHL;
import com.vit.beans.Flipkart;
import com.vit.factory.FlipkartFactory;

public class StrategyDPTest {

	public static void main(String[] args) {
		
		try {
			Flipkart fpk = FlipkartFactory.createFlipkart("bdart");
			
			String result = fpk.shopping(new String[] {"shirt","pant"}, new double[] {500,600});
		
			System.out.println(result);
		}catch(IllegalArgumentException iae) {
			iae.printStackTrace();
		}
	}

}
