//FlipkartTest.java

package com.vit.test;

import com.vit.beans.Courier;
import com.vit.factory.CourierFactory;
import com.vit.shopping.FlipkartShopping;

public class FlipkartTest {

	public static void main(String[] args) {
		try {
			FlipkartShopping fpk = new FlipkartShopping();

			Courier courier = CourierFactory.createCourier("bdart");
			
			fpk.setCourier(courier);
			
			String result=fpk.shop(new String[]{"shirt","trouser","hoodie"}, new float[]{2500.05f,3500.09f,1200.03f});
			
			System.out.println(result);
			
		}catch(Exception e) {
			e.printStackTrace();
		}

	}

}//class
