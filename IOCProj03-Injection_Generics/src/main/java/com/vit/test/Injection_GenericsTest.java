package com.vit.test;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

import com.vit.beans.WishMessageGenerator;

class Injection_GenericsTest{

	public static void main(String[] args) {
				
				//hold and locate xml configuration file
				FileSystemResource res = new FileSystemResource("src/main/java/com/vit/cfgs/applicationContext.xml");
				
				//create IOC container
				XmlBeanFactory factory = new XmlBeanFactory(res);
				
				//get spring bean obj from xml file using bean id by calling getBean with class name
				WishMessageGenerator wmg = factory.getBean("wmg",WishMessageGenerator.class);
				
				//invoke b.method
				String result = wmg.generateMessage("King");
				
				System.out.println(result);
	}//main
}//class
