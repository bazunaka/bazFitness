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
        ResultSet result = statement.executeQuery("SELECT * FROM MuscleGroups mg ;");
        List<String> mg = new ArrayList<String>();
        while (result.next()) {
            String name = result.getString(2);
            mg.add(name);
        }
        return mg;
    }

    public static List<String> SelectWorkout() throws SQLException {
        Statement statement = conn.createStatement();
        ResultSet result = statement.executeQuery("SELECT * FROM Workouts w ;");
        List<String> workout = new ArrayList<String>();
        while (result.next()) {
            String name = result.getString(2);
            workout.add(name);
        }
        return workout;
    }

    public static List<String> SelectWorkout(String nameMG) throws SQLException {
        Statement statement = conn.createStatement();
        ResultSet result = statement.executeQuery(
                "SELECT w.WorkoutName FROM Workouts w, MuscleGroups mg WHERE mg.GroupName = '" + nameMG + "' ;");
        List<String> workout = new ArrayList<String>();
        while (result.next()) {
            String name = result.getString(1);
            workout.add(name);
        }
        return workout;
    }
}

https:// yandex.ru/images/search?from=tabbar&text=Сгибания%20рук%20на%20скамье%20Скотта
https:// yandex.ru/images/search?text=Подъем%20штанги%20на%20скамье%20Скотта&from=tabbar
https:// yandex.ru/images/search?text=Подъем%20штанги%20на%20скамье%20Скотта&from=tabbar&pos=1&img_url=http%3A%2F%2Falfagym.ru%2Fwp-content%2Fuploads%2Fc%2F6%2F7%2Fc67171f8f8c593f27aad29a2cd9582e5.jpeg&rpt=simage&lr=213