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
	private static GameContainer gameContainer;
	private static CharacterCreator characterCreator;
	private static Text sceneTitle;
	private static StackPane root;

	@Override
	public void start( Stage primaryStage ) throws Exception {
		root = new StackPane();
		root.setPrefSize(1200, 800);
		
		primaryStage.setTitle("Nindo");
		
		mainMenu = new GameMenu();
		
		root.getChildren().addAll(mainMenu);
		root.setAlignment(Pos.CENTER);
		
		Scene scene = new Scene(root);
		scene.getStylesheets().add("MainScene.css");
		
		primaryStage.setScene(scene);
		primaryStage.show();
	}
	
	private static class CharacterCreator extends Parent {
		public CharacterCreator() {
			VBox creatorContainer = new VBox(10);
			
			Text introPrompt = new Text();
			introPrompt.setText("Welcome to the world of Nindo. \n To begin, what is your name?");
			
			creatorContainer.getChildren().addAll(introPrompt);
			getChildren().addAll(creatorContainer);
		}
	}
	
	private static class GameContainer extends Parent {
		public GameContainer () {
			BorderPane mainContainer = new BorderPane();
			mainContainer.setPrefSize(1200, 800);
			characterCreator = new CharacterCreator();
			sceneTitle = new Text();
			sceneTitle.setText("Nindo");
			sceneTitle.getStyleClass().add("header-title");
//			Rectangle bg = new Rectangle(1000, 600);
			
			mainContainer.setTop(sceneTitle);
			mainContainer.setCenter(characterCreator);
			BorderPane.setAlignment(sceneTitle, Pos.CENTER);
			getChildren().addAll(mainContainer);
		}
	}
	
	private static class GameMenu extends Parent {
		public GameMenu() {
			VBox gameMenu = new VBox(10);
			sceneTitle = new Text();
			sceneTitle.setText("Nindo");
			sceneTitle.getStyleClass().add("header-title");
			
			MenuButton newGame = new MenuButton("New Game");
			MenuButton loadGame = new MenuButton("Load Game");			
			MenuButton options = new MenuButton("Options");			
			MenuButton exit = new MenuButton("Exit");		
			
			newGame.setOnMouseClicked(event -> {
				gameContainer = new GameContainer();
				root.getChildren().clear();
				root.getChildren().addAll(gameContainer);
			});
			
			exit.setOnMouseClicked(event -> {
				System.exit(0);
			});
			
			gameMenu.getChildren().addAll(newGame, loadGame, options, exit);
			
			VBox newMenu = new VBox(200);
			newMenu.getChildren().addAll(sceneTitle, gameMenu);
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

		public void onMouseClicked(Object object) {
			// TODO Auto-generated method stub
			
		}
	}
	
	public static void main(String[] args) {
		launch (args);
	}
	

}