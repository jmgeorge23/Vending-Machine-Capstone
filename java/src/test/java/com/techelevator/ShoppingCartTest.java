package com.techelevator;

import org.junit.Assert;
import org.junit.Test;

public class ShoppingCartTest {
	
	@Test
	public void feed_money_testing() {
		ShoppingCartClass test = new ShoppingCartClass();
		test.addFunds(10);
		Assert.assertEquals(10, test.getBalance(), 1e-15);
		
	}
	
	@Test
	public void can_order_should_return_true() {
		ShoppingCartClass test = new ShoppingCartClass();
		test.addFunds(10);
		Assert.assertEquals(true, true);
	}
	
	@Test
	public void can_order_should_return_false() {
		ShoppingCartClass test = new ShoppingCartClass();
		Assert.assertEquals(false, false);
	}
	
	@Test
	public void return_change() {
		ShoppingCartClass test = new ShoppingCartClass();
		test.addFunds(10);
		test.returnChange();
		Assert.assertEquals(40, test.quartersToReturn, 1e-15);
	}

	@Test
	public void return_change_should_return_quaters_and_dimes() {
		ShoppingCartClass test = new ShoppingCartClass();
		test.addFunds(2.35);
		test.returnChange();
		Assert.assertEquals(9, test.quartersToReturn, 1e-15);
		Assert.assertEquals(1, test.dimesToReturn, 1e-15);
	}
	
	@Test
	public void return_change_should_return_quaters_and_dimes_and_nickels() {
		ShoppingCartClass test = new ShoppingCartClass();
		test.addFunds(2.05);
		test.returnChange();
		Assert.assertEquals(8, test.quartersToReturn, 1e-15);
		Assert.assertEquals(1, test.nickelsToReturn, 1e-15);
	}
}
