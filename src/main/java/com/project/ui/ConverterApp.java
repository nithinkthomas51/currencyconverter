package com.project.ui;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.geometry.VPos;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class ConverterApp extends Application {
	
	private static GridPane root;

	@Override
	public void start(Stage primaryStage) throws Exception {
		createLayout();
		Field.setField();
		alignToCenter();
		Scene scene = new Scene(root, 600, 400);
		primaryStage.setScene(scene);
		primaryStage.show();
	}
	
	private void alignToCenter() {
		root.getRowConstraints().forEach(row -> row.setValignment(VPos.CENTER));
	}
	
	private static void createLayout() {
		root = new GridPane();
		root.setAlignment(Pos.CENTER);
		root.setHgap(10);
		root.setVgap(10);
		root.setPadding(new Insets(25, 25, 25, 25));
	}
	
	public static GridPane getGridLayout() {
		return root;
	}
	
	public static void main(String[] args) {
		launch();
	}
}
