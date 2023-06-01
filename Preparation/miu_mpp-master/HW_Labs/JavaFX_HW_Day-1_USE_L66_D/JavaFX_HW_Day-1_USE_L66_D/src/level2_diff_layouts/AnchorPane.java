package level2_diff_layouts;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;


public class AnchorPane extends Application {

    @Override
    public void start(Stage stage) {

        initUI(stage);
    }

    private void initUI(Stage stage) {

    	javafx.scene.layout.AnchorPane root = new javafx.scene.layout.AnchorPane();
       
        Button okBtn = new Button("OK");
        Button closeBtn = new Button("Close");
        HBox hbox = new HBox(5, okBtn, closeBtn);

        root.getChildren().addAll(hbox);
        
        javafx.scene.layout.AnchorPane.setRightAnchor(hbox, 10d);
        javafx.scene.layout.AnchorPane.setBottomAnchor(hbox, 10d);

        Scene scene = new Scene(root, 300, 200);

        stage.setTitle("Corner buttons");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}