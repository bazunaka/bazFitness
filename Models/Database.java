package Models;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Database {
    public static Connection conn;

    public static void Connect() throws SQLException, ClassNotFoundException {
        conn = null;
        Class.forName("org.sqlite.JDBC");
        conn = DriverManager.getConnection("jdbc:sqlite:bazFitness.db");

        System.out.println("База Подключена!");
    }

    public static void InsertDB() throws SQLException {
        Statement statement = conn.createStatement();
        statement.execute("INSERT INTO 'Accounts' ('AccountName', 'AccountPswd') VALUES('admin3', 'admin3');");
        System.out.println("Add success!");
    }
}
