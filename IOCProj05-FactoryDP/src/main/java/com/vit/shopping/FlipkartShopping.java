//FlipkartShopping.java

package com.vit.shopping;

import com.vit.beans.Courier;

public class FlipkartShopping {
	
	//HAS-A property
	private Courier courier;
	
	public void setCourier(Courier courier) {
		this.courier=courier;
	}
	
	public String shop(String[] items,float[] amt) {
		float totalBill = 0;
		
		System.out.println("Items \t : \t price");
		System.out.println("--------------------");
		for(int i=0;i<items.length;i++) {
			totalBill+=amt[i];
			System.out.println(items[i]+" \t "+amt[i]);
		}
		String status = courier.deliver();
		
		return status +" :: "+totalBill;
	}
}//class
