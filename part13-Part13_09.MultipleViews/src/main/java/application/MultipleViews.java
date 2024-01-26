package application;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.scene.layout.GridPane;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class MultipleViews extends Application {
    
    public void start(Stage window) {
        // LAYOUTS
        BorderPane firstLayout = new BorderPane();
        VBox secondLayout = new VBox();
        GridPane thirdLayout = new GridPane();
        
        // VIEWS
        Scene firstView = new Scene(firstLayout);
        Scene secondView = new Scene(secondLayout);
        Scene thirdView = new Scene(thirdLayout);
        
        // ELEMENTS
         // FIRST VIEW
        Button firstButton = new Button("To the second view!");
        firstButton.setOnAction((event) -> window.setScene(secondView));
        firstLayout.setTop(new Label("First view!"));
        firstLayout.setCenter(firstButton);
        
         // SECOND VIEW
        Button secondButton = new Button("To the third view!");
        secondButton.setOnAction((event) -> window.setScene(thirdView));
        secondLayout.getChildren().addAll(secondButton, new Label("Second view!"));
        
         // THIRD VIEW
        Button thirdButton = new Button("To the first view!");
        thirdButton.setOnAction((event) -> window.setScene(firstView));
        thirdLayout.add(new Label("Third view!"), 0, 0);
        thirdLayout.add(thirdButton, 1, 1);
        
        window.setScene(firstView);
        window.show();
    }

    public static void main(String[] args) {
        launch(MultipleViews.class);
    }

}
