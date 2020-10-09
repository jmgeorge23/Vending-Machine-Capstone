package com.techelevator;

import java.util.Scanner;

public class ShoppingCartClass {

	public double balance = 0.0;
	public double getBalance() {
		return balance;
	}

	public final double quater = 0.25;
	public final double dime = 0.10;
	public final double nickel = 0.05;
	public final double penny = 0.01;
	
	public double subtractCost(double price) {
		balance-=price;
		System.out.println("Your new balance is $ " + formatMoney());
		return balance;		
		
	} 
	
	public double addFunds(double amountAdded) {
		balance += amountAdded;
		System.out.println("Your new balance is $ " + formatMoney());
		return balance;
	}
	public String formatMoney()
	{
		
		return String.format("%.2f", balance);
	}
}
