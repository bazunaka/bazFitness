package Controllers;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.control.TableView;

import java.sql.SQLException;

import Models.Database;
import Models.References;

public class ReferencesController {

    @FXML
    private Button addRecord;

    @FXML
    private Button deleteRecord;

    @FXML
    private Button editRecord;

    @FXML
    private ListView<String> listReferences;

    @FXML
    private TableView<?> tableReferences;

    References references = new References();

    @FXML
    void initialize() throws SQLException {
        references.MenusID = 1;
        ObservableList<String> oList = FXCollections.<String>observableList(references.selectReferences(references.MenusID, Database.conn));
        listReferences.getItems().addAll(oList);
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
