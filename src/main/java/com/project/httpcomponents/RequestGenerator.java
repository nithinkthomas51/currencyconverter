package com.project.httpcomponents;

import java.net.URI;
import java.net.http.HttpRequest;

public class RequestGenerator {
	
	private static HttpRequest request = null;
	private String countryCode;
	
	private final String BASE_URL = "https://openexchangerates.org/api/";
	private final String END_POINT = "latest.json";
	private final String APP_ID = "661bd6470e19467790d10f78165d0be9";
	
	RequestGenerator(String countryCode) {
		this.countryCode = countryCode;
		generateRequest();
	}
	
	private void generateRequest() {
		request = HttpRequest.newBuilder()
				  .uri(URI.create(createUri()))
				  .method("GET", HttpRequest.BodyPublishers.noBody())
				  .build();
	}
	
	private String createUri() {
		return BASE_URL + END_POINT + "?app_id=" + APP_ID + "&symbols=" + this.countryCode;
	}
	
	public HttpRequest getHttpRequest() {
		return request;
	}

}
