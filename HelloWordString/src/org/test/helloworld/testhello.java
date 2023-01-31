package org.test.helloworld;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
//import org.springframework.springtest.ClassPathXmlApplicationContext;

public class testhello {
	public static void main(String[] args) {
		ApplicationContext con=new ClassPathXmlApplicationContext("helloworld.xml");
		springhelloworld spbean=(springhelloworld)con.getBean("springhellobean");
		spbean.printHello();
	}
}
