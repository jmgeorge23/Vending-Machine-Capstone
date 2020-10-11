package com.techelevator;

import org.junit.Test;

import org.junit.Assert;

public class GumTestClass {
	
	@Test
	public void get_sound_test() {
		GumClass gumTest = new GumClass("test", 1.00);
		String expectedString = "Chew Chew, Yum!";
		Assert.assertEquals(expectedString, gumTest.getSound());		
	}
	
	@Test
	public void gum_purchase_test() {
		GumClass gumTest = new GumClass("U-Chews", 0.85);
		gumTest.takeOne();
		Assert.assertEquals(4, gumTest.getStock());		
	}
	
	@Test
	public void gum_is_available_test() {
		GumClass gumTest = new GumClass("Chiclets", 0.75);
		Assert.assertEquals(true, gumTest.takeOne());		
	}
	
	@Test
	public void gum_is_not_available_test() {
		GumClass gumTest = new GumClass("U-Chews", 0.85);
		for(int i = 1; i < 6; i++) {
			gumTest.takeOne();
		}
		Assert.assertEquals(false, gumTest.takeOne());		
	}
	
	@Test
	public void gum_price_test() {
		GumClass gumTest = new GumClass("U-Chews", 0.85);
		Assert.assertEquals(0.85, gumTest.getPrice(), 1e-15);		
	}
	

}
