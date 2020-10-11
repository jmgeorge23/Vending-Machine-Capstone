package com.techelevator;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class GumClass extends VendingMachineItem{
	
	public GumClass(String name, double price)
	{
		super(name, price);
		type = "Gum";
		sound = "Chew Chew, Yum!";		
	}	
	

	
}
