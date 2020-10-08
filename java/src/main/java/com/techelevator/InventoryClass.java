package com.techelevator;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class InventoryClass {
	
	public List<VendingMachineItem> inventoryList = new ArrayList<>();
	public File inventory = new File("vendingmachine.csv");
	
	
	public List<VendingMachineItem> getInventoryList() {
		return inventoryList;
	}
	
	public void setInventoryList(File inventory)
	{
	try(Scanner inventoryScanner = new Scanner(inventory))
	{
		inventoryScanner.useDelimiter("\\|");
		if(inventoryScanner.nextLine().contains("Chip")) {	
			while(inventoryScanner.hasNext())
			{									
				inventoryList.add(new ChipClass(inventoryScanner.next(), inventoryScanner.next(),inventoryScanner.nextDouble(),inventoryScanner.next()));					
				
			}
		} else if(inventoryScanner.nextLine().contains("Candy")) {
			while(inventoryScanner.hasNext())
			{									
				inventoryList.add(new CandyClass(inventoryScanner.next(), inventoryScanner.next(),inventoryScanner.nextDouble(),inventoryScanner.next()));					
				
			}
		} else if(inventoryScanner.nextLine().contains("Drink")) {
			while(inventoryScanner.hasNext())
			{									
				inventoryList.add(new DrinkClass(inventoryScanner.next(), inventoryScanner.next(),inventoryScanner.nextDouble(),inventoryScanner.next()));					
				
			}
		} else if(inventoryScanner.nextLine().contains("Gum")) {
			while(inventoryScanner.hasNext())
			{									
				inventoryList.add(new GumClass(inventoryScanner.next(), inventoryScanner.next(),inventoryScanner.nextDouble(),inventoryScanner.next()));					
				
			}
		}
		
	}
	catch(FileNotFoundException e)
	{
		
	}
}
}
