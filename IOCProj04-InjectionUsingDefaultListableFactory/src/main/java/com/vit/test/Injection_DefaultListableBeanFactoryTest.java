//Injection_DefaultListableBeanFactoryTest.java
package com.vit.test;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

import com.vit.beans.WishMessageGenerator;

public class Injection_DefaultListableBeanFactoryTest {

	public static void main(String[] args) {
		
		//create factory/IOC container
		DefaultListableBeanFactory factory = new DefaultListableBeanFactory();
		
		//get Xml file reader obj 
		XmlBeanDefinitionReader reader = new XmlBeanDefinitionReader(factory);
		
		//load the Spring bean cfg file
		reader.loadBeanDefinitions("com/vit/cfgs/applicationContext.xml");
		
		//get Spring bean obj using bean id
		WishMessageGenerator wmg = factory.getBean("wmg",WishMessageGenerator.class);
		
		//invoke b.logic method
		String result = wmg.getMessage("Vardhan");
		
		System.out.println(result);
	}//main
}//class
