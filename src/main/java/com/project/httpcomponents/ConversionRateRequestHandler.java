package com.project.httpcomponents;

import org.json.JSONObject;

public class ConversionRateRequestHandler {
	
	private String countryCode;
	
	public ConversionRateRequestHandler(String countryCode) {
		this.countryCode = countryCode;
	}
	
	public double fetchConversionRate() {
		JSONObject jsonResponse = responseToJson(CreateResponse());
		double conversionRate = new JSONObject(jsonResponse.get("rates").toString())
								.getDouble(countryCode);
		return conversionRate;
	}
	
	private String CreateResponse() {
		// Generate an API request
		RequestGenerator request = new RequestGenerator(countryCode);
		// Fetch the API response
		return new ResponseGenerator(request.getHttpRequest()).getResponse();
	}
	
	private JSONObject responseToJson(String response) {
		// Convert API response to a JSON object
		return new JSONObject(response);
	}

}
