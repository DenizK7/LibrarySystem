package application;
	
import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Group;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.Text;


public class Main extends Application {
	@Override
	public void start(Stage stage) throws IOException {
			Parent root = FXMLLoader.load(getClass().getResource("/Mainwievv.fxml"));
			
			//Group root = new Group();
			Scene scene = new Scene(root,Color.WHITE);//in there we are creating scene and we can change scene color
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			//Text text = new Text();
//			text.setText("wtf dude");
//			text.setFont(Font.font("Verdana",50));
//			text.setFill(Color.BLACK);
//			text.setX(50);
//			text.setY(50);
//			root.getChildren().add(text);
//			
//			
			Image icon = new Image("book_icon.png");//program icon
			stage.getIcons().add(icon);
			stage.setTitle("library Management");// we are giving name the program
//			stage.setWidth(1240);
//			stage.setHeight(840);
			//stage.setResizable(false);//when we activate this we cant change size of the screen
			//stage.setFullScreen(true);
			
			stage.setScene(scene);
			stage.show();
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
