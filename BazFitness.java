import java.io.IOException;
import java.sql.SQLException;

import Models.Database;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class BazFitness extends Application {

    /**
     * @param args
     * @throws SQLException
     * @throws ClassNotFoundException
     * @throws IOException
     */



    public static void main(String[] args) throws SQLException, ClassNotFoundException, IOException {
        Database.Connect();

        launch(args);
    }

    @Override
    public void start(Stage stage) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("/Views/FormAuth.fxml")); //"/Views/Main.fxml"
        stage.setScene(new Scene(root));
        stage.setTitle("bazFitness - Окно авторизации"); //"bazFitness - Фитнес приложение 0.1 - незарегистрировано!"
        stage.setResizable(false);
        stage.show();
    }
}
