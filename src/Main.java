

/*
import javafx.application.*;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        // Load the FXML file
        Parent root = FXMLLoader.load(getClass().getResource("Bienvenue.fxml"));

        // Set up the stage
        primaryStage.setTitle("Bienvenue !");
        primaryStage.setScene(new Scene(root));
        primaryStage.show();

    }

    public static void main(String[] args) throws Exception {
        launch(args);
    }
}
*/



import javafx.application.*;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        // Load the FXML file
        FXMLLoader loader = new FXMLLoader(getClass().getResource(".\\View\\Bienvenue.fxml"));
        Parent root = loader.load();
        
        // Access the controller
        //AgendaController agendaController = loader.getController();

        // Set up the stage
        primaryStage.setTitle("Bienvenue !");
        primaryStage.setScene(new Scene(root));
        primaryStage.show();
        primaryStage.setResizable(false);

    }

    public static void main(String[] args) {
        launch(args);
    }
}
