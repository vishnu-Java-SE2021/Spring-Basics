package com.vit.test;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

import com.vit.beans.Flipkart;

public class StrategyDPTest {

	public static void main(String[] args) {
		
		//creating IOC container
		DefaultListableBeanFactory factory =  new DefaultListableBeanFactory();
		XmlBeanDefinitionReader reader = new XmlBeanDefinitionReader(factory);
		reader.loadBeanDefinitions("com/vit/cfgs/applicationContext.xml");
		
		//getting obj from container
		Flipkart fpk = factory.getBean("fpk",Flipkart.class);
		
		//retrieving the result
		String result = fpk.shopping(new String[] {"shirt","pant"}, new double[] {500,800});
		
		System.out.println(result);
	} 
}