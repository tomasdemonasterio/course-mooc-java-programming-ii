package title;

import javafx.application.Application;
import javafx.application.Application.Parameters;
import javafx.stage.Stage;

public class UserTitle extends Application {
    public void start(Stage window) {
        Parameters params = getParameters();
       
        
        window.setTitle(getParameters().getNamed().get("title"));
        window.show();
    }

}
