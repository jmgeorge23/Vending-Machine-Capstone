package com.techelevator;

import org.junit.Assert;
import org.junit.Test;

public class CandyClassTest {
	
	@Test
	public void get_sound_test() {
		CandyClass candyTest = new CandyClass("test", 1.00);
		String expectedString = "Munch Munch, Yum!";
		Assert.assertEquals(expectedString, candyTest.getSound());		
	}
	
	@Test
	public void candy_purchase_test() {
		CandyClass candyTest = new CandyClass("Wonka Bar", 1.50);
		candyTest.takeOne();
		Assert.assertEquals(4, candyTest.getStock());		
	}
	
	@Test
	public void candy_is_available_test() {
		CandyClass candyTest = new CandyClass("Crunchie", 1.75);
		Assert.assertEquals(true, candyTest.takeOne());		
	}
	
	@Test
	public void candy_is_not_available_test() {
		CandyClass candyTest = new CandyClass("Wonka Bar", 1.50);
		for(int i = 1; i < 6; i++) {
			candyTest.takeOne();
		}
		Assert.assertEquals(false, candyTest.takeOne());		
	}
	
	@Test
	public void candy_price_test() {
		CandyClass candyTest = new CandyClass("Wonka Bar", 1.50);
		Assert.assertEquals(1.50, candyTest.getPrice(), 1e-15);		
	}
	

}
