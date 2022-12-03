package Controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TableView;
import javafx.scene.control.TreeView;

public class ReferencesController {

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

    @FXML
    void addRecord(ActionEvent event) {
        //Add record in table 
    }

    @FXML
    void deleteRecord(ActionEvent event) {
        //Delete record from table
    }

    @FXML
    void editRecord(ActionEvent event) {
        //Edit record in table
    }

}
