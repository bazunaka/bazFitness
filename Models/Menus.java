package Models;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import org.sqlite.SQLiteConnection;

public class Menus {
    public int MenuID;
    public String MenuName;
    public String MenuUrl;
    public String QueryDB;

    public static List<String> SelectMenu(String query, int columnIndex, SQLiteConnection conn) throws SQLException {
        Statement statement = conn.createStatement();
        ResultSet result = statement.executeQuery(query);
        List<String> lst = new ArrayList<String>();
        while (result.next()) {
            String name = result.getString(columnIndex);
            lst.add(name);
        }
        return lst;
    }
}
