package com.techelevator;

import java.math.BigDecimal;
import java.util.Scanner;

public class ShoppingCartClass {

	public double balance = 0.0;
	public double getBalance() {
		return balance;
	}

	int quarter = 25;
	int dime = 10;
	int nickel = 5;

	
	int quartersToReturn = 0;
	int dimesToReturn = 0;
	int nickelsToReturn = 0;
	
	
	public double subtractCost(double price) 
	{		
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
	
	public double addFunds(double amountAdded) 
	{
		balance += amountAdded;
		System.out.println("Your new balance is $ " + formatMoney());
		return balance;
	}
	public String formatMoney()
	{
		
		return String.format("%.2f", balance);
	}
	
	public void returnChange() {		
		int balanceInt = (int)Math.round(balance*100);
		while(balanceInt > 0) 
		{
			if(balanceInt >= quarter) 
			{	quartersToReturn++;
				balanceInt -= quarter;
			} 
			else if (balanceInt >= dime) 
			{
				dimesToReturn++;
				balanceInt -= dime;
			} 
			else if (balanceInt >= nickel) 
			{
				nickelsToReturn++;
				balanceInt -= nickel;
			}
		}
		this.balance = 0;
	System.out.println("Your change is as follows " + quartersToReturn + " quarters, " + dimesToReturn + " dimes, " + nickelsToReturn + " nickels." );
	}
	
}
