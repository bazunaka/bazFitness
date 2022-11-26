package Controllers;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;
import java.sql.SQLException;

import Models.Accounts;

public class AuthController {

    @FXML
    private Button authButton;

    @FXML
    private TextField login;

    @FXML
    private PasswordField password;

    private Accounts accounts = new Accounts();

    @FXML
    void checkAuth() throws IOException, ClassNotFoundException, SQLException {
        accounts.AccountName = login.getText();
        accounts.AccountPswd = password.getText();
        accounts.AccountQuery = "SELECT COUNT(*) FROM Accounts WHERE AccountName = '" + accounts.AccountName + "' And AccountPswd = '" + accounts.AccountPswd + "';";

        if(accounts.CheckAccount(accounts.AccountQuery, 1, Models.Database.Connect())) {
            Stage stage = (Stage) authButton.getScene().getWindow();
            stage.close();


        };
    }
}