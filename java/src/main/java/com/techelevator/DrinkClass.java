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
	
	public void setDrink(File inventory)
	{
		try(Scanner inventoryScanner = new Scanner(inventory))
		{
			inventoryScanner.useDelimiter("\\|");
			if(inventoryScanner.nextLine().contains("Drink"))
			{	
				while(inventoryScanner.hasNext())
				{									
					inventoryList.add(new DrinkClass(inventoryScanner.next(), inventoryScanner.next(),inventoryScanner.nextDouble(),inventoryScanner.next()));					
					System.out.println(inventoryList.get(0).getCode());
				}
			}
		}
		catch(FileNotFoundException e)
		{
			System.out.println();
		}
	}

}
