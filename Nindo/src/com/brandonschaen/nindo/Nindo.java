package com.brandonschaen.nindo;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.scene.text.Text;
import javafx.scene.control.ListView;
import javafx.stage.Stage;

public class Nindo extends Application{

	public static void main(String[] args) {
		launch (args);
	}
	
	@Override
	public void start( Stage primaryStage ) {
		BorderPane root = new BorderPane();
		Scene scene = new Scene(root, 1300, 900);
		Text sceneTitle = new Text();
		ListView<String> options = new ListView<String>();
		
		options.getItems().add(" New Game ");
		options.getItems().add(" Load Game ");
		options.getItems().add(" Options ");
		options.getItems().add(" Exit ");
		scene.getStylesheets().add("MainScene.css");
		sceneTitle.setText("Nindo");
		sceneTitle.getStyleClass().add("header-title");
		options.getStyleClass().add("option-list");
		primaryStage.setTitle("Nindo");
		
		root.setTop(sceneTitle);
		root.setCenter(options);
		BorderPane.setAlignment(sceneTitle, Pos.CENTER);
		options.getSelectionModel().select(0);

		primaryStage.setScene(scene);
		primaryStage.show();
	}

}
