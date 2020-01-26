package sr222qn_assign2;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.shape.Line;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;

public class Snowman extends Application {
	public void start(Stage primaryStage) {
		Group gr = new Group();

		Rectangle snowmanSky = new Rectangle();
		snowmanSky.setHeight(350);
		snowmanSky.setWidth(800);

		snowmanSky.setFill(Color.DEEPSKYBLUE);

		Circle button1 = new Circle(395, 235, 3);
		button1.setFill(Color.BLACK);
		Circle button2 = new Circle(395, 250, 3);
		button2.setFill(Color.BLACK);
		Circle button3 = new Circle(395, 265, 3);
		button3.setFill(Color.BLACK);

		Circle bottomBody = new Circle(395, 320, 50);
		bottomBody.setFill(Color.WHITE);
		Circle midBody = new Circle(395, 250, 40);
		midBody.setFill(Color.WHITE);
		Circle topBody = new Circle(395, 190, 30);
		topBody.setFill(Color.WHITE);

		Circle eyeLeft = new Circle(380, 190, 3);
		eyeLeft.setFill(Color.BLACK);
		Circle eyeRight = new Circle(410, 190, 3);
		eyeRight.setFill(Color.BLACK);
		Line mouthCircle = new Line(390, 200, 400, 200);
		mouthCircle.setFill(Color.BLACK);

		Circle sunCircle = new Circle(700, 70, 50);
		sunCircle.setFill(Color.YELLOW);

		gr.getChildren().addAll(snowmanSky, bottomBody, midBody, button1, button2, button3, topBody, eyeLeft, eyeRight,
				mouthCircle, sunCircle);
		Scene sc = new Scene(gr, 800, 500);
		primaryStage.setTitle("Snowman Picture");
		primaryStage.setScene(sc);
		primaryStage.show();
	}

	public static void main(String[] args) {
		launch(args);

	}
}
