package in.ineuron.test;

import java.io.IOException;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import in.ineuron.comp.Printer;

public class TestApp {
	public static void main(String[] args) throws IOException {
		
		ClassPathXmlApplicationContext factory = new ClassPathXmlApplicationContext("in/ineuron/cfg/applicationContext.xml");
		System.out.println("*********Started**********");
		System.in.read();
		Printer printer1 = factory.getBean("printer", Printer.class);
		Printer printer2 = factory.getBean("printer", Printer.class);
		System.out.println(printer1.hashCode());
		System.out.println(printer2.hashCode());
		System.out.println("*********Ended**********");
		
		factory.close();
	}
}
