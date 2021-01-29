package com.brandonschaen.nindo;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
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
		
		scene.getStylesheets().add("MainScene.css");
		sceneTitle.setText("Nindo");
		sceneTitle.getStyleClass().add("header-title");
		primaryStage.setTitle("Nindo");
		
		root.setTop(sceneTitle);
		BorderPane.setAlignment(sceneTitle, Pos.CENTER);
		
		primaryStage.setScene(scene);
		primaryStage.show();
	}
	
	private static class MenuButton extends StackPane {
		private Text text;
		
		public void MenuButton( String content ) {
			Text btnContent = new Text(content);
			btnContent.getStyleClass().add("menu-btn");
			
			Rectangle bg = new Rectangle(200, 300);
			bg.setFill(Color.BLACK);
		}
	}
	
	private static class GameMenu extends Parent {
		public GameMenu() {
			
		}
	}
	

}
