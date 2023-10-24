package com.project.converter;

import com.project.httpcomponents.ConversionRateRequestHandler;

public class Converter {
		String toCode;
		double amount;
		
		Converter(String countryCode, double amount) {
			this.toCode = countryCode;
			this.amount = amount;
		}
		
		public double convert() {
			return amount * getConversionRate();
		}
		
		private double getConversionRate() {
			ConversionRateRequestHandler handler = new ConversionRateRequestHandler(toCode);
			return handler.fetchConversionRate();
		}

}
