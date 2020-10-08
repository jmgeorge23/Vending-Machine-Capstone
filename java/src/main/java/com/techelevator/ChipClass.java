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
	public void setChip(File inventory)
	{
		try(Scanner inventoryScanner = new Scanner(inventory))
		{
			inventoryScanner.useDelimiter("\\|");
			if(inventoryScanner.nextLine().contains("Chip"))
			{	
				while(inventoryScanner.hasNext())
				{									
					inventoryList.add(new ChipClass(inventoryScanner.next(), inventoryScanner.next(),inventoryScanner.nextDouble(),inventoryScanner.next()));					
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
