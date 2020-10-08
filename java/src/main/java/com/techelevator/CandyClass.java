package com.techelevator;

public class CandyClass extends VendingMachineItem {
	
	
	public CandyClass(String code, String name, double price, String type)
	{
		super(code, name, price, type);
		
	}
	@Override
	public void setSound()
	{
		sound = "Munch Munch, Yum!";
	}

}
