package com.techelevator;

import java.util.Scanner;

public class ShoppingCartClass {

	public int balance = 0;

	public int getBalance() {
		return balance;
	}

	public final double quater = 0.25;
	public final double dime = 0.10;
	public final double nickel = 0.05;
	public final double penny = 0.01;
	
	public double subtractCost(double price) {
		
		return balance;
		
		
	} 
	
	public double addFunds(double amountAdded) {
		balance += amountAdded;
		return balance;
	}
}
