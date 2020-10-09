package com.techelevator;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class CandyClass extends VendingMachineItem{	
	
	public CandyClass(String name, double price)
	{
		super(name, price);
		type = "Candy";
		sound = "Munch Munch, Yum!";
	}
	
}
