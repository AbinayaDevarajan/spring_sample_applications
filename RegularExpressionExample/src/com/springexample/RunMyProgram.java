package com.springexample;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class RunMyProgram {
	public static void main(String[] args) {
		
		
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		
		
		SampleEntity entity = (SampleEntity) context.getBean("entity");
			System.out.println("Entity Details");
			System.out.println("---------------");
			System.out.println("Entity No: "+entity.getSerialNo());
			System.out.println("Entity Name: "+entity.getEntityName());
			
			System.out.println();
			
			System.out.println("Entity Validator Details");
			System.out.println("-------------------------");
		
		RegexValidator entityValidator = (RegexValidator) context.getBean("regexValidator");
			System.out.println("Entity No is valid : "+entityValidator.isEntityNoValid());
			System.out.println("Entity Name is valid : "+entityValidator.isEntityNameValid());
			
			
			SampleEntity entity1 = (SampleEntity) context.getBean("entity1");
			System.out.println("Entity Details");
			System.out.println("---------------");
			System.out.println("Entity No: "+entity1.getSerialNo());
			System.out.println("Entity Name: "+entity1.getEntityName());
			
			System.out.println();
			
			
			
			RegexValidator entityValidator1 = (RegexValidator) context.getBean("regexValidator1");
			System.out.println("Entity No is valid: "+entityValidator1.isEntityNoValid());
			System.out.println("Entity Name is valid : "+entityValidator1.isEntityNameValid());
			
			
			System.out.println("Entity Name: "+entity1.getLogContent());
			
			
			System.out.println();
			
			
			LogFilter logFilter1 = (LogFilter) context.getBean("entityLogFilter1");
			System.out.println("Entity log filter: "+logFilter1.getLogFilter());
			System.out.println("Entity log filter: "+logFilter1.getFilterProperty());
			
			LogFilter logFilterExample = (LogFilter) context.getBean("entityLogFilterExample");
			System.out.println("Entity log filter: "+logFilterExample.getLogFilter());
			
			
			
			
			
			
	}
}
