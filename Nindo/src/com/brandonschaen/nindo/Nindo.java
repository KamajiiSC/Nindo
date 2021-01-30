package com.brandonschaen.nindo;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.scene.control.ListView;
import javafx.stage.Stage;

public class Nindo extends Application{
	private GameMenu newMenu;

	@Override
	public void start( Stage primaryStage ) throws Exception {
		Pane root = new Pane();
		root.setPrefSize(1200, 800);
		
		Text sceneTitle = new Text();
		newMenu = new GameMenu();

		sceneTitle.setText("Nindo");
		sceneTitle.getStyleClass().add("header-title");
		
		VBox mainMenu = new VBox(200);
		mainMenu.getChildren().addAll(sceneTitle, newMenu);
		mainMenu.setTranslateX(500);
		mainMenu.setTranslateY(200);
		mainMenu.setAlignment(Pos.CENTER);
		
		primaryStage.setTitle("Nindo");
		
		root.getChildren().addAll(mainMenu);
		
		Scene scene = new Scene(root);
		scene.getStylesheets().add("MainScene.css");
		primaryStage.setScene(scene);
		primaryStage.show();
	}
	
	private static class GameMenu extends Parent {
		public GameMenu() {
			VBox gameMenu = new VBox(10);
			
			gameMenu.setTranslateX(10);
			gameMenu.setTranslateY(20);
			
			MenuButton newGame = new MenuButton("New Game");
			MenuButton loadGame = new MenuButton("Load Game");			
			MenuButton options = new MenuButton("Options");			
			
			gameMenu.getChildren().addAll(newGame, loadGame, options);
			
			Rectangle bg = new Rectangle(800, 600);
			bg.setFill(Color.GRAY);
			bg.setOpacity(0.4);
			
			getChildren().addAll(gameMenu);
		}
	}
	
	private static class MenuButton extends StackPane {
		private Text btnContent;

		public MenuButton(String content) {
			btnContent = new Text(content);
			btnContent.getStyleClass().add("menu-btn");
			
			Rectangle bg = new Rectangle(140, 40);
			bg.setFill(Color.LIGHTGRAY);
			bg.setOpacity(0.5);
			
			getChildren().addAll(bg, btnContent);
		}
	}
	
	public static void main(String[] args) {
		launch (args);
	}
	

}
