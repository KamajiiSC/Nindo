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
	private GameMenu mainMenu;
	private static Text sceneTitle;

	@Override
	public void start( Stage primaryStage ) throws Exception {
		Pane root = new Pane();
		root.setPrefSize(1200, 800);
		
		primaryStage.setTitle("Nindo");
		
		mainMenu = new GameMenu();
		
		root.getChildren().addAll(mainMenu);
		
		Scene scene = new Scene(root);
		scene.getStylesheets().add("MainScene.css");
		
		primaryStage.setScene(scene);
		primaryStage.show();
	}
	
	private static class GameMenu extends Parent {
		public GameMenu() {
			VBox gameMenu = new VBox(10);
			sceneTitle = new Text();
			sceneTitle.setText("Nindo");
			sceneTitle.getStyleClass().add("header-title");
			
			gameMenu.setTranslateX(10);
			gameMenu.setTranslateY(20);
			
			MenuButton newGame = new MenuButton("New Game");
			MenuButton loadGame = new MenuButton("Load Game");			
			MenuButton options = new MenuButton("Options");			
			MenuButton exit = new MenuButton("Exit");			
			
			gameMenu.getChildren().addAll(newGame, loadGame, options, exit);
			
			VBox newMenu = new VBox(200);
			newMenu.getChildren().addAll(sceneTitle, gameMenu);
			newMenu.setTranslateX(510);
			newMenu.setTranslateY(200);
			newMenu.setAlignment(Pos.CENTER);
			
			getChildren().addAll(newMenu);
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
			
			setOnMouseEntered(event -> {
				bg.setFill(Color.BLACK);
			});
			setOnMouseExited(event -> {
				bg.setFill(Color.LIGHTGRAY);
			});
		}
	}
	
	public static void main(String[] args) {
		launch (args);
	}
	

}
