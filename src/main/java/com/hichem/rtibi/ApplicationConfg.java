package com.hichem.rtibi;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ApplicationConfg {
	@Bean
	public BeanA beanA() {
		
		BeanA beanA = new BeanA(beanB());
		BeanB b=beanB();
		BeanB b2=beanB();
		System.out.println(b == b2 ? "same" : "differnet");
		return beanA;
	}

	@Bean
	public BeanB beanB() {
		BeanB beanB = new BeanB();
		beanB.setBeanC(beanC());
		return beanB;
	}

	@Bean
	public BeanC beanC() {
		BeanC c = new BeanC();
		c.setMessage("hello java");
		return c;
	}
}
