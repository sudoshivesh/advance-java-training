package org.test.helloworld;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class testhello {
	public static void main(String[] args) {
		ApplicationContext con=new ClassPathXmlApplicationContext("helloworld.xml");
		SpringHelloWorld spbean=(SpringHelloWorld)con.getBean("springhellobean");
		spbean.printHello();
	}
}
