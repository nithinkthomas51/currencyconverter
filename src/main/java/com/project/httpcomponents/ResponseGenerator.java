package com.project.httpcomponents;

import java.io.IOException;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ResponseGenerator {
	
	HttpResponse<String> response = null;
	
	public ResponseGenerator(HttpRequest request) {
		createResponse(request);
	}
	
	private void createResponse(HttpRequest request) {
		try {
			response = HttpClient.newHttpClient().send(request, HttpResponse.BodyHandlers.ofString());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public String getResponse() {
		return response.body();
	}

}
