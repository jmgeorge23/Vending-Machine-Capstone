package com.techelevator;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ChipClass extends VendingMachineItem {
	
	public ChipClass(String code, String name, double price, String type)
	{
		super(code, name, price, type);
		
	}
	@Override
	public void setSound()
	{
		sound = "Crunch Crunch, Yum!";
	}
}
