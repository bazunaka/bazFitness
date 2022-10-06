import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import Models.Database;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.MenuItem;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;

public class MainController {

    public MainController() {
        this.selectMG = new MenuItem();
        this.lstView = new ListView<>();
    }

    @FXML
    private MenuItem selectMG;
    @FXML
    private Label lbl;
    @FXML
    private ListView<String> lstView;

    @FXML
    private void click_selectMG(ActionEvent e) throws SQLException {
        lbl.setText("Группы мышц");
        List<String> mg = Database.SelectMG();
        ObservableList<String> str = FXCollections.<String>observableArrayList(mg);

        lstView.getItems().addAll(str);

    }

    @FXML
    private void click_selectWorkout(ActionEvent e) {
        lbl.setText("Упражнения");
    }
}
