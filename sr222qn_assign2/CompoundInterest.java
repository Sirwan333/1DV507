package sr222qn_assign2;

import javafx.application.Application;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.geometry.Insets;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.text.Font;
import javafx.stage.Stage;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class CompoundInterest extends Application {
	public void start(Stage status) {
		status.setTitle("Compound Interest Calculator");
		Group gr = new Group();

		VBox theBox = new VBox();
		theBox.setPadding(new Insets(7, 7, 7, 7));
		theBox.setSpacing(7);

		Label head = new Label("Compound Interest");
		head.setFont(new Font("Comfortaa", 42));

		GridPane gp = new GridPane();
		gp.setPadding(new Insets(11.5, 12.5, 13.5, 14.4));
		gp.setHgap(5.5);
		gp.setVgap(5.5);
		gp.add(new Label("Start amount: "), 0, 0);
		final TextField startAmount = new TextField();
		gp.add(startAmount, 2, 0);
		gp.add(new Label("Interest: "), 0, 1);
		final TextField interest = new TextField();
		gp.add(interest, 2, 1);
		gp.add(new Label("Number of years: "), 0, 2);
		final TextField year = new TextField();
		gp.add(year, 2, 2);

		Button cal = new Button("Calculate!");
		gp.add(cal, 0, 3);

		Label counter = new Label();
		gp.add(counter, 0, 4);

		cal.setOnAction(e -> {
			counter.setText("In total that will be " + (Math.round(Double.valueOf(startAmount.getText())
					* Math.pow((1 + (Double.valueOf(interest.getText()) / 100)), Double.valueOf(year.getText())))));
		});
		theBox.getChildren().addAll(head, gp);
		Scene sc = new Scene(gr, 400, 250);
		gr.getChildren().addAll(theBox);
		status.setScene(sc);
		status.show();
	}

	public static void main(String[] args) {
		launch(args);
	}
}


