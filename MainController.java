import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.MenuItem;
import javafx.scene.control.Label;

public class MainController {

    public MainController() {
        this.selectMG = new MenuItem();
    }

    @FXML
    private MenuItem selectMG;
    @FXML
    private Label lbl;

    @FXML
    private void click(ActionEvent e) {
        lbl.setText("value");
    }
}
