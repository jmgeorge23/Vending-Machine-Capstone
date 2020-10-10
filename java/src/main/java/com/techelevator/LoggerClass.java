package com.techelevator;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class LoggerClass {
	
	public File loggerFile = new File("log.txt");
	public double totalSales = 0;
	public Scanner logScanner = new Scanner(System.in);
	
	public void logSale(String item, double price) throws FileNotFoundException
	{
		PrintWriter writer = new PrintWriter(loggerFile);
		totalSales += price;
		writer.print(item + "\\|" + price);
		
	}
}
