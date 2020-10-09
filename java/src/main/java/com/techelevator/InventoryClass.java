package com.techelevator;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class InventoryClass {
	
	public Map<String, VendingMachineItem> inventoryList = new LinkedHashMap<>();
	public File inventory = new File("vendingmachine.csv");

	
	
	public void printInventoryList() {
		inventoryList.entrySet().forEach(entry->
		{
			System.out.println(entry.getKey() + " | " + entry.getValue().getName() + " | " + entry.getValue().formatMoney(entry.getValue().getPrice()) + " | "+ entry.getValue().getStock());
		});
	}
	
	public void setInventoryList(File inventory)
	{
	try(Scanner inventoryScanner = new Scanner(inventory))
	{
		while(inventoryScanner.hasNextLine())
		{
			String line = inventoryScanner.nextLine();
			String[] sections = line.split("\\|");
			
			if(sections[3].equals("Chip"))
			{
				ChipClass chipItem = new ChipClass(sections[1], Double.parseDouble(sections[2]));
				inventoryList.put(sections[0], chipItem);
			}
			if(sections[3].equals("Candy"))
			{
				CandyClass candyItem = new CandyClass(sections[1], Double.parseDouble(sections[2]));
				inventoryList.put(sections[0], candyItem);
			}
			if(sections[3].equals("Drink"))
			{
				DrinkClass drinkItem = new DrinkClass(sections[1], Double.parseDouble(sections[2]));
				inventoryList.put(sections[0], drinkItem);
			}
			if(sections[3].equals("Gum"))
			{
				GumClass gumItem = new GumClass(sections[1], Double.parseDouble(sections[2]));
				inventoryList.put(sections[0], gumItem);
			}
		}
	
		
	}
	catch(FileNotFoundException e)
	{
		
	}
}
}
