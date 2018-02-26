package by.yatsenko.jewelry.logic;

import by.yatsenko.jewelry.client.*;

public interface CustomerOperations {
	
	public void printName();
	public void printSurName();	
	public void printStreet();	
	public void printHouseNumber();	
	
	public void printClient();
	public void printAddress();
	
	public void printAll();

	public void changeClient(String name, String surName);
	public void changeAddress(String street, int houseNumber);	

}