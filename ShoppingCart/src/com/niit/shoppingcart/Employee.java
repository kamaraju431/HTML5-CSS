package com.niit.shoppingcart;

public class Employee {


	private int id;
	private String name;
	private Employee Manager;
	private Department dept;
	
	public Employee(int id, String name) {
	this.id=id;
	this.name=name;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public Employee getManager() {
		return Manager;
	}

	public void setManager(Employee manager) {
		Manager = manager;
	}

	public Department getDept() {
		return dept;
	}

	public void setDept(Department dept) {
		this.dept = dept;
	}

	public static void main(String[] args) {
		Employee manager=new Employee(105,"jp");
		Employee clerk=new Employee(102,"krish");
		clerk.setManager(manager);
		Department office=new Department(50,"office");
		clerk.setDept(office);
		manager.setDept(office);
		display(clerk);
		display2(manager);
	}
	private static void display(Employee clerk){
		System.out.println(clerk.getId());
		System.out.println(clerk.getName());
		System.out.println(clerk.getManager().getName());
		System.out.println(clerk.getDept().getName());
	}
	private static void display2(Employee manager){
		System.out.println(manager.getId());
		System.out.println(manager.getName());
		System.out.println(manager.getDept().getName());
		
}
}
