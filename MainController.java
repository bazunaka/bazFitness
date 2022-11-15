import java.sql.SQLException;
import java.util.List;

import javax.imageio.plugins.tiff.GeoTIFFTagSet;

import org.w3c.dom.events.MouseEvent;

import Models.Database;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuItem;
import javafx.scene.control.MultipleSelectionModel;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;

public class MainController {

    public MainController() {
        this.selectMG      = new MenuItem();
        this.lstView       = new ListView<>();
        this.leftStatus    = new Label();
        this.imageWorkout  = new ImageView();
        this.selectWorkout = new Menu();

        this.hands     = new MenuItem();
        this.shoulders = new MenuItem();
        this.chest     = new MenuItem();
        this.back      = new MenuItem();
        this.foots     = new MenuItem();
        this.buttocks  = new MenuItem();
        this.press     = new MenuItem();
        this.cardio    = new MenuItem();

        this.selectTP  = new MenuItem();
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
    private Menu selectWorkout;

    @FXML
    private MenuItem hands;
    @FXML
    private MenuItem shoulders;
    @FXML
    private MenuItem chest;
    @FXML
    private MenuItem back;
    @FXML
    private MenuItem foots;
    @FXML
    private MenuItem buttocks;
    @FXML
    private MenuItem press;
    @FXML
    private MenuItem cardio;

    @FXML
    private MenuItem selectTP;

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

        
        //List<String> workout = Database.SelectWorkout();
        //ObservableList<String> str = FXCollections.<String>observableArrayList(workout);

        //lstView.getItems().addAll(str);
        //selectedItems();
    }

    @FXML
    private void click_selectHands(ActionEvent e) throws SQLException {
        if (lstView.getItems() != null) {
            lstView.getItems().clear();
        }
      
        lbl.setText(hands.getText());
        
        List<String> workout = Database.SelectWorkout(hands.getText());
        ObservableList<String> str = FXCollections.<String>observableArrayList(workout);

        lstView.getItems().addAll(str);
        selectedItems();

    }

    @FXML
    private void click_selectShoulders(ActionEvent e) throws SQLException {
        if (lstView.getItems() != null) {
            lstView.getItems().clear();
        }
     
        lbl.setText(shoulders.getText());
        
        List<String> workout = Database.SelectWorkout(shoulders.getText());
        ObservableList<String> str = FXCollections.<String>observableArrayList(workout);

        lstView.getItems().addAll(str);
        selectedItems();

    }

    @FXML
    private void click_selectChest(ActionEvent e) throws SQLException {
        if (lstView.getItems() != null) {
            lstView.getItems().clear();
        }
     
        lbl.setText(chest.getText());
        
        List<String> workout = Database.SelectWorkout(chest.getText());
        ObservableList<String> str = FXCollections.<String>observableArrayList(workout);

        lstView.getItems().addAll(str);
        selectedItems();

    }

    @FXML
    private void click_selectBack(ActionEvent e) throws SQLException {
        if (lstView.getItems() != null) {
            lstView.getItems().clear();
        }
     
        lbl.setText(back.getText());
        
        List<String> workout = Database.SelectWorkout(back.getText());
        ObservableList<String> str = FXCollections.<String>observableArrayList(workout);

        lstView.getItems().addAll(str);
        selectedItems();

    }

    @FXML
    private void click_selectFoots(ActionEvent e) throws SQLException {
        if (lstView.getItems() != null) {
            lstView.getItems().clear();
        }
     
        lbl.setText(foots.getText());
        
        List<String> workout = Database.SelectWorkout(foots.getText());
        ObservableList<String> str = FXCollections.<String>observableArrayList(workout);

        lstView.getItems().addAll(str);
        selectedItems();

    }

    @FXML
    private void click_selectButtocks(ActionEvent e) throws SQLException {
        if (lstView.getItems() != null) {
            lstView.getItems().clear();
        }
     
        lbl.setText(buttocks.getText());
        
        List<String> workout = Database.SelectWorkout(buttocks.getText());
        ObservableList<String> str = FXCollections.<String>observableArrayList(workout);

        lstView.getItems().addAll(str);
        selectedItems();

    }

    @FXML
    private void click_selectPress(ActionEvent e) throws SQLException {
        if (lstView.getItems() != null) {
            lstView.getItems().clear();
        }
     
        lbl.setText(press.getText());
        
        List<String> workout = Database.SelectWorkout(press.getText());
        ObservableList<String> str = FXCollections.<String>observableArrayList(workout);

        lstView.getItems().addAll(str);
        selectedItems();

    }

    @FXML
    private void click_selectCardio(ActionEvent e) throws SQLException {
        if (lstView.getItems() != null) {
            lstView.getItems().clear();
        }
     
        lbl.setText(cardio.getText());
        
        List<String> workout = Database.SelectWorkout(cardio.getText());
        ObservableList<String> str = FXCollections.<String>observableArrayList(workout);

        lstView.getItems().addAll(str);
        selectedItems();

    }

    @FXML
    private void click_selectTP(ActionEvent e) throws SQLException {
        if (lstView.getItems() != null) {
            lstView.getItems().clear();
        }

        lbl.setText(selectTP.getText());
        List<String> tp = Database.SelectTP();
        ObservableList<String> str = FXCollections.<String>observableArrayList(tp);

        lstView.getItems().addAll(str);
        selectedItems();
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

}
