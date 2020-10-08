package com.techelevator;

public class VendingMachineItem {
	public String code;
	public String name;
	public double price;
	public String type;
	public String sound;
	public int stock = 5;
	
	public VendingMachineItem(String code, String name, double price, String type)
	{
		this.code = code;
		this.name = name;
		this.price = price;
		this.type = type;		
	}

	public String getCode(){
		return code;
	}

	public String getName() {
		return name;
	}

	public double getPrice() {
		return price;
	}

	public String getType() {
		return type;
	}

	public String getSound() {
		return sound;
	}
	public void setSound(){
		sound = "";
	}
	public void takeOne(){
		stock-=1;
	}

}
