import java.sql.SQLException;
import java.util.List;

import Models.Database;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.MenuItem;
import javafx.scene.control.MultipleSelectionModel;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;

public class MainController {

    public MainController() {
        this.selectMG = new MenuItem();
        this.lstView = new ListView<>();
        this.leftStatus = new Label();
        this.imageWorkout = new ImageView();
    }

    @FXML
    private MenuItem selectMG;
    @FXML
    private Label lbl;
    @FXML
    private ListView<String> lstView;
    @FXML
    private Label leftStatus;
    @FXML
    private ImageView imageWorkout;

    @FXML
    private void click_selectMG(ActionEvent e) throws SQLException {
        if (lstView.getItems() != null) {
            lstView.getItems().clear();
        }

        lbl.setText("Группы мышц");
        List<String> mg = Database.SelectMG();
        ObservableList<String> str = FXCollections.<String>observableArrayList(mg);

        lstView.getItems().addAll(str);
        selectedItems();
    }

    @FXML
    private void click_selectWorkout(ActionEvent e) throws SQLException {
        if (lstView.getItems() != null) {
            lstView.getItems().clear();
        }

        lbl.setText("Упражнения");
        List<String> workout = Database.SelectWorkout();
        ObservableList<String> str = FXCollections.<String>observableArrayList(workout);

        lstView.getItems().addAll(str);
        selectedItems();

        Image img = new Image("http://sportwiki.to/images/thumb/b/be/Scott.jpg/120px-Scott.jpg");
        imageWorkout.setImage(img);
    }

    @FXML
    private void selectedItems() {
        MultipleSelectionModel<String> multipleSelectMode = lstView.getSelectionModel();
        multipleSelectMode.selectedItemProperty().addListener(new ChangeListener<String>() {

            public void changed(ObservableValue<? extends String> changed, String oldValue, String newValue) {

                leftStatus.setText("Selected: " + newValue);
            }
        });
    }

    @FXML
    private void someFunc() throws SQLException {
        System.out.println(leftStatus.getText());
    }
}
