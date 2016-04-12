package P2;

/*
 * Created by mjone121 on 3/22/2016.
 * Button handler is atatched to both buttons
 */

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Elevator extends Application{
Button rise, fall;

    @Override
    public void start(Stage primaryStage) throws Exception {
        VBox prop = new VBox(20);
        prop.setPadding(new Insets(20, 20, 20, 20));

        rise = new Button("Up");
        rise.setPrefWidth(150);
        ButtonHandler execute = new ButtonHandler();
        rise.setOnAction(execute);
        fall = new Button("Down");
        fall.setPrefWidth(150);
        fall.setOnAction(execute);

        prop.getChildren().addAll(rise,fall);

        Scene alack = new Scene(prop);
        primaryStage.setTitle("FX0-0");
        primaryStage.setResizable(false);
        primaryStage.setScene(alack);
        primaryStage.show();

    }


    class ButtonHandler implements EventHandler<ActionEvent> {
    
        @Override
        public void handle(ActionEvent event) {
            String message;
            event.getSource();
            Alert rule1 = new Alert(Alert.AlertType.INFORMATION);
            rule1.setTitle("FX0-0");
            rule1.setHeaderText(null);
            if (event.getSource() == rise) message = "Up button pressed";
            else message = "Down button pressed";
            rule1.setContentText(message);
    
            rule1.showAndWait();
        }
    }
}
