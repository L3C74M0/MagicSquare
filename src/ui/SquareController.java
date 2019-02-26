package ui;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Region;
import model.MagicSquare;

public class SquareController {
	
	private MagicSquare magicSquare;
	
    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private ComboBox<String> sence;

    @FXML
    private ComboBox<String> ubication;
    
    @FXML
    private TextField size;
    
    @FXML
    private Button launch;
    
    @FXML
    private GridPane gridPane;

    @FXML
    void initialize() {
    	sence.getItems().add("NO");
        sence.getItems().add("NE");
        sence.getItems().add("SO");
        sence.getItems().add("SE");
        ubication.getItems().add("UP");
        ubication.getItems().add("DOWN");
        ubication.getItems().add("LEFT");
        ubication.getItems().add("RIGHT");
        magicSquare=new MagicSquare();
    } 
    
    @FXML
	public void fillMagicSquare(ActionEvent event){
    	try {
    		int sizeSquare = Integer.parseInt(size.getText());	
        	if(sizeSquare % 2 == 0) {
        		Alert alert=new Alert(AlertType.WARNING,"Please enter an odd number",ButtonType.CLOSE);
        		alert.getDialogPane().setMinHeight(Region.USE_PREF_SIZE);
        		alert.show();
        	}else {
        		gridPane.getChildren().clear();
        		try{
        			boolean option=true;
        			magicSquare.fillSquare(sizeSquare, sence.getValue(), ubication.getValue());
            		int[][] square= magicSquare.getMagicSquare();
            		for(int i=0;i<sizeSquare && option==true;i++) {
            			for(int j=0;j<sizeSquare && option==true;j++) {
                			int number= square[i][j];
                			if(square[i][j]==0){
                				option=false;        				
                			}else {
                				Button buton=new Button(""+number);
                				GridPane.setConstraints(buton, j, i, 1, 1);
                				gridPane.getChildren().addAll(buton);
                			}
                		}
            		}
            		if(option==false) {
            			Alert alert=new Alert(AlertType.WARNING,"Please select a valid option",ButtonType.CLOSE);
            			alert.getDialogPane().setMinHeight(Region.USE_PREF_SIZE);
            			alert.show();
            		}
        		}catch(NullPointerException e) {
        			Alert alert=new Alert(AlertType.WARNING,"Please select an option",ButtonType.CLOSE);
            		alert.getDialogPane().setMinHeight(Region.USE_PREF_SIZE);
            		alert.show();
        		}        		
        	}
		}catch(NumberFormatException e) {
			Alert alert=new Alert(AlertType.WARNING,"Please enter some value",ButtonType.CLOSE);
    		alert.getDialogPane().setMinHeight(Region.USE_PREF_SIZE);
    		alert.show();
		}
    }
}
