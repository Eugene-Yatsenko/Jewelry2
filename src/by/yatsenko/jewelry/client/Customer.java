package by.yatsenko.jewelry.client;

import by.yatsenko.jewelry.logic.CustomerOperations;

public class Customer extends DeliveryAddress implements CustomerOperations{
	private String name;
	private String surName;
	
	public Customer(String street, int houseNumber, String name, String surName ) {
		super(street, houseNumber);
		this.surName = surName;
		this.name = name; 
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSurName() {
		return surName;
	}
	public void setSurName(String surName) {
		this.surName = surName;
	}
	
	 public  void printName() {
		 System.out.print(this.getName());
	}
	
	public void printSurName() {
		System.out.print(this.getSurName());
	}
	
	public void printStreet() {
		System.out.print(this.getStreet());
	}
	
	public void printHouseNumber() {
		System.out.print(this.getHouseNumber());
	}
	
	public void printClient() {
		this.printName();
		this.printSurName();
	}
	
	public void printAddress() {
		this.printStreet();
		this.printHouseNumber();
	}
	
	public void printAll() {
		printClient();
		System.out.println();
		printAddress();
	}
	
	public void changeClient(String name, String surName) {
		this.setName(name);
		this.setSurName(surName);
	}
	
	public void changeAddress(String street, int houseNumber) {
		this.setStreet(street);
		this.setHouseNumber(houseNumber);
	}

}
