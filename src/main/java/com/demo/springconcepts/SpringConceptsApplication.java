package com.demo.springconcepts;

import com.demo.springconcepts.component.DemoBean;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
/**
 * @SpringBootApplication to declare class main app class
 * ApplicationContext to configure SpringConceptApplication
 */
@SpringBootApplication
public class SpringConceptsApplication {
	public static void main(String[] args) {
		System.out.println("Welcome to Spring Concept Demo");
		ApplicationContext context = SpringApplication.run(SpringConceptsApplication.class, args);
		System.out.println("Checking Context : "+context.getBean(DemoBean.class));
	}

}
