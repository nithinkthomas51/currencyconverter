package com.project.converter;

public class Main {
	
	public static void main(String[] args) {
		
		String countryCode = "INR";
		double amount = 100;
		
		Converter ctr = new Converter(countryCode, amount);
		System.out.println(amount + " USD is same as " + ctr.convert() + " " + countryCode);
	}
}
