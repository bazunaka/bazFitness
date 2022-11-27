package Controllers;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import Models.Database;

public class MainController {

    @FXML
    private Label references;

    @FXML
    public ImageView referencesImage;

    @FXML
    private Label account;
    
    @FXML
    private Label training;

    @FXML
    private Label analyze;

    @FXML
    private Button authButton;

    @FXML
    private Label nutrition;

    @FXML
    private Label settings;

    @FXML
    public Label identy;

    @FXML
    protected void initialize() throws ClassNotFoundException, IOException, SQLException {
        List<String> menus = Database.SelectDB("SELECT MenuName FROM Menus;", 1);
        references.setText((String) menus.get(0));
        account.setText((String) menus.get(1));
        training.setText((String) menus.get(2));
        analyze.setText((String) menus.get(3));
        nutrition.setText((String) menus.get(4));
        settings.setText((String) menus.get(5));
    }

    @FXML
    void showAuthForm() throws IOException {

    }
    
}
