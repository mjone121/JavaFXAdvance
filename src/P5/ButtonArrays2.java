package P5;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/*
 * Created by mjone121 on 4/5/2016.
 */
public class ButtonArrays2 extends Application {
    int row = 2;
    int column = 5;
    Button[][] floors = new Button[column][row];

    @Override
    public void start(Stage primaryStage) throws Exception {

        Scene alack = new Scene(getPane(), 450, 700);
        primaryStage.setTitle("Button Array 2");
        primaryStage.setResizable(false);
        primaryStage.setScene(alack);
        primaryStage.show();

    }

    protected Pane getPane() {
        Pane Section1 = new VBox(20);
        Section1.setPadding(new Insets(40));
        for (int y = column - 1; y < floors.length - 1; y--) {
            for (int x = row - 1; x < floors[y].length - 1; x--) {
                floors[y][x] = new Button(Integer.toString((y + 1) * (x + 1)));

                floors[y][x].setStyle("-fx-font: 22 Arial; -fx-base: LightGray");
                floors[y][x].setPrefWidth(100);

                Section1.getChildren().add(floors[y][x]);
                floors[y][x].setOnAction(Motivation);
            }
        }
        return Section1;
    }

        EventHandler<ActionEvent> Motivation = event -> {
            Button b = (Button) event.getSource();

            int x = Integer.parseInt(b.getText());
            int y = Integer.parseInt(b.getText());

            floors[y - 1][x - 1].setStyle("-fx-font: 22 Arial; -fx-base: DarkRed");
        };
    }

