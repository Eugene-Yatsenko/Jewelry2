package by.yatsenko.jewelry.client;

public class DeliveryAddress {
	private String street;
	private int houseNumber;
	
	
	public DeliveryAddress(String street, int houseNumber) {
		super();
		this.street = street;
		this.houseNumber = houseNumber;
	}
	
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public int getHouseNumber() {
		return houseNumber;
	}
	public void setHouseNumber(int houseNumber) {
		this.houseNumber = houseNumber;
	}	

}
