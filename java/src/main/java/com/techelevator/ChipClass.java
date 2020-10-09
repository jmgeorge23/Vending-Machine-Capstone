package com.techelevator;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ChipClass extends VendingMachineItem {
	
	public ChipClass(String name, double price)
	{
		super(name, price);
		type = "Chip";
		sound = "Crunch Crunch, Yum!";
	}
	
}
