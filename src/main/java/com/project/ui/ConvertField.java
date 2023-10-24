package com.project.ui;

import javafx.event.EventHandler;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;

public class ConvertField extends Field {
	
	private Button convert = null;
	
	public ConvertField() {
		init();
		addNodes(3, convert);
		startListening();
	}

	@Override
	public void init() {
		convert = new Button("Convert");
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		if (convert != null) {
			EventHandler<MouseEvent> eventHandler = new EventHandler<MouseEvent>() {
				
				@Override
				public void handle(MouseEvent event) {
					// TODO Auto-generated method stub
					System.out.println("Mouse Clicked");
					System.out.println(AmountField.getAmount());
				}
			};
			convert.addEventFilter(MouseEvent.MOUSE_CLICKED, eventHandler);
		}
	}
}
