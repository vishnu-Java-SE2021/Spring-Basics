package com.vit.factory;

import java.io.FileInputStream;
import java.lang.reflect.Constructor;
import java.util.Properties;

import com.vit.beans.Courier;
import com.vit.beans.Flipkart;

public class FlipkartFactory {
	static Properties props;
	
	static {
		try(FileInputStream fis = new FileInputStream("src/main/java/com/vit/commons/info.properties")) {
			props = new Properties();
			props.load(fis);
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static Flipkart createFlipkart() throws Exception{
			Flipkart fpk = new Flipkart();
		
			Class clazz = Class.forName(props.getProperty("dependent.comp"));
			Constructor cons[] = clazz.getDeclaredConstructors();
			
			Courier courier = (Courier)cons[0].newInstance();
		
			fpk.setCourier(courier);
		
		return fpk;
	}
}
