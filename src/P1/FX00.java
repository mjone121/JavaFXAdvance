package P1;

/*
 * Created by mjone121 on 3/22/2016.
 */

import javafx.application.Application;
import javafx.event.*;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class FX00 extends Application{

    @Override
    public void start(Stage primaryStage) throws Exception {
        VBox prop = new VBox(20);
        prop.setPadding(new Insets(20, 20, 20, 20));

        Button rise = new Button("Up");
        rise.setPrefWidth(150);
        UpHandler lift = new UpHandler();
        rise.setOnAction(lift);

        Button fall = new Button("Down");
        fall.setPrefWidth(150);
        DownHandler drop = new DownHandler();
        fall.setOnAction(drop);

        prop.getChildren().addAll(rise,fall);

        Scene alack = new Scene(prop);
        primaryStage.setTitle("FX0-0");
        primaryStage.setResizable(false);
        primaryStage.setScene(alack);
        primaryStage.show();

    }
}

class UpHandler implements EventHandler<ActionEvent> {

    @Override
    public void handle(ActionEvent event) {
        Alert rule1 = new Alert(Alert.AlertType.INFORMATION);
        rule1.setTitle("FX0-0");
        rule1.setHeaderText(null);
        rule1.setContentText("Up Button Pressed");

        rule1.showAndWait();
    }
}


class DownHandler implements EventHandler<ActionEvent> {

    @Override
    public void handle(ActionEvent event) {
        Alert rule1 = new Alert(Alert.AlertType.INFORMATION);
        rule1.setTitle("FX0-0");
        rule1.setHeaderText(null);
        rule1.setContentText("Down Button Pressed");

        rule1.showAndWait();
    }
}

