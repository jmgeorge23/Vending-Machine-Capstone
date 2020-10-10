package com.techelevator;

import java.util.Scanner;

public class ShoppingCartClass {

	public double balance = 0.0;
	public double getBalance() {
		return balance;
	}

	double quarter = 0.25;
	double dime = 0.10;
	double nickel = 0.05;

	
	int quartersToReturn = 0;
	int dimesToReturn = 0;
	int nickelsToReturn = 0;
	
	
	public double subtractCost(double price) {
			
			balance-=price;
		
		
		System.out.println("Your new balance is $ " + formatMoney());
		return balance;
	}
	
	public boolean canOrder(double price)
		{
			if(balance - price >0)
			{
				return true;				
			}
			
			return false;
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
	
	public void returnChange() {
		
		while(balance > 0) {
			if(balance >= quarter) {
				quartersToReturn++;
				balance -= quarter;
	} else if (balance >= dime) {
		dimesToReturn++;
		balance -= dime;
	} else if (balance >= nickel) {
		nickelsToReturn++;
		balance -= nickel;
	}
	}
		this.balance = 0;
	System.out.println("Your change is as follows " + quartersToReturn + " quarters, " + dimesToReturn + " dimes, " + nickelsToReturn + " nickels." );
	}
	
}
