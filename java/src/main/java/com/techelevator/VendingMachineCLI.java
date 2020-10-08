package com.techelevator;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.techelevator.view.Menu;

public class VendingMachineCLI {

	private static final String MAIN_MENU_OPTION_DISPLAY_ITEMS = "Display Vending Machine Items";
	private static final String MAIN_MENU_OPTION_PURCHASE = "Purchase";
	private static final String MAIN_MENU_OPTION_EXIT = "Exit";
	private static final String MAIN_MENU_OPTION_SALES_REPORT = "Sales Report";
	private static final String[] MAIN_MENU_OPTIONS = { MAIN_MENU_OPTION_DISPLAY_ITEMS, MAIN_MENU_OPTION_PURCHASE, MAIN_MENU_OPTION_EXIT, MAIN_MENU_OPTION_SALES_REPORT };

	private Menu menu;

	public VendingMachineCLI(Menu menu) {
		this.menu = menu;
	}
	
	

	public void run() {
		while (true) {
			String choice = (String) menu.getChoiceFromOptions(MAIN_MENU_OPTIONS);

			if (choice.equals(MAIN_MENU_OPTION_DISPLAY_ITEMS)) {
				//
			} else if (choice.equals(MAIN_MENU_OPTION_PURCHASE)) {
				// do purchase
			}
		}
	}
	
	public static void main(String[] args) {
		List<VendingMachineItem> inventoryList = new ArrayList<>();
		File inventory = new File("vendingmachine.csv");
		try(Scanner inventoryScanner = new Scanner(inventory))
		{
			inventoryScanner.useDelimiter("\\|");
			System.out.print(inventoryScanner.next());
			System.out.print(inventoryScanner.next());
			System.out.print(inventoryScanner.next());
			System.out.print(inventoryScanner.next());
			while(inventoryScanner.hasNext())
			{
				if(inventoryScanner.nextLine().contains("Chip"))
				{
					ChipClass chip = new ChipClass();
					
					System.out.println("");
				}
			}
		}
		catch(FileNotFoundException e)
		{
			
		}
		Menu menu = new Menu(System.in, System.out);
		VendingMachineCLI cli = new VendingMachineCLI(menu);
		cli.run();		
	
	}
}
