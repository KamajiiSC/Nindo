package com.brandonschaen.nindo;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Nindo extends Application{

	public static void main(String[] args) {
		launch (args);
	}
	
	@Override
	public void start( Stage primaryStage ) {
		StackPane root = new StackPane();
		Scene scene = new Scene(root, 1300, 900);
		Text sceneTitle = new Text();
		
		scene.getStylesheets().add("MainScene.css");
		sceneTitle.setText("Nindo");
		sceneTitle.getStyleClass().add("header-title");
		primaryStage.setTitle("Nindo");
		root.getChildren().add(sceneTitle);
		root.setAlignment(Pos.TOP_CENTER);
		primaryStage.setScene(scene);
		primaryStage.show();
	}

}
