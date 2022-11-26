package Controllers;

import java.io.IOException;
import java.lang.ModuleLayer.Controller;
import java.sql.SQLException;
import java.util.List;

import Functions.Functions;
import Models.Database;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuItem;
import javafx.scene.control.MultipleSelectionModel;
import javafx.scene.image.ImageView;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;

public class MainController {

    @FXML
    private Label analyze;

    @FXML
    private Button authButton;

    @FXML
    private Label nutrition;

    @FXML
    private Label settings;

    @FXML
    private Label identy;
    
    //@FXML
    //void showAuthForm(ActionEvent event) {

    //}
    public MainController() {
        this.func = new Functions();
    }

    private Functions func;

    @FXML
    void showAuthForm() throws IOException {
        func.showForm("/Views/FormAuth.fxml", "bazFitness - Окно авторизации", false);
    }
}
