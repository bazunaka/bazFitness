import java.io.IOException;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Functions {

    void showForm(String pathFile, String titleName, Boolean resize) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource(pathFile));

        Stage stage = new Stage();
        stage.setScene(new Scene(root));
        stage.setTitle(titleName);
        stage.setResizable(resize);
        stage.show();
    }
}