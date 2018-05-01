import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Group;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

public class MainDriver extends Application{

private ImageView cards[]; 
 
	@Override
	public void start(Stage primaryStage) throws Exception {
		Parent pnt=FXMLLoader.load(getClass().getResource("MyModel.fxml")); 
		Image card[] = new Image[52];
		card[0] = new Image("10_of_clubs.png");
		card[1] = new Image("10_of_diamonds.png");
		for(int i = 0; i < card.length; i++) {
			cards[i] = new ImageView(card[i]);
			cards[i].setX(20);
			cards[i].setY(20);
		}

		Group gp = new Group(cards[0],pnt);
		Scene sn=new Scene(gp);
		primaryStage.setScene(sn);
		primaryStage.show();
	}
	
	public static void main(String[] a) {
		launch(a);
	}
}
