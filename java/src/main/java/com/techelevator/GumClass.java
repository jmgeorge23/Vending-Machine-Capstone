package com.techelevator;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class GumClass extends VendingMachineItem{
	
	public GumClass(String code, String name, double price, String type)
	{
		super(code, name, price, type);
		
	}
	@Override
	public void setSound()
	{
		sound = "Chew Chew, Yum!";
	}
	public void setGum(File inventory)
	{
		try(Scanner inventoryScanner = new Scanner(inventory))
		{
			inventoryScanner.useDelimiter("\\|");
			if(inventoryScanner.nextLine().contains("Gum"))
			{	
				while(inventoryScanner.hasNext())
				{									
					inventoryList.add(new GumClass(inventoryScanner.next(), inventoryScanner.next(),inventoryScanner.nextDouble(),inventoryScanner.next()));					
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
