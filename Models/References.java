package Models;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class References {
    public int ReferencesID = 0;
    public int MenusID = 1;
    public String ReferencesName = "";

    public List<String> SelectReferences(int MenusID, Connection conn) throws SQLException {
        Statement statement = conn.createStatement();
        ResultSet result = statement.executeQuery(
                "SELECT r.ReferencesName FROM 'References' r WHERE r.MenuID = '" + MenusID + "';");
        List<String> references = new ArrayList<String>();
        while (result.next()) {
            String name = result.getString(1);
            references.add(name);
        }
        return references;
    } 

    public ResultSet SelectReferences(Connection conn) throws SQLException {
        String sql = "SELECT * FROM 'Workouts';";
        ResultSet rs = conn.createStatement().executeQuery(sql);
        return rs;
    }

    public static void InsertReferences(int MenusID, String ReferencesName, Connection conn) throws SQLException {
        Statement statement = conn.createStatement();
        statement.execute("INSERT INTO 'References' ('MenuID', 'ReferencesName') VALUES('" + MenusID + "', '" + ReferencesName + "');");
    }
}
