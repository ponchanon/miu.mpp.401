package level1_1n2;
	
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.HBox;
import javafx.geometry.Insets;
import javafx.geometry.Pos;


public class AddressForm extends Application {
	
	@Override
	public void start(Stage primaryStage) {
		int lblWidthMin = 170;
		int txtWidth = 170;
		int lblHeight = 25;
		try {
			FlowPane flowpane = new FlowPane(); //(FlowPane)FXMLLoader.load(getClass().getResource("Sample.fxml"));
			flowpane.setAlignment(Pos.TOP_CENTER);
			flowpane.getStyleClass().add("pane");
			flowpane.setPadding(new Insets(10,15,0,15));//top, right, bottom, left
			
						
			Label lblName = new Label("Name");
			lblName.setPrefSize(lblWidthMin, lblHeight);
			Label lblStreet = new Label("Street");
			lblStreet.setPrefSize(lblWidthMin, lblHeight);
			Label lblCity = new Label("City");
			lblCity.setPrefSize(lblWidthMin, lblHeight);
			Label lblState = new Label("State");
			lblState.setPrefSize(lblWidthMin + 10 , lblHeight);
			Label lblZip = new Label("Zip");
			lblZip.setPrefSize(lblWidthMin+ 10, lblHeight);
			
			TextField txtName = new TextField();
			txtName.setPrefSize(txtWidth, lblHeight);
			TextField txtStreet = new TextField();
			txtStreet.setPrefSize(txtWidth, lblHeight);
			TextField txtCity = new TextField();
			txtCity.setPrefSize(txtWidth, lblHeight);
			TextField txtState = new TextField();
			txtState.setPrefSize(txtWidth + 8, lblHeight);
			TextField txtZip = new TextField();
			txtZip.setPrefSize(txtWidth + 8, lblHeight);
			
			Button btnSubmit = new Button("Submit");
			btnSubmit.setPrefWidth(100);
			HBox hbBtn = new HBox(10);
			hbBtn.setPrefWidth(txtWidth);
			hbBtn.setAlignment(Pos.BOTTOM_CENTER);
			hbBtn.getChildren().add(btnSubmit);	
			
		    // final Text actiontarget = new Text();
	        //Text actiontarget = new Text();
			
			flowpane.getChildren().add(lblName);
			flowpane.getChildren().add(lblStreet);
			flowpane.getChildren().add(lblCity);
			flowpane.getChildren().add(txtName);
			flowpane.getChildren().add(txtStreet);
			flowpane.getChildren().add(txtCity);
			
			flowpane.getChildren().add(lblState);
			flowpane.getChildren().add(lblZip);
			flowpane.getChildren().add(txtState);
			flowpane.getChildren().add(txtZip);
			flowpane.getChildren().add(hbBtn);	
			
			
			
			btnSubmit.setOnAction(new EventHandler<ActionEvent>() {
				@Override
				public void handle(ActionEvent e) {
					if(txtName.getText() != "" && txtStreet.getText() != "" && txtCity.getText() != "" && txtState.getText() != "" && txtZip.getText() != "") {
						System.out.println(txtName.getText() 
								+ "\n" + txtStreet.getText() 
								+ "\n" + txtCity.getText() 
								+ ", " + txtState.getText() 
								+ " " + txtZip.getText());
					}else {
						System.out.println("Pls enter all fields in address form.");						
					}
				}
			});
			
			Scene scene = new Scene(flowpane,550,210);	
			scene.getStylesheets().add(getClass().getResource("addressform.css").toExternalForm());
			primaryStage.setTitle("Address Form");
			primaryStage.setScene(scene);
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
