package com.techelevator;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class DrinkClass extends VendingMachineItem{
	
	public DrinkClass(String code, String name, double price, String type)
	{
		super(code, name, price, type);
		
	}
	@Override
	public void setSound()
	{
		sound = "Glug Glug, Yum!";
	}
}
