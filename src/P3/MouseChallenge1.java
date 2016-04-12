package P3;

import javafx.application.Application;
import javafx.geometry.Point2D;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

/*
 * Created by mjone121 on 3/24/2016.
 */
public class MouseChallenge1 extends Application{


    @Override
    public void start(Stage primaryStage) throws Exception {
        final double CircleX = 100;
        final double CircleY = 100;
        final double CircleR = 50;

        Circle prop = new Circle(CircleX, CircleY, CircleR);
        prop.setStroke(Color.BLACK);
        prop.setFill(Color.WHITE);

        StackPane take = new StackPane();
        take.maxWidth(500);
        take.maxHeight(500);
        take.getChildren().add(prop);

        Scene alack = new Scene(take);
        primaryStage.setTitle("Hot or cold");
        primaryStage.setScene(alack);
        primaryStage.show();

        take.setOnMouseMoved(e -> {
            System.out.println("x = " + (int) e.getX() + "y = " + (int) e.getY());
            Point2D motive = new Point2D(e.getSceneX(),e.getSceneY());

            if(prop.contains(motive))
                prop.setFill(Color.RED);
            else
                prop.setFill(Color.BLUE);
        });
    }
}
