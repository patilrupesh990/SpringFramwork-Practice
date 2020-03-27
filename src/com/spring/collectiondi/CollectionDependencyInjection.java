package com.spring.collectiondi;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CollectionDependencyInjection {
	
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("collectionbean.xml");
		System.out.println("ListBean Result:"+((ListBean)context.getBean("listBean")).getResult());

		System.out.println("SetBean Result:"+((SetBean)context.getBean("setBean")).getResult());

		System.out.println("MapBean Result:"+((MapBean)context.getBean("mapBean")).getResult());
		context.close();
	}

}
