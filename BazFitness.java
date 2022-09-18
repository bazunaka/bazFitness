import java.sql.SQLException;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.Group;
import javafx.scene.text.Text;

import Models.Database;

public class BazFitness extends Application {

    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        // System.out.println("Hello World!");

        // Database.Connect();

        // Database.InsertDB();

        launch(args);
    }

    @Override
    public void start(Stage stage) {

        // установка надписи
        Text text = new Text("Hello METANIT.COM!");
        text.setLayoutY(80); // установка положения надписи по оси Y
        text.setLayoutX(80); // установка положения надписи по оси X

        Group group = new Group(text);

        Scene scene = new Scene(group);
        stage.setScene(scene);
        stage.setTitle("JavaFX Application");
        stage.setWidth(300);
        stage.setHeight(250);
        stage.show();
    }
}
