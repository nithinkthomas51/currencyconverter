package com.project.ui;

import javafx.scene.Node;
import javafx.scene.layout.GridPane;

public abstract class Field implements Runnable {
	
	public void addNodes(int row, Node... node) {
		
		GridPane root = ConverterApp.getGridLayout();
		for (Node eachNode : node) {
			root.addRow(row, eachNode);
		}
	}
	
	public static void setField() {
		new AmountField();
		new CountryField();
		new ConvertField();
	}
	
	public void startListening() {
		Thread t1 = new Thread(this);
		t1.start();
	}
	
	public abstract void init();
}
