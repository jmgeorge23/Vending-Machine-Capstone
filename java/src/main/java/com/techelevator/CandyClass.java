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
	public void setCandy(File inventory)
	{
		try(Scanner inventoryScanner = new Scanner(inventory))
		{
			inventoryScanner.useDelimiter("\\|");
			if(inventoryScanner.nextLine().contains("Candy"))
			{	
				while(inventoryScanner.hasNext())
				{									
					inventoryList.add(new CandyClass(inventoryScanner.next(), inventoryScanner.next(),inventoryScanner.nextDouble(),inventoryScanner.next()));					
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
