package P1;

/*
 * Created by mjone121 on 3/22/2016.
 * Button handlers are immediate action event
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

public class FX10 extends Application{

    @Override
    public void start(Stage primaryStage) throws Exception {
        VBox prop = new VBox(20);
        prop.setPadding(new Insets(20, 20, 20, 20));

        Button rise = new Button("Up");
        rise.setPrefWidth(150);
        rise.setOnAction(new EventHandler<ActionEvent>(){

                @Override
                public void handle(ActionEvent event) {
                    Alert rule1 = new Alert(Alert.AlertType.INFORMATION);
                    rule1.setTitle("FX0-0");
                    rule1.setHeaderText(null);
                    rule1.setContentText("Up Button Pressed");

                    rule1.showAndWait();
                }
        });

        Button fall = new Button("Down");
        fall.setPrefWidth(150);
        fall.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                Alert rule1 = new Alert(Alert.AlertType.INFORMATION);
                rule1.setTitle("FX0-0");
                rule1.setHeaderText(null);
                rule1.setContentText("Down Button Pressed");

                rule1.showAndWait();
            }
        });

        prop.getChildren().addAll(rise,fall);

        Scene alack = new Scene(prop);
        primaryStage.setTitle("FX0-0");
        primaryStage.setResizable(false);
        primaryStage.setScene(alack);
        primaryStage.show();

    }

}

