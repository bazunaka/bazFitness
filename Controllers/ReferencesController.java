package Controllers;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TableView;
import javafx.scene.control.TreeView;

public class ReferencesController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button addRecord;

    @FXML
    private Button deleteRecord;

    @FXML
    private Button editRecord;

    @FXML
    private TreeView<?> listReferences;

    @FXML
    private TableView<?> tableReferences;

    @FXML
    void initialize() {

    }

}
