package com.techelevator;

import org.junit.Assert;
import org.junit.Test;

public class DrinkClassTest {

	
	@Test
	public void get_sound_test() {
		DrinkClass drinkTest = new DrinkClass("test", 1.00);
		String expectedString = "Glug Glug, Yum!";
		Assert.assertEquals(expectedString, drinkTest.getSound());		
	}
	
	@Test
	public void drink_purchase_test() {
		DrinkClass drinkTest = new DrinkClass("Heavy", 1.50);
		drinkTest.takeOne();
		Assert.assertEquals(4, drinkTest.getStock());		
	}
	
	@Test
	public void drink_is_available_test() {
		DrinkClass drinkTest = new DrinkClass("Heavy", 1.50);
		Assert.assertEquals(true, drinkTest.takeOne());		
	}
	
	@Test
	public void drink_is_not_available_test() {
		DrinkClass drinkTest = new DrinkClass("Heavy", 1.50);
		for(int i = 1; i < 6; i++) {
			drinkTest.takeOne();
		}
		Assert.assertEquals(false, drinkTest.takeOne());		
	}
	
	@Test
	public void drink_price_test() {
		DrinkClass drinkTest = new DrinkClass("Heavy", 1.50);
		Assert.assertEquals(1.50, drinkTest.getPrice(), 1e-15);		
	}
	

}
