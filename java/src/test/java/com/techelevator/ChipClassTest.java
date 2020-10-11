package com.techelevator;

import org.junit.Assert;
import org.junit.Test;

public class ChipClassTest {
	
	@Test
	public void get_sound_test() {
		ChipClass chipTest = new ChipClass("test", 1.00);
		String expectedString = "Crunch Crunch, Yum!";
		Assert.assertEquals(expectedString, chipTest.getSound());		
	}
	
	@Test
	public void chip_purchase_test() {
		ChipClass chipTest = new ChipClass("Cloud Popcorn", 3.65);
		chipTest.takeOne();
		Assert.assertEquals(4, chipTest.getStock());		
	}
	
	@Test
	public void chip_is_available_test() {
		ChipClass chipTest = new ChipClass("Cloud Popcorn", 3.65);
		Assert.assertEquals(true, chipTest.takeOne());		
	}
	
	@Test
	public void chip_is_not_available_test() {
		ChipClass chipTest = new ChipClass("Cloud Popcorn", 3.65);
		for(int i = 1; i < 6; i++) {
			chipTest.takeOne();
		}
		Assert.assertEquals(false, chipTest.takeOne());		
	}
	
	@Test
	public void chip_price_test() {
		ChipClass chipTest = new ChipClass("Cloud Popcorn", 3.65);
		Assert.assertEquals(3.65, chipTest.getPrice(), 1e-15);		
	}
	


}
