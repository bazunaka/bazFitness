import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.Scanner;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import Models.Database;

public class BazFitness extends Application {

    /**
     * @param args
     * @throws SQLException
     * @throws ClassNotFoundException
     * @throws IOException
     */
    public static void main(String[] args) throws SQLException, ClassNotFoundException, IOException {
        Database.Connect();

        /*
         * Scanner file;
         * PrintWriter writer;
         * 
         * file = new Scanner(new File("Data/shoulders.txt"));
         * writer = new PrintWriter("Data/shoulders_new.txt");
         * 
         * while (file.hasNext()) {
         * String line = file.nextLine();
         * if (!line.isEmpty()) {
         * writer.write(line);
         * writer.write("\n");
         * }
         * }
         * 
         * file.close();
         * writer.close();
         */

        /*
         * Try start Python script from Java.
         * try {
         * String cmd =
         * "python3 /Users/andrejsuvorov/Documents/GitHub/bazFitness/bazFitness_parsing.py"
         * ;
         * Process p = new ProcessBuilder(cmd).start();
         * p.waitFor();
         * } catch (InterruptedException e) {
         * e.printStackTrace();
         * }
         */

        launch(args);
    }

    @Override
    public void start(Stage stage) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("/Views/Main.fxml"));

        stage.setScene(new Scene(root));
        stage.show();

    }
}
