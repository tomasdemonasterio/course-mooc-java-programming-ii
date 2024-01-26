package textstatistics;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.control.TextArea;
import javafx.scene.control.Label;
import java.util.Arrays;

public class TextStatisticsApplication extends Application {
    
    public void start(Stage window) {
        TextArea textArea = new TextArea();
        textArea.setMinHeight(100);
        Label letters = new Label("Letters: 0");
        Label words = new Label("Words: 0");
        Label longest = new Label("The longest word is: ");
        
        
        
        textArea.textProperty().addListener((change, oldValue, newValue) -> {
            letters.setText("Letters: " + newValue.length());
            String[] wordsArray = newValue.split(" ");
            words.setText("Words: " + wordsArray.length);
            String longestWord = Arrays.stream(wordsArray)
                    .sorted((s1, s2) -> s2.length() - s1.length())
                    .findFirst()
                    .get();
            longest.setText("The longest word is: " + longestWord);
        });
        
        HBox hbox = new HBox();
        hbox.getChildren().addAll(letters, words, longest);
        hbox.setSpacing(50);
        
        BorderPane borderPane = new BorderPane();
        borderPane.setCenter(textArea);
        borderPane.setBottom(hbox);
        
        window.setScene(new Scene(borderPane));
        window.show();
    }

    public static void main(String[] args) {
        launch(TextStatisticsApplication.class);
    }

}
