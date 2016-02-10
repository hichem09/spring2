package com.hichem.rtibi;

public class BeanA {
	private BeanB beanB;

	public BeanA(BeanB beanB) {
		super();
		this.beanB = beanB;
	}

	public void execute() {
		System.out.println(this.beanB.getBeanC().getMessage());
	}

}
