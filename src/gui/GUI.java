package gui;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.control.Label;

public class GUI extends Application{
   final private int windowWidth = 1400; // width of Window
    final private int windowHeight = 900; //height of window
   VBox vbCenter; // vertical pane in the center of the window's borderPane
   VBox vbLeft;  // vertical pane in the left  of the window's borderPane
   GridPane gpNav;  // grid pane to palce the vaigation option east , west , north, and south
   VBox vbRight;//Right side of the game windows
   HBox hbTop;  // horizontal pane in the top of the window's borderPane
   HBox hbBottom; // horizontal pane in the bottom of the window's borderPane
   Label lbTitle; // label for game title
   Insets insets; // insets to create margin or padding aroung node items
   BorderPane borderPane; // main border Pane to display the window
   Button btExit; //exit button for each room
   Button btNorth;
   Button btEast;
   HBox hbWestEast;
   Button btSouth;
   Button btWest;
   Button btUpperFloor;
   Button btLowerFloor;
   Label lbDetails;
   Button btLaunchCM;
   Button btViewInstructions;
	@Override
	public void start(Stage primaryStage) throws Exception {
		// TODO Auto-generated method stub
		
		insets = new Insets(5,5, 5,5); //insets to set margin to nodes
		//Button btViewInstr = new Button("Create Account");
		//Button btLaunchCM = new Button("Create Account");
		btViewInstructions = new Button("View Instructions");
		btLaunchCM = new Button("Launch Command Menu");
		vbRight = new VBox();
		lbTitle = new Label("WELCOME TO CITADEl OF STORMS");
		lbDetails = new Label("DETAILS");
		btExit = new Button("Exit");
		btNorth = new Button("N");
		btNorth.setAlignment(Pos.BASELINE_CENTER);
		btEast = new Button("E");
		btSouth = new Button("S");
		btWest = new Button("W");
		btNorth.setId("btnorth-button");
		btEast.setId("bteast-button");
		btSouth.setId("btsouth-button");
		btWest.setId("btwest-button");
		hbWestEast = new HBox();
		hbWestEast.getChildren().addAll(btWest, btEast);
		hbWestEast.setSpacing(20);
		hbWestEast.setAlignment(Pos.BASELINE_LEFT);
		btUpperFloor = new Button("Upper-Floor");
		btLowerFloor = new Button("Lowerr-Floor");
	
		hbTop = new HBox();
		hbTop.setPrefWidth(1.0);
		hbTop.getStyleClass().add("hbox-htTop");
		hbTop.getChildren().add(lbTitle);
		hbTop.setAlignment(Pos.CENTER);
		
		insets = new Insets(140, 10, 140, 10);
		gpNav = new GridPane();
		
		
		vbLeft = new VBox();
		lbDetails.getStyleClass().add("hbox-htTop");
		
		vbLeft.getChildren().add(lbDetails);
		vbLeft.getStyleClass().addAll("hbox-htTop");
		
		//gpRight.getChildren().addAll(btNorth,hbWestEast, btSouth);
		//gpRight.setSpacing(20);
		GridPane.setConstraints(btNorth, 1, 0);
		GridPane.setConstraints(btSouth, 1, 2);
		GridPane.setConstraints(btWest, 0, 1);
		GridPane.setConstraints(btEast, 2, 1);
		gpNav.getChildren().addAll(btNorth, btSouth, btWest, btEast);

		gpNav.setPadding(insets);
		gpNav.setAlignment(Pos.BASELINE_CENTER);
		
		
		hbBottom = new HBox();
		hbBottom.getStyleClass().addAll("hbox-htTop", "hbox-hbBottom");
		hbBottom.getChildren().addAll(btLaunchCM, btViewInstructions, btExit);
		hbBottom.setAlignment(Pos.BASELINE_CENTER);
		
		
		vbRight = new VBox();
		vbRight.getChildren().addAll(btUpperFloor, gpNav, btLowerFloor);
		vbRight.getStyleClass().addAll("hbox-htTop", "vbox-vbRight");
		//vbRight.setMargin(btUpperFloor, insets);
		
		
		borderPane = new BorderPane();
		borderPane.getStyleClass().add("borderPane");
		borderPane.setTop(hbTop);
		borderPane.setCenter(vbCenter);
		borderPane.setLeft(vbLeft);
		borderPane.setRight(vbRight);
		borderPane.setBottom(hbBottom);
		
		
		
		Scene scene = new Scene(borderPane, windowWidth, windowHeight); // set size of the windwo
		scene.getStylesheets().add(getClass().getResource("style.css").toExternalForm());
		primaryStage.setTitle("Citadel_Of_Storms");
		primaryStage.setScene(scene);
		primaryStage.show();
		primaryStage.setResizable(false); // disallow increasing window size
		
	}
	
	public static void main(String [] args) {
		Application.launch(args);
	}

}
