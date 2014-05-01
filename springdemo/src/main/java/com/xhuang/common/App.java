package com.xhuang.common;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
		HelloWorld hw = (HelloWorld) context.getBean("helloBean");
		hw.printHello();
	}

}
