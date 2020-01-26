package sr222qn_assign2;

import java.util.ArrayList;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class Yahtzee extends Application {
	int rolls = 3;

	public static ImageView putImage(int n, double x, double y) {
		ImageView im = new ImageView();
		im.setLayoutX(x);
		im.setLayoutY(y);
		im.setFitWidth(36);
		im.setFitHeight(36);
		switch (n) {
		case 1:
			Image diec1 = new Image(
					"file:///C:\\Users\\serwa\\eclipse-workspace\\java_courses\\1DV507\\src\\sr222qn_assign2\\1.png");
			im.setImage(diec1);
			break;
		case 2:
			Image diec2 = new Image(
					"file:///C:\\Users\\serwa\\eclipse-workspace\\java_courses\\1DV507\\src\\sr222qn_assign2\\2.png");
			im.setImage(diec2);
			break;
		case 3:
			Image diec3 = new Image(
					"file:///C:\\Users\\serwa\\eclipse-workspace\\java_courses\\1DV507\\src\\sr222qn_assign2\\3.png");
			im.setImage(diec3);
			break;
		case 4:
			Image diec4 = new Image(
					"file:///C:\\Users\\serwa\\eclipse-workspace\\java_courses\\1DV507\\src\\sr222qn_assign2\\4.png");
			im.setImage(diec4);
			break;
		case 5:
			Image diec5 = new Image(
					"file:///C:\\Users\\serwa\\eclipse-workspace\\java_courses\\1DV507\\src\\sr222qn_assign2\\5.png");
			im.setImage(diec5);
			break;
		default:
			System.err.println("Invalid");
			break;
		}
		return im;
	}

	public void start(Stage stage) {
		Text title = new Text("Yahtzee");
		title.setLayoutX(8);
		title.setLayoutY(16);
		title.setFont(Font.font(20));

		Group group = new Group();
		group.getChildren().add(title);

		ArrayList<ImageView> images = new ArrayList<ImageView>();
		for (int k = 0; k < 5; k++) {
			ImageView imageView = putImage(k + 1, 8 + k * 36, 20);
			group.getChildren().add(imageView);
			images.add(imageView);
		}

		ArrayList<CheckBox> boxes = new ArrayList<CheckBox>();
		for (int k = 0; k < 5; k++) {
			CheckBox box = new CheckBox();
			box.setLayoutX(18 + k * 36);
			box.setLayoutY(61);
			box.setDisable(true);
			group.getChildren().add(box);
			boxes.add(box);
		}

		Text tx1 = new Text("You have 3 roll(s) left");
		tx1.setLayoutX(110);
		tx1.setLayoutY(105);
		group.getChildren().add(tx1);

		Button button = new Button("Roll the dice!");
		button.setLayoutX(8);
		button.setLayoutY(85);
		group.getChildren().add(button);

		ArrayList<Integer> dices = new ArrayList<Integer>();
		for (int i = 0; i < 5; i++) {
			dices.add(i);
		}

		button.setOnAction(e -> {
			--rolls;
			if (rolls >= 0) {

				for (int k = 0; k < 5; k++) {
					boxes.get(k).setDisable(false);
					if (!boxes.get(k).isSelected()) {
						int n = diec();
						images.get(k).setImage(new Image(
								"file:///C:\\Users\\serwa\\eclipse-workspace\\java_courses\\1DV507\\src\\sr222qn_assign2\\"
										+ n + ".png"));
						dices.set(k, n - 1);
					}
					tx1.setText("You have " + rolls + " roll(s) left");

				}
			}
			if (rolls == 0) {
				tx1.setText(calculateResult(dices));
			}

		});

		Scene scene = new Scene(group, 240, 115);
		stage.setScene(scene);
		stage.setTitle("Yatzhee");
		stage.show();
	}

	public static int diec() {
		int theValue = 0;
		theValue = (int) (Math.random() * 6 + 1);
		return theValue;
	}

	public static void main(String[] args) {
		launch(args);
	}

	private String calculateResult(ArrayList<Integer> list) {
		int[] diceCount = new int[6];
		for (int i = 0; i < list.size(); ++i) {
			++diceCount[list.get(i)];
		}

		// Yahtzee or Four of a kind
		for (int i = 0; i < diceCount.length; ++i) {
			if (diceCount[i] == 5) {
				return "Yahtzee";
			} else if (diceCount[i] == 4) {
				return "Four of a kind";
			}
		}

		boolean hasThree = false, hasPair = false;
		for (int i = 0; i < diceCount.length; ++i) {
			if (diceCount[i] == 3) {
				hasThree = true;
			} else if (diceCount[i] == 2) {
				hasPair = true;
			}
		}
		if (hasThree) {
			if (hasPair) {
				return "Full house";
			} else {
				return "Three of a kind";
			}
		}

		int straight = 0, position = 0;
		for (int i = 1; i < list.size(); ++i) {
			if (list.get(i) - list.get(i - 1) == 1) {
				++straight;
			} else {
				position = i;
			}
		}
		if (straight == 4) {
			return "Large straight";
		}
		if (straight == 3 && (position == 1 || position == 4)) {
			return "Small straight";
		}

		if (hasPair) {
			return "Pair";
		}

		return "chance";
	}

}
