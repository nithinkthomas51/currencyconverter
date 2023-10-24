package com.project.ui;

import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class AmountField extends Field{
	
	private Label amountLabel;
	private static TextField amountField;
	
	public AmountField() {
		init();
		addNodes(0, amountLabel, amountField);
		startListening();
	}
	
	@Override
	public void init() {
		amountLabel = new Label("Amount in USD");
		amountField = new TextField();
	}
	
	public static double getAmount() {
		return Double.parseDouble(amountField.getText());
	}

	@Override
	public void run() {
		if (amountField != null) {
			amountField.setOnKeyTyped(event -> {
				if (!isValidInput(amountField.getText())) {
					amountField.setStyle("-fx-text-fill: red;");
				} else {
					amountField.setStyle("-fx-text-fill: black;");
				}
			});
		}
	}
	
	private boolean isValidInput(String text) {
		return text.matches("\\d+");
	}
}
