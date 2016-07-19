package com.nit.shoppingcart;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {
	
public static void main(String[] args){
	AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext();
	context.scan("com.nit.shoppingcart");
	context.refresh();
	Product p=(Product)context.getBean("product");
	p.setId("101");
	p.setName("kamu");
	p.setPrice(500);
	//context.getBean("Category");
	System.out.println(p.getId());
	System.out.println(p.getName());
	System.out.println(p.getPrice());
	
	System.out.println("successfully created");
}
	
}
