package com.techelevator;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class CandyClass extends VendingMachineItem{	
	
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
