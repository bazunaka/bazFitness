import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

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
import javafx.scene.control.Label;
import javafx.scene.control.ListView;

public class MainController {

    public MainController() {
        this.selectMG = new MenuItem();
        this.lstView = new ListView<>();
        this.leftStatus = new Label();
        this.imageWorkout = new ImageView();
        this.selectWorkout = new Menu();

        this.hands = new MenuItem();
        this.shoulders = new MenuItem();
        this.chest = new MenuItem();
        this.back = new MenuItem();
        this.foots = new MenuItem();
        this.buttocks = new MenuItem();
        this.press = new MenuItem();
        this.cardio = new MenuItem();

        this.selectTP = new MenuItem();

        this.func = new Functions();
    }

    private Functions func;

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
    private Menu auth;

    @FXML
    private MenuItem selectTP;

    @FXML
    private void click_selectMG(ActionEvent e) throws SQLException {
        if (lstView.getItems() != null) {
            lstView.getItems().clear();
        }

        lbl.setText("Группы мышц");
        List<String> mg = Database.SelectDB("SELECT * FROM MuscleGroups mg ;", 2);
        ObservableList<String> str = FXCollections.<String>observableArrayList(mg);

        lstView.getItems().addAll(str);
        selectedItems();
    }

    private void check_lstView() {
        if (lstView.getItems() != null) {
            lstView.getItems().clear();
        }
    }

    @FXML
    private void click_selectHands(ActionEvent e) throws SQLException {
        check_lstView();

        lbl.setText(hands.getText());

        List<String> workout = Database.SelectDB(
                "SELECT w.WorkoutName FROM Workouts w, MuscleGroups mg WHERE mg.GroupName = '" + hands.getText()
                        + "' AND w.GroupID = mg.GroupID ORDER BY w.WorkoutName ASC;",
                1);
        ObservableList<String> str = FXCollections.<String>observableArrayList(workout);

        lstView.getItems().addAll(str);
        selectedItems();

    }

    @FXML
    private void click_selectShoulders(ActionEvent e) throws SQLException {
        check_lstView();

        lbl.setText(shoulders.getText());

        List<String> workout = Database.SelectDB(
                "SELECT w.WorkoutName FROM Workouts w, MuscleGroups mg WHERE mg.GroupName = '" + shoulders.getText()
                        + "' AND w.GroupID = mg.GroupID ORDER BY w.WorkoutName ASC;",
                1);
        ObservableList<String> str = FXCollections.<String>observableArrayList(workout);

        lstView.getItems().addAll(str);
        selectedItems();

    }

    @FXML
    private void click_selectChest(ActionEvent e) throws SQLException {
        check_lstView();

        lbl.setText(chest.getText());

        List<String> workout = Database.SelectDB(
                "SELECT w.WorkoutName FROM Workouts w, MuscleGroups mg WHERE mg.GroupName = '" + chest.getText()
                        + "' AND w.GroupID = mg.GroupID ORDER BY w.WorkoutName ASC;",
                1);
        ObservableList<String> str = FXCollections.<String>observableArrayList(workout);

        lstView.getItems().addAll(str);
        selectedItems();

    }

    @FXML
    private void click_selectBack(ActionEvent e) throws SQLException {
        check_lstView();

        lbl.setText(back.getText());

        List<String> workout = Database.SelectDB(
                "SELECT w.WorkoutName FROM Workouts w, MuscleGroups mg WHERE mg.GroupName = '" + back.getText()
                        + "' AND w.GroupID = mg.GroupID ORDER BY w.WorkoutName ASC;",
                1);
        ObservableList<String> str = FXCollections.<String>observableArrayList(workout);

        lstView.getItems().addAll(str);
        selectedItems();

    }

    @FXML
    private void click_selectFoots(ActionEvent e) throws SQLException {
        check_lstView();

        lbl.setText(foots.getText());

        List<String> workout = Database.SelectDB(
                "SELECT w.WorkoutName FROM Workouts w, MuscleGroups mg WHERE mg.GroupName = '" + foots.getText()
                        + "' AND w.GroupID = mg.GroupID ORDER BY w.WorkoutName ASC;",
                1);
        ObservableList<String> str = FXCollections.<String>observableArrayList(workout);

        lstView.getItems().addAll(str);
        selectedItems();

    }

    @FXML
    private void click_selectButtocks(ActionEvent e) throws SQLException {
        check_lstView();

        lbl.setText(buttocks.getText());

        List<String> workout = Database.SelectDB(
                "SELECT w.WorkoutName FROM Workouts w, MuscleGroups mg WHERE mg.GroupName = '" + buttocks.getText()
                        + "' AND w.GroupID = mg.GroupID ORDER BY w.WorkoutName ASC;",
                1);
        ObservableList<String> str = FXCollections.<String>observableArrayList(workout);

        lstView.getItems().addAll(str);
        selectedItems();

    }

    @FXML
    private void click_selectPress(ActionEvent e) throws SQLException {
        check_lstView();

        lbl.setText(press.getText());

        List<String> workout = Database.SelectDB(
                "SELECT w.WorkoutName FROM Workouts w, MuscleGroups mg WHERE mg.GroupName = '" + press.getText()
                        + "' AND w.GroupID = mg.GroupID ORDER BY w.WorkoutName ASC;",
                1);
        ObservableList<String> str = FXCollections.<String>observableArrayList(workout);

        lstView.getItems().addAll(str);
        selectedItems();

    }

    @FXML
    private void click_selectCardio(ActionEvent e) throws SQLException {
        check_lstView();

        lbl.setText(cardio.getText());

        List<String> workout = Database.SelectDB(
                "SELECT w.WorkoutName FROM Workouts w, MuscleGroups mg WHERE mg.GroupName = '" + cardio.getText()
                        + "' AND w.GroupID = mg.GroupID ORDER BY w.WorkoutName ASC;",
                1);
        ObservableList<String> str = FXCollections.<String>observableArrayList(workout);

        lstView.getItems().addAll(str);
        selectedItems();

    }

    @FXML
    private void click_selectTP(ActionEvent e) throws SQLException {
        check_lstView();

        lbl.setText(selectTP.getText());
        List<String> tp = Database.SelectDB("SELECT * FROM TrainingPlan tg ;", 2);
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

    @FXML
    private void formAdd() throws IOException {
        func.showForm("/Views/FormAdd.fxml", "bazFitness - Добавить", true);
    }

    @FXML
    void showAuthForm() throws IOException {
        func.showForm("/Views/FormAuth.fxml", "bazFitness - Окно авторизации", false);
    }

}
