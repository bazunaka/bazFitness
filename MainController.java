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

        // WebView browser = new WebView();

        // WebEngine webEngine = browser.getEngine();

        // webEngine.load("http://ya.ru");

    }

    @FXML
    private void selectedItems() {
        MultipleSelectionModel<String> multipleSelectMode = lstView.getSelectionModel();
        multipleSelectMode.selectedItemProperty().addListener(new ChangeListener<String>() {

            public void changed(ObservableValue<? extends String> changed, String oldValue, String newValue) {

                leftStatus.setText(newValue);
            }
        });

    }

    @FXML
    private void someFunc() throws SQLException {
        System.out.println(leftStatus.getText());
        // if (lstView.getFocusModel().getFocusedIndex() == 0) {
        // Image img = new Image(
        // "Images/1.png");
        // imageWorkout.setImage(img);
        // } else if (lstView.getFocusModel().getFocusedIndex() == 1) {
        // Image img = new Image(
        // "Images/2.jpeg");
        // imageWorkout.setImage(img);
        // } else if (lstView.getFocusModel().getFocusedIndex() == 2) {
        // Image img = new Image(
        // "Images/3.png");
        // imageWorkout.setImage(img);
        // } else if (lstView.getFocusModel().getFocusedIndex() == 3) {
        // Image img = new Image(
        // "Images/4.jpeg");
        // imageWorkout.setImage(img);
        // }
        lstView.getSelectionModel().selectedIndexProperty().addListener(new ChangeListener<Number>() {

            @Override
            public void changed(ObservableValue<? extends Number> observable, Number oldValue, Number newValue) {
                Image img = new Image("Images/" + newValue + ".jpeg");
                imageWorkout.setImage(img);
            }

        });
        // Image img = new Image("Images/" + lstView.selectedID() + ".jpeg");
        // imageWorkout.setImage(img);
    }
}
