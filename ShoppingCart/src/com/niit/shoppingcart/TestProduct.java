package com.niit.shoppingcart;


import java.util.ArrayList;

public class TestProduct{
	public static void main(String[] args) {
		ArrayList<Products> products=new ArrayList<Products>();
		Products p0=new Products("PRS1","Dell Laptop",50000.00);
		products.add(p0); 
		Products p1=new Products("PRS2","phone",60000.00);
		products.add(p1);
		Products p2=new Products("PRS3","iphone65",65000.00);
		products.add(p2);
		for(Products p4:products)
		{
			System.out.println(p4.getId());
			System.out.println(p4.getName());
			System.out.println(p4.getPrice());
		}
	}

}
