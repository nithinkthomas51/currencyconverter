package com.project.ui;

import java.util.ArrayList;
import java.util.List;

import com.project.jsonhandler.ParseJSON;

import javafx.collections.FXCollections;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;

public class CountryField extends Field {
	
	private Label countryLabel;
	private ChoiceBox<String> country;
	
	public CountryField() {
		init();
		addNodes(1, countryLabel, country);
	}
	@Override
	public void init() {
		countryLabel = new Label("Convert To");
		country = new ChoiceBox<String>(FXCollections.observableArrayList(populateList()));
	}
	
	private List<String> populateList() {
		ParseJSON jsonFile = new ParseJSON("countries.json");
		List<String> keys = new ArrayList<>(jsonFile.readJSONObject().keySet());
		return keys;
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		
	}
}
