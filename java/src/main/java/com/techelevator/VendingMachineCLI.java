package com.techelevator;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.techelevator.view.Menu;

public class VendingMachineCLI {

	private static final String MAIN_MENU_OPTION_DISPLAY_ITEMS = "Display Vending Machine Items";
	private static final String MAIN_MENU_OPTION_PURCHASE = "Purchase";
	private static final String MAIN_MENU_OPTION_EXIT = "Exit";
	private static final String MAIN_MENU_OPTION_SALES_REPORT = "Sales Report";
	private static final String[] MAIN_MENU_OPTIONS = { MAIN_MENU_OPTION_DISPLAY_ITEMS, MAIN_MENU_OPTION_PURCHASE, MAIN_MENU_OPTION_EXIT };
	
	private static final String PURCHASE_MENU_FEED_MONEY = "Feed Money";
	private static final String PURCHASE_MENU_SELECT_PRODUCT = "Select Item";
	private static final String PURCHASE_MENU_FINISH_TRANSACTION = "Complete Transaction";
	private static final String[] PURCHASE_MENU_OPTIONS = { PURCHASE_MENU_FEED_MONEY, PURCHASE_MENU_SELECT_PRODUCT, PURCHASE_MENU_FINISH_TRANSACTION };
	private Menu menu;
	private Menu submenu;
	public Scanner userInput = new Scanner(System.in);

	public VendingMachineCLI(Menu menu, Menu submenu) {
		this.menu = menu;
		this.submenu = submenu;
	
	}
	
	
	public File inventory = new File("vendingmachine.csv");
	public InventoryClass vendingInventory = new InventoryClass();
	public ShoppingCartClass shoppingCart = new ShoppingCartClass();


	public void run() throws IOException {
						vendingInventory.setInventoryList(inventory);
		while (true) {
			String choice = (String) menu.getChoiceFromOptions(MAIN_MENU_OPTIONS);
			
			if (choice.equals(MAIN_MENU_OPTION_DISPLAY_ITEMS)) {				
			System.out.println("---- Inventory List ----");
				
				vendingInventory.printInventoryList();
										
			} else if (choice.equals(MAIN_MENU_OPTION_PURCHASE)) {
				System.out.println("Your balance is $" + shoppingCart.formatMoney());
				while(true)
				{
					String subChoice = (String) submenu.getChoiceFromOptions(PURCHASE_MENU_OPTIONS);										
				
					if(subChoice.equals(PURCHASE_MENU_FEED_MONEY)) {
						//while(true)
						{
							System.out.println("Bill amount to be added:");
							double addedFunds = userInput.nextDouble();
							if(addedFunds == 1 || addedFunds == 2 || addedFunds == 5 || addedFunds == 10) {
								shoppingCart.addFunds(addedFunds);
						} 
							else {
								System.out.println("Invalid bill entered, please try again");
							}
							vendingInventory.logSale(subChoice,	shoppingCart.balance);
						}
					}
					
					else if(subChoice.equals(PURCHASE_MENU_SELECT_PRODUCT)) {
						Scanner codeScanner = new Scanner(System.in);
						
						while(true)
						{	
							System.out.println("What galaxy-brained purchase would you like to make?");
							vendingInventory.printInventoryList();
							String purchaseCode = codeScanner.nextLine().toUpperCase();
							
							if(vendingInventory.inventoryList.containsKey(purchaseCode))
							{
								if(shoppingCart.canOrder(vendingInventory.inventoryList.get(purchaseCode).getPrice()))
								{
									shoppingCart.subtractCost(vendingInventory.inventoryList.get(purchaseCode).getPrice());
									vendingInventory.inventoryList.get(purchaseCode).takeOne();
									vendingInventory.inventoryList.get(purchaseCode).getSound();
									vendingInventory.logSale(vendingInventory.inventoryList.get(purchaseCode).getName(),subChoice,
											vendingInventory.inventoryList.get(purchaseCode).getPrice(),shoppingCart.balance);
								}
								else
								{
									System.out.println("Insert more money.");
								}
								break;
							}							
							else
							{
								System.out.println("Invalid code");
							}							
						}
						
					}				
					else if(subChoice.equals(PURCHASE_MENU_FINISH_TRANSACTION)) {
					System.out.println("Thanks for your purchase, Gamer");
					vendingInventory.logSale(subChoice,shoppingCart.balance);
					shoppingCart.returnChange();
					break;
					
					}
				}
			}
			else if (choice.equals(MAIN_MENU_OPTION_EXIT)) {
				System.out.println("Thanks for your purchase, Epic Gamer. Be sure to like, comment and subscribe!");
				userInput.close();				
				System.exit(0);
			
			}
		}
	}
	
	public static void main(String[] args) throws IOException {		
		printWelcomeBanner();
		Menu menu = new Menu(System.in, System.out);
		Menu submenu = new Menu(System.in, System.out);
		VendingMachineCLI cli = new VendingMachineCLI(menu, submenu);
		cli.run();		
	
	}
	public static void printWelcomeBanner() {
		System.out.println("___________      .__           ________                              ____   ____                 .___.__                \r\n" + 
				"\\_   _____/_____ |__| ____    /  _____/_____    _____   ___________  \\   \\ /   /____   ____    __| _/|__| ____    ____  \r\n" + 
				" |    __)_\\____ \\|  |/ ___\\  /   \\  ___\\__  \\  /     \\_/ __ \\_  __ \\  \\   Y   // __ \\ /    \\  / __ | |  |/    \\  / ___\\ \r\n" + 
				" |        \\  |_> >  \\  \\___  \\    \\_\\  \\/ __ \\|  Y Y  \\  ___/|  | \\/   \\     /\\  ___/|   |  \\/ /_/ | |  |   |  \\/ /_/  >\r\n" + 
				"/_______  /   __/|__|\\___  >  \\______  (____  /__|_|  /\\___  >__|       \\___/  \\___  >___|  /\\____ | |__|___|  /\\___  / \r\n" + 
				"        \\/|__|           \\/          \\/     \\/      \\/     \\/                      \\/     \\/      \\/         \\//_____/  ");
	}
}
