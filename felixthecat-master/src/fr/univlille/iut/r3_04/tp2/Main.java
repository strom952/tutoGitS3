package fr.univlille.iut.r3_04.tp2;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage stage) {
        stage.setTitle("Felix The Cat");
        Group root = new Group();
        Canvas canvas = new Canvas(500, 250);
        GraphicsContext gc = canvas.getGraphicsContext2D();
        new Felix().drawOn(gc);
        // Circle
        gc.setFill(Color.GRAY);
        gc.fillOval(50, 25, 200, 200);
        gc.setFill(Color.BLUE);
        gc.fillOval(100, 75, 25, 25);
        gc.setFill(Color.BLUE);
        gc.fillOval(175, 75, 25, 25);
        // Triangle
        gc.setFill(Color.GREEN);
        gc.fillPolygon(new double[]{70, 95, 130}, new double[]{60, 10, 30}, 3);
        //
        root.getChildren().add(canvas);
        stage.setScene(new Scene(root));
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }

}