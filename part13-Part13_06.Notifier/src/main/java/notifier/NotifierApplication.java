package notifier;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.layout.VBox;
import javafx.scene.control.TextField;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class NotifierApplication extends Application {
    
    public void start(Stage window) {
        TextField textField = new TextField();
        Button button = new Button("Update");
        Label label = new Label();
        
        button.setOnAction((event) -> {label.setText(textField.getText());});
        
        VBox Vbox = new VBox();
        Vbox.getChildren().addAll(textField, button, label);
        
        window.setScene(new Scene(Vbox));
        window.show();
    }

    public static void main(String[] args) {
        launch(NotifierApplication.class);
    }

}
