package sr222qn_assign3;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.ColorPicker;
import javafx.scene.control.ComboBox;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class TinyPainter extends Application{
	
	 static Circle circle;
	 static Rectangle rectangle;
	 static Line line;
	 
	 Rectangle pos1 = new Rectangle(0,0,0,0);
	
	
	
	public void start(Stage primaryStage) {
		pos1.setVisible(false);
		Pane pane1 = new Pane();
		HBox pane2 = new HBox();
		pane2.setSpacing(5);
	
		ComboBox<String> shape = new ComboBox<String>();
		ComboBox<Double> size = new ComboBox<Double>();
		ColorPicker colour = new ColorPicker();
	
		shape.getItems().addAll("Circle","Rectangle","Line","Dot");
	
		size.getItems().addAll(1.0, 2.0, 4.0, 8.0, 16.0, 32.0, 40.0);
		size.getSelectionModel().selectFirst();
		shape.getSelectionModel().selectFirst();
		
		pane2.getChildren().addAll(shape,size,colour);
		pane1.setOnMousePressed(event -> {
				pos1.setVisible(true);
				pos1.setTranslateX(event.getX());
				pos1.setTranslateY(event.getY());
				if(shape.getValue() == "Rectangle")
				{
					rectangle = new Rectangle();
					rectangle.setFill(colour.getValue());
					rectangle.setTranslateX(event.getX());
					rectangle.setTranslateY(event.getY());
					pane1.getChildren().addAll(rectangle);
				}
				else if(shape.getValue() == "Circle") 
				{
					circle = new Circle();
					circle.setFill(colour.getValue());
					circle.setTranslateX(event.getX());
					circle.setTranslateY(event.getY());
					pane1.getChildren().addAll(circle);
				}
				else if(shape.getValue() == "Line") 
				{
					line = new Line();
					line.setStrokeWidth(size.getValue());
					line.setStroke(colour.getValue());;
					line.setStartX(event.getX());
					line.setStartY(event.getY());
					line.setEndX(event.getX());
					line.setEndY(event.getY());
					pane1.getChildren().addAll(line);
				}
				else if(shape.getValue() == "Dot") {
					rectangle = new Rectangle();
					rectangle.setWidth(size.getValue());
					rectangle.setHeight(size.getValue());
					rectangle.setFill(colour.getValue());
					rectangle.setTranslateX(event.getX()-size.getValue()/2);
					rectangle.setTranslateY(event.getY()-size.getValue()/2);
					pane1.getChildren().addAll(rectangle);
				}
			});
		
		pane1.setOnMouseDragged(event -> {
				pane2.toFront();
				if(shape.getValue() == "Rectangle") 
				{
					rectangle.setWidth((event.getX() - pos1.getTranslateX()));
					rectangle.setHeight((event.getY() - pos1.getTranslateY()));
				}
				else if(shape.getValue() == "Circle") 
				{
					double x = event.getX() - pos1.getTranslateX();
					double y = event.getY() - pos1.getTranslateY();
					double r = Math.sqrt((Math.pow(x, 2)) + (Math.pow(y, 2)));
					circle.setRadius(r);
				}
				else if(shape.getValue() == "Line") 
				{
					line.setEndX((event.getX()));
					line.setEndY((event.getY()));
				}
			});

		pane1.getChildren().addAll(pane2);
		Scene sc = new Scene(pane1,900,750);
		primaryStage.setTitle("TinyPainter");
		primaryStage.setScene(sc);
		primaryStage.show();
	}
	
	public static void main(String[] args) {
		launch(args);
	}

}