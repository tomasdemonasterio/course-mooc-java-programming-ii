package textstatistics;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.scene.control.TextArea;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;


public class TextStatisticsApplication extends Application {
    
    public void start(Stage window) {
        HBox hbox = new HBox();
        hbox.getChildren().add(new Label("Letters: 0"));
        hbox.getChildren().add(new Label("Words: 0"));
        hbox.getChildren().add(new Label("The longest word is:"));
        
        BorderPane layout = new BorderPane();
        layout.setCenter(new TextArea("This is a TextArea"));
        layout.setBottom(hbox);
        
        Scene scene = new Scene(layout);
        window.setScene(scene);
        window.show();
    }


    public static void main(String[] args) {
        launch(TextStatisticsApplication.class);
    }

}
