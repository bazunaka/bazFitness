import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.MenuItem;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;

public class MainController {

    public MainController() {
        this.selectMG = new MenuItem();
    }

    @FXML
    private MenuItem selectMG;
    @FXML
    private Label lbl;
    @FXML
    private ListView lstView;

    @FXML
    private void click(ActionEvent e) {
        lstView.getItems().add("asdasd");
    }
}
