import java.io.IOException;
import java.sql.SQLException;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.Parent;
import Models.Database;

public class BazFitness extends Application {

    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        Database.Connect();

        Database.InsertDB();

        launch(args);
    }

    @Override
    public void start(Stage stage) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("/Views/Main.fxml"));

        stage.setScene(new Scene(root));
        stage.show();
    }
}
