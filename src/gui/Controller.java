package gui;

import javafx.geometry.Insets;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;

public class Controller extends GUI {


	//THese are the methods that the button call whenever someting needs to get done....
	public void showGameDetails() {
		try {
			txtErrorMsg.setText("MESSAGE: Click Clear when done"); 
			vbLeft.getChildren().addAll( lbDetails, listView, txtErrorMsg);
		} catch (Exception e) {
			txtErrorMsg.setText("MESSAGE: Details is already active"); 
			System.out.println(e);
		}
		

	}
	
    public void showGameNav() {
    	try {
    		txtErrorMsg.setText("MESSAGE: Click Clear when done"); 
    		vbRight.getChildren().addAll(lbNavigation, btUpperFloor, gpNav, btLowerFloor, txtErrorMsg);
		}
    	catch (Exception e) {

    		txtErrorMsg.setText("MESSAGE: Nav. Bar is already active"); 
    		
    		System.out.println(e);
	}
    }
    
    public void clearGameDetails() {
		vbLeft.getChildren().clear();

	}
	
    public void clearGameNav() {
		vbRight.getChildren().clear();

	}
    
    public VBox getVBox() {
    	Label roomDesc = new Label("Label");
		VBox vbPlayField = new VBox();
		VBox.setMargin(vbPlayField, new Insets(20));
		
		
		
		//vbPlayField.getChildren().add(roomDesc);
		return vbPlayField;
    	
    }
	
}
