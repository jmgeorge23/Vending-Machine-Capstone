package com.techelevator;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class DrinkClass extends VendingMachineItem{
	
	public DrinkClass(String name, double price)
	{
		super(name, price);
		type = "Drink";
		sound = "Glug Glug, Yum!";
		
	}
}
