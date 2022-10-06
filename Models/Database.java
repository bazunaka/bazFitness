package Models;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class Database {
    public static Connection conn;

    public static Connection Connect() throws SQLException, ClassNotFoundException {
        conn = null;
        Class.forName("org.sqlite.JDBC");
        conn = DriverManager.getConnection("jdbc:sqlite:bazFitness.db");

        System.out.println("База Подключена!");

        return conn;
    }

    public static void InsertDB() throws SQLException {
        Statement statement = conn.createStatement();
        statement.execute("INSERT INTO 'Accounts' ('AccountName', 'AccountPswd') VALUES('admin', 'admin');");
        System.out.println("Add success!");
    }

    public static List<String> SelectMG() throws SQLException {
        Statement statement = conn.createStatement();
        ResultSet result = statement.executeQuery("SELECT * FROM MuscleGroups mg;");
        List<String> mg = new ArrayList<String>();
        while (result.next()) {
            String name = result.getString(2);
            mg.add(name);
        }
        return mg;
    }
}
