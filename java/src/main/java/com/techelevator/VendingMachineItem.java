package com.techelevator;

import java.io.File;
import java.io.FileNotFoundException;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class VendingMachineItem {
	
	
	
	public String name;
	public double price;
	public String type;
	public String sound;
	public int stock = 5;
	
	public VendingMachineItem(String name, double price)
	{
		this.name = name;
		this.price = price;	
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
		System.out.println(sound);
		return sound;
	}	
	public int getStock()
	{
		return stock;
	}
	public boolean takeOne(){
		if(stock > 0) {
		stock-=1;
		return true;
		}else {
			System.out.println(getName() + " is out of stock");
			return false;
		}
		
		
	}
	public String formatMoney(double price)
	{
		return String.format("$%.2f", price);	
	}
	
}


