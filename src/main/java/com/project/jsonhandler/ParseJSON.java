package com.project.jsonhandler;

import java.io.FileReader;

import org.json.JSONObject;

public class ParseJSON {
	
	private final static String PROJECT_DIRECTORY = System.getProperty("user.dir");
	private final static String RESOURCE_DIRECTORY = PROJECT_DIRECTORY
											+ "\\src\\main\\resources\\";
	private String fileName;
	
	public ParseJSON(String fileName) {
		this.fileName = RESOURCE_DIRECTORY + fileName;
	}
	
	public JSONObject readJSONObject() {
		try {
			FileReader fileReader = new FileReader(this.fileName);
			StringBuilder jsonContent = new StringBuilder();
			int character;
			while ((character = fileReader.read()) != -1) {
				jsonContent.append((char)character);
			}
			fileReader.close();
			return new JSONObject(jsonContent.toString());
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
}
