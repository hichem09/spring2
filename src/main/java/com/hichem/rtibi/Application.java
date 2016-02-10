package com.hichem.rtibi;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Application {
	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(ApplicationConfg.class);
		BeanA beanA = context.getBean(BeanA.class);
		beanA.execute();
	}

}
